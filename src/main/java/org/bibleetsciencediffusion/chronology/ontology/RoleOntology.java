package org.bibleetsciencediffusion.chronology.ontology;

public interface RoleOntology {

    Role TARGET = new Role(Name.ENGLISH, "target")
            .addName(Name.FRENCH, "cible")
            .addClass(Concept.ROLE);
    Role AGENT = new Role(Name.ENGLISH, "agent")
            .addName(Name.FRENCH, "agent")
            .addClass(Concept.ROLE);
    Role PATIENT = new Role(Name.ENGLISH, "patient")
            .addName(Name.FRENCH, "patient")
            .addClass(Concept.ROLE);
    Role LOCATION = new Role(Name.ENGLISH, "location")
            .addName(Name.FRENCH, "localisation")
            .addClass(Concept.ROLE);
    Role TIME = new Role(Name.ENGLISH, "time")
            .addName(Name.FRENCH, "temps")
            .addClass(Concept.ROLE);
    Role PARTICIPANT = new Role(Name.ENGLISH, "participant")
            .addName(Name.FRENCH, "participant")
            .addClass(Concept.ROLE);
    Role ORIGIN = new Role(Name.ENGLISH, "origin")
            .addName(Name.FRENCH, "origine")
            .addClass(Concept.ROLE);

    Role DESTINATION = new Role(Name.ENGLISH, "destination")
            .addName(Name.FRENCH, "destination")
            .addClass(Concept.ROLE);

    Role SOURCE = new Role(Name.ENGLISH, "source")
            .addName(Name.FRENCH, "source")
            .addClass(Concept.ROLE);

    Role CAUSE = new Role(Name.ENGLISH, "cause")
            .addName(Name.FRENCH, "cause")
            .addClass(Concept.ROLE);

    Role BEGIN = new Role(Name.ENGLISH, "begin")
            .addName(Name.FRENCH, "début")
            .addClass(Concept.ROLE);

    Role END = new Role(Name.ENGLISH, "end")
            .addName(Name.FRENCH, "fin")
            .addClass(Concept.ROLE);
}
