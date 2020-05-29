package org.bibleetsciencediffusion.chronology.ontology;

public interface PropertyOntology {

    Property DATE = new Property(Entity.ENGLISH,"date")
            .addName(Entity.FRENCH,"date")
            .setType(Date.class)
            .addClass(Concept.PROPERTY);

    Property NAME = new Property(Entity.ENGLISH, "name")
            .addName(Entity.FRENCH, "nom")
            .setType(Name.class)
            .addClass(Concept.PROPERTY);

    Property ISO_CODE = new Property(Entity.ENGLISH, "ISO code")
            .addName(Entity.FRENCH, "code ISO")
            .setType(String.class)
            .addClass(Concept.PROPERTY);

    Property YEAR = new Property(Entity.ENGLISH, "year")
            .addName(Entity.FRENCH, "année")
            .setType(Integer.class)
            .addClass(Concept.PROPERTY);

    Property MONTH = new Property(Entity.ENGLISH, "month")
            .addName(Entity.FRENCH, "mois")
            .setType(Integer.class)
            .addClass(Concept.PROPERTY);

    Property DAY = new Property(Entity.ENGLISH, "day")
            .addName(Entity.FRENCH, "jour")
            .setType(Integer.class)
            .addClass(Concept.PROPERTY);
}
