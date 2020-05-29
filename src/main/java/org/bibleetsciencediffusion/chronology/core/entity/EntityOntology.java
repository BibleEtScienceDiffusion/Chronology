package org.bibleetsciencediffusion.chronology.core.entity;

import org.bibleetsciencediffusion.chronology.core.value.Name;

public interface EntityOntology {

    Entity ENGLISH = new Entity(Name.ENGLISH, "english")
            .addName(Name.FRENCH, "anglais").addClass(Concept.LANGUAGE)
            .addProperty(Property.ISO_CODE, "en");

    Entity FRENCH = new Entity(Name.ENGLISH, "french")
            .addName(Name.FRENCH, "français").addClass(Concept.LANGUAGE)
            .addProperty(Property.ISO_CODE, "fr");

    Entity ISRAEL = new Entity(Name.ENGLISH, "Israel")
            .addName(Name.FRENCH, "Israël")
            .addClass(Concept.COUNTRY);

    Entity CANAAN = new Entity(Name.ENGLISH, "Canaan")
            .addName(Name.FRENCH, "Canaan")
            .addClass(Concept.COUNTRY);
    ;

    Entity EGYPT = new Entity(Name.ENGLISH, "Egypt")
            .addName(Name.FRENCH, "Egypte")
            .addClass(Concept.COUNTRY);
    ;

    Entity ABRAHAM = new Entity(Name.ENGLISH, "Abram")
            .addClass(Concept.HUMAN)
            .addProcess(
                    new Process(Process.LIFE)
                            .setBegin(new Event().setDate(new Date().setYear(1948)))
                            .setEnd(new Event().setDate(new Date().setYear(2123)))
                            .addProcess(new Process((Process.COVENANT))
                                    .setBegin(new Event().setDate(new Date().setYear(2018)))
                                    .addRole(Role.PARTICIPANT, new Entity(Entity.ABRAHAM)
                                            .addName(Name.ENGLISH, "Abraham"))
                                    .addRole(Role.LOCATION, CANAAN)
                            ));

}
