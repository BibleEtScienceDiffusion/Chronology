package org.bibleetsciencediffusion.chronology.ontology;

public interface EventOntology {
    Event BIRTH = new Event(Concept.ENGLISH,"birth")
            .addName(Concept.FRENCH,"naissance")
            .addRole(Role.PATIENT,Concept.HUMAN);
    Event DEATH = new Event(Concept.ENGLISH,"death")
            .addName(Concept.FRENCH,"mort")
            .addRole(Role.PATIENT,Concept.HUMAN);


    Event INTRONIZATION = new Event(Concept.ENGLISH,"intronization")
            .addName(Concept.FRENCH,"intronisation")
            .addRole(Role.PATIENT,Concept.KING);
}
