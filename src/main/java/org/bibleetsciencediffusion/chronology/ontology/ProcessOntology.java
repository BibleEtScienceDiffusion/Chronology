package org.bibleetsciencediffusion.chronology.ontology;

public interface ProcessOntology {
    Process LIFE = new Process(Concept.ENGLISH,"life")
            .addName(Concept.FRENCH,"vie")
            .addRole(Role.AGENT,Concept.HUMAN);
    Process REIGN = new Process(Concept.ENGLISH,"reign")
            .addName(Concept.FRENCH,"règne")
            .addRole(Role.AGENT,Concept.KING);

    Process COVENANT = new Process(Concept.ENGLISH,"covenant")
            .addName(Concept.FRENCH,"alliance")
            .addRole(Role.AGENT,Concept.HUMAN);
}
