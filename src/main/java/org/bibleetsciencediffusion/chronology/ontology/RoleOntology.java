package org.bibleetsciencediffusion.chronology.ontology;

public interface RoleOntology {

    Role AGENT = new Role(Entity.ENGLISH,"agent")
            .addName(Entity.FRENCH,"agent")
            .addClass(Concept.ROLE);

    Role PATIENT = new Role(Entity.ENGLISH,"patient")
            .addName(Entity.FRENCH,"patient")
            .addClass(Concept.ROLE);

    Role LOCATION = new Role(Entity.ENGLISH,"location")
            .addName(Entity.FRENCH,"localisation")
            .addClass(Concept.ROLE);

    Role PARTICIPANT = new Role(Entity.ENGLISH,"participant")
            .addName(Entity.FRENCH,"participant")
            .addClass(Concept.ROLE);

    Role TARGET = new Role(Entity.ENGLISH,"target")
            .addName(Entity.FRENCH,"cible")
            .addClass(Concept.ROLE);
}
