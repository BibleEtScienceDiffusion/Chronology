package org.bibleetsciencediffusion.chronology.ontology;

public class Event extends Concept implements EventOntology {

    /**
     * event reference
     */
    private Event reference = null;

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

    public Event() {
    }

    public Event(Event reference) {
        this.reference = reference;
    }

    public Event(Event reference, int year, int month, int day) {
        this.reference = reference;
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public Event setReference(Event reference) {
        this.reference = reference;
        return this;
    }

    public Event setYear(int year) {
        this.year = year;
        return this;
    }

    public Event setMonth(int month) {
        this.month = month;
        return this;
    }

    public Event setDay(int day) {
        this.day = day;
        return this;
    }

    public Event getReference() {
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
