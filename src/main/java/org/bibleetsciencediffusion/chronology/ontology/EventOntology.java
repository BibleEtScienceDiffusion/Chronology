package org.bibleetsciencediffusion.chronology.ontology;

public interface EventOntology {
    Event BIRTH = new Event(Language.EN,"birth")
            .addName(Language.FR,"naissance")
            .addRole(Role.PATIENT,Concept.HUMAN);
    Event DEATH = new Event(Language.EN,"death")
            .addName(Language.FR,"mort")
            .addRole(Role.PATIENT,Concept.HUMAN);


    Event INTRONIZATION = new Event(Language.EN,"intronization")
            .addName(Language.FR,"intronisation")
            .addRole(Role.PATIENT,Concept.KING);
}
