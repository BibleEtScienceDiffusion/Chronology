package org.bibleetsciencediffusion.chronology.ontology;

public interface PropertyOntology {

    Property DATE = new Property(Language.EN,"date")
            .addName(Language.FR,"date")
            .setType(Date.class);

}
