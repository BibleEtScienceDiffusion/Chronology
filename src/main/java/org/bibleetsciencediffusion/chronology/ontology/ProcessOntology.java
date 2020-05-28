package org.bibleetsciencediffusion.chronology.ontology;

public interface ProcessOntology {
    Process LIFE = new Process(Entity.ENGLISH,"life")
            .addName(Entity.FRENCH,"vie")
            .addRole(Role.AGENT,Concept.HUMAN)
            .addClass(Concept.PROCESS);

    Process REIGN = new Process(Entity.ENGLISH,"reign")
            .addName(Entity.FRENCH,"règne")
            .addRole(Role.AGENT,Concept.KING)
            .addClass(Concept.PROCESS);

    Process COVENANT = new Process(Entity.ENGLISH,"covenant")
            .addName(Entity.FRENCH,"alliance")
            .addRole(Role.AGENT,Concept.HUMAN)
            .addClass(Concept.PROCESS);
}
