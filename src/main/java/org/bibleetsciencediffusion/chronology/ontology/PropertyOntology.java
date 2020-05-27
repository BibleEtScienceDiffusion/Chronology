package org.bibleetsciencediffusion.chronology.ontology;

import java.util.Map;

public interface PropertyOntology {

    Property DATE = new Property(Concept.ENGLISH,"date")
            .addName(Concept.FRENCH,"date")
            .setType(Date.class);

    Property NAME = new Property(Concept.ENGLISH,"name")
            .addName(Concept.FRENCH,"nom")
            .setType(Map.class);
}
