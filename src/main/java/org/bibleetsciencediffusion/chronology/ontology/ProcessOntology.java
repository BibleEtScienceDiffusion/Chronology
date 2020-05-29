package org.bibleetsciencediffusion.chronology.ontology;

public interface ProcessOntology {
    Process LIFE = new Process(Name.ENGLISH, "life")
            .addName(Name.FRENCH, "vie")
            .addRole(Role.AGENT, Concept.HUMAN)
            .addClass(Concept.PROCESS);

    Process REIGN = new Process(Name.ENGLISH, "reign")
            .addName(Name.FRENCH, "règne")
            .addRole(Role.AGENT, Concept.KING)
            .addClass(Concept.PROCESS);

    Process COVENANT = new Process(Name.ENGLISH, "covenant")
            .addName(Name.FRENCH, "alliance")
            .addRole(Role.AGENT, Concept.HUMAN)
            .addClass(Concept.PROCESS);
}
