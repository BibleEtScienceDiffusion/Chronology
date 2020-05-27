package org.bibleetsciencediffusion.chronology.ontology;

public interface EventOntology {

    /**
     * creation of the world
     */
    Event AM = new Event();

    /**
     * beginning of our era
     */
    Event JC = new Event(AM, 3925,0,0);

}
