package org.bibleetsciencediffusion.chronology.ontology;

public interface EventOntology {
    Event BIRTH = new Event(Entity.ENGLISH,"birth")
            .addName(Entity.FRENCH,"naissance")
            .addRole(Role.PATIENT,Concept.HUMAN)
            .addClass(Concept.EVENT);

    Event DEATH = new Event(Entity.ENGLISH,"death")
            .addName(Entity.FRENCH,"mort")
            .addRole(Role.PATIENT,Concept.HUMAN)
            .addClass(Concept.EVENT);


    Event INTRONIZATION = new Event(Entity.ENGLISH,"intronization")
            .addName(Entity.FRENCH,"intronisation")
            .addRole(Role.PATIENT,Concept.KING)
            .addClass(Concept.EVENT);
}
