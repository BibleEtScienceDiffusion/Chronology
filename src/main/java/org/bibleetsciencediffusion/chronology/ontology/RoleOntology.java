package org.bibleetsciencediffusion.chronology.ontology;

public interface RoleOntology {

    Role AGENT = new Role(Concept.ENGLISH,"agent").addName(Concept.FRENCH,"agent");

    Role PATIENT = new Role(Concept.ENGLISH,"patient").addName(Concept.FRENCH,"patient");

    Role LOCATION = new Role(Concept.ENGLISH,"location").addName(Concept.FRENCH,"localisation");

    Role PARTICIPANT = new Role(Concept.ENGLISH,"participant").addName(Concept.FRENCH,"participant");
}
