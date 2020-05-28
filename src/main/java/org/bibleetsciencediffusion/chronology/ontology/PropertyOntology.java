package org.bibleetsciencediffusion.chronology.ontology;

import java.util.Map;

public interface PropertyOntology {

    Property DATE = new Property(Entity.ENGLISH,"date")
            .addName(Entity.FRENCH,"date")
            .setType(Date.class);

    Property NAME = new Property(Entity.ENGLISH,"name")
            .addName(Entity.FRENCH,"nom")
            .setType(Map.class);

}
