package org.bibleetsciencediffusion.chronology.ontology;

public interface RoleOntology {

    Role AGENT = new Role(Entity.ENGLISH,"agent")
            .addName(Entity.FRENCH, "agent")
            .addClass(Concept.ROLE);

    Role PATIENT = new Role(Entity.ENGLISH, "patient")
            .addName(Entity.FRENCH, "patient")
            .addClass(Concept.ROLE);

    Role LOCATION = new Role(Entity.ENGLISH, "location")
            .addName(Entity.FRENCH, "localisation")
            .addClass(Concept.ROLE);

    Role TIME = new Role(Entity.ENGLISH, "time")
            .addName(Entity.FRENCH, "temps")
            .addClass(Concept.ROLE);

    Role PARTICIPANT = new Role(Entity.ENGLISH, "participant")
            .addName(Entity.FRENCH, "participant")
            .addClass(Concept.ROLE);

    Role TARGET = new Role(Entity.ENGLISH, "target")
            .addName(Entity.FRENCH, "cible")
            .addClass(Concept.ROLE);

    Role ORIGIN = new Role(Entity.ENGLISH, "origin")
            .addName(Entity.FRENCH, "origine")
            .addClass(Concept.ROLE);

    Role DESTINATION = new Role(Entity.ENGLISH, "destination")
            .addName(Entity.FRENCH, "destination")
            .addClass(Concept.ROLE);

    Role SOURCE = new Role(Entity.ENGLISH, "source")
            .addName(Entity.FRENCH, "source")
            .addClass(Concept.ROLE);

    Role CAUSE = new Role(Entity.ENGLISH, "cause")
            .addName(Entity.FRENCH, "cause")
            .addClass(Concept.ROLE);

    Role BEGIN = new Role(Entity.ENGLISH, "begin")
            .addName(Entity.FRENCH, "début")
            .addClass(Concept.ROLE);

    Role END = new Role(Entity.ENGLISH, "end")
            .addName(Entity.FRENCH, "fin")
            .addClass(Concept.ROLE);
}
