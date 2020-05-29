package org.bibleetsciencediffusion.chronology.core.entity;

import org.bibleetsciencediffusion.chronology.core.value.Name;

public interface PropertyOntology {

    Property NAME = new Property(Name.ENGLISH, "name")
            .addName(Name.FRENCH, "nom")
            //.setType(Name.class)
            .setSubject(Concept.CONCEPT)
            .addClass(Concept.PROPERTY);


    Property EN_ISO_CODE = new Property(Name.ENGLISH, "EN ISO code")
            .addName(Name.FRENCH, "ISO code EN")
            .addProperty(Property.VALUE, "en")
            .addClass(Property.ISO_CODE);

    Property FR_ISO_CODE = new Property(Name.ENGLISH, "FR ISO code")
            .addName(Name.FRENCH, "ISO code FR")
            .addProperty(Property.VALUE, "fr")
            .addClass(Property.ISO_CODE);

    Property YEAR = new Property(Name.ENGLISH, "year")
            .addName(Name.FRENCH, "année")
            //.setType(Integer.class)
            .setSubject(Property.DATE)
            .addClass(Concept.PROPERTY);

    Property MONTH = new Property(Name.ENGLISH, "month")
            .addName(Name.FRENCH, "mois")
            .setType(Integer.class)
            .setSubject(Property.DATE)
            .addClass(Concept.PROPERTY);

    Property DAY = new Property(Name.ENGLISH, "day")
            .addName(Name.FRENCH, "jour")
            .setType(Integer.class)
            .setSubject(Property.DATE)
            .addClass(Concept.PROPERTY);

}