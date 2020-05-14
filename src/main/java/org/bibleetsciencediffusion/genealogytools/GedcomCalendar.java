package org.bibleetsciencediffusion.genealogytools;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.gedcom4j.parser.DateParser;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GedcomCalendar {

    /**
     * Date of destruction of first temple
     */
    static Date HEBREW_REFERENCE_DATE;
    /**
     * Difference between pharisan calendar and codex judaica calendar
     */
    static int HEBREW_DIFFERENCE_YEARS = -164;
    static int HEBREW_DIFFERENCE_MONTHS = 0;
    static int HEBREW_DIFFERENCE_DAYS = -8;
    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,-587);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        HEBREW_REFERENCE_DATE = calendar.getTime();
    }


    public static void convertWithAD(File inputFile, File outputFile) {
        try {
            List<String> inputLines = FileUtils.readLines(inputFile);
            List<String> outputLines = new ArrayList<String>();
            for (String inputLine : inputLines) {
                int posDate = inputLine.indexOf(" DATE ");
                if (posDate > -1) {
                    String inputDateString = inputLine.substring(posDate +6);
                    String outputDateString = toAD(normalizeYear(inputDateString));
                    String outputLine = inputLine.substring(0,posDate+6) + outputDateString;
                    outputLines.add(outputLine);
                } else {
                    outputLines.add(inputLine);
                }
            }
            FileUtils.writeLines(outputFile, outputLines);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String normalizeYear(String dateString) {
        Pattern p = Pattern.compile("^.*\\p{Space}(\\d+)$|^(\\d+)$");
        Matcher m = p.matcher(dateString);
        if (m.matches()) {
            for (int i=1;i<=2;i++) {
                String year = m.group(i);
                    if (year == null) {
                        continue;
                    }
                String paddedYear = StringUtils.leftPad(year, 4, "0");
                String result = m.replaceFirst(paddedYear);
                return dateString.substring(0, m.start(i)) + result;
            }
        }
        return dateString;
    }

    public static String toAD(String dateString) {
        Date date = parseDate(dateString);
        if (date == null) {
            return  dateString;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        SimpleDateFormat formater = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        if (isHebrewDate(dateString) && date.before(HEBREW_REFERENCE_DATE)) {
            calendar.add(Calendar.YEAR, HEBREW_DIFFERENCE_YEARS);
            calendar.add(Calendar.MONTH, HEBREW_DIFFERENCE_MONTHS);
            calendar.add(Calendar.DAY_OF_MONTH, HEBREW_DIFFERENCE_DAYS);
            formater = new SimpleDateFormat("yyyy G", Locale.ENGLISH);
        }

        String adDateString = formater.format(calendar.getTime()).replace("BC","B.C.").toUpperCase();
        return adDateString;
    }


    public static boolean isHebrewDate(String dateString) {
        if (dateString.startsWith("@#DHEBREW@ ")) {
            return true;
        }
        return false;
    }


    public static Date parseDate(String dateString) {
        return new DateParser().parse(dateString, DateParser.ImpreciseDatePreference.PRECISE);
    }


    /**
     *
     * @param args : input and output filename
     */
    public static void main(String args[]) {
        convertWithAD(new File(args[1]), new File(args[2]));
    }
}
