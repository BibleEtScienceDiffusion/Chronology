package org.bibleetsciencediffusion.chronology.ontology;

import java.util.Map;

public interface PropertyOntology {

    Property DATE = new Property(Property.ENGLISH,"date")
            .addName(Property.FRENCH,"date")
            .setType(Date.class);

    Property NAME = new Property(Property.ENGLISH,"name")
            .addName(Property.FRENCH,"nom")
            .setType(Map.class);


    Property ENGLISH = new Property(Property.ENGLISH,"english")
            .addName(Property.FRENCH,"anglais");

    Property FRENCH = new Property(Property.ENGLISH,"french")
            .addName(Property.FRENCH,"français");
}
