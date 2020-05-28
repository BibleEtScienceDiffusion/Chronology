package org.bibleetsciencediffusion.chronology.ontology;

public interface EventOntology {
    Event BIRTH = new Event(Entity.ENGLISH,"birth")
            .addName(Entity.FRENCH,"naissance")
            .addRole(Role.PATIENT,Concept.HUMAN);

    Event DEATH = new Event(Entity.ENGLISH,"death")
            .addName(Entity.FRENCH,"mort")
            .addRole(Role.PATIENT,Concept.HUMAN);


    Event INTRONIZATION = new Event(Entity.ENGLISH,"intronization")
            .addName(Entity.FRENCH,"intronisation")
            .addRole(Role.PATIENT,Concept.KING);
}
