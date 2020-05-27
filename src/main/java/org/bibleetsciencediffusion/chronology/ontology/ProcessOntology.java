package org.bibleetsciencediffusion.chronology.ontology;

public interface ProcessOntology {
    Process LIFE = new Process(Language.EN,"life")
            .addName(Language.FR,"vie")
            .addRole(Role.AGENT,Concept.HUMAN);
    Process REIGN = new Process(Language.EN,"reign")
            .addName(Language.FR,"règne")
            .addRole(Role.AGENT,Concept.KING);
}
