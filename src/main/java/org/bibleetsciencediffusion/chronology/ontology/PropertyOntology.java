package org.bibleetsciencediffusion.chronology.ontology;

import java.util.Map;

public interface PropertyOntology {

    Property DATE = new Property(Entity.ENGLISH,"date")
            .addName(Entity.FRENCH,"date")
            .setType(Date.class)
            .addClass(Concept.PROPERTY);

    Property NAME = new Property(Entity.ENGLISH,"name")
            .addName(Entity.FRENCH,"nom")
            .setType(Name.class)
            .addClass(Concept.PROPERTY);


    Property ISO_CODE = new Property(Entity.ENGLISH,"ISO code")
            .addName(Entity.FRENCH,"code ISO")
            .setType(String.class)
            .addClass(Concept.PROPERTY);

}
