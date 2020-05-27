package org.bibleetsciencediffusion.chronology.ontology;

/**
 * object valeur
 */

public class Date  {

    /**
     * creation of the world
     */
    public static Date AM = new Date();

    /**
     * beginning of our era
     */
    public static Date JC = new Date(AM, 3925,0,0);

    /**
     * event reference
     */
    private Date reference = null;

    /**
     * sun rotation offset
     */

    private int year = 0;

    /**
     * moon rotation offset
     */
    private int month = 0;

    /**
     * earth rotation offset
     */
    private int day = 0;

    public Date() {
    }

    public Date(Date reference) {
        this.reference = reference;
    }

    public Date(Date reference, int year) {
        this.reference = reference;
        this.year = year;
    }

    public Date(Date reference, int year, int month, int day) {
        this.reference = reference;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date setReference(Date reference) {
        this.reference = reference;
        return this;
    }

    public Date setYear(int year) {
        this.year = year;
        return this;
    }

    public Date setMonth(int month) {
        this.month = month;
        return this;
    }

    public Date setDay(int day) {
        this.day = day;
        return this;
    }

    public Date getReference() {
        return reference;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }



}
