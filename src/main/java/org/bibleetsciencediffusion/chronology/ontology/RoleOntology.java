package org.bibleetsciencediffusion.chronology.ontology;

public interface RoleOntology {

    Role AGENT = new Role(Entity.ENGLISH,"agent").addName(Entity.FRENCH,"agent");

    Role PATIENT = new Role(Entity.ENGLISH,"patient").addName(Entity.FRENCH,"patient");

    Role LOCATION = new Role(Entity.ENGLISH,"location").addName(Entity.FRENCH,"localisation");

    Role PARTICIPANT = new Role(Entity.ENGLISH,"participant").addName(Entity.FRENCH,"participant");

    Role TARGET = new Role(Entity.ENGLISH,"target").addName(Entity.FRENCH,"cible");
}
