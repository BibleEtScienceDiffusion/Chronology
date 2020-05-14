package org.bibleetsciencediffusion.genealogytools;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import static org.bibleetsciencediffusion.genealogytools.GedcomCalendar.convertWithAD;

public class GedcomCalendarTest {

    @Test
    public void testDate1() throws Exception {
        Assert.assertEquals("3925 B.C.",GedcomCalendar.toAD("@#DHEBREW@ 0001"));
    }

    @Test
    public void testDate2() throws Exception {
        Assert.assertEquals("2270 B.C.",GedcomCalendar.toAD("@#DHEBREW@ 1656"));
    }

    @Test
    public void testDate3() throws Exception {
        Assert.assertEquals("1978 B.C.",GedcomCalendar.toAD("@#DHEBREW@ 1948"));
    }

    @Test
    public void testDate4() throws Exception {
        Assert.assertEquals("01 JAN 0001",GedcomCalendar.toAD("0001"));
    }

    @Test
    public void testDate5() throws Exception {
        Assert.assertEquals("30 SEP 2019",GedcomCalendar.toAD("@#DHEBREW@ 5780"));
    }

    @Test
    public void testConvertWithAD() throws Exception {
        convertWithAD(new File("C:\\Users\\frup43047\\IdeaProjects\\GenealogyTools\\src\\main\\resources\\Bible_Genealogy.AM.ged"), new File("C:\\Users\\frup43047\\IdeaProjects\\GenealogyTools\\src\\main\\resources\\Bible_Genealogy.AD.ged"));
    }
}
