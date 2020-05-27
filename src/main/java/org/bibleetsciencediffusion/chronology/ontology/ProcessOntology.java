package org.bibleetsciencediffusion.chronology.ontology;

public interface ProcessOntology {
    Process LIFE = new Process(Language.EN,"life").addName(Language.FR,"vie").setTarget(Concept.HUMAN);
    Process REIGN = new Process(Language.EN,"reign").addName(Language.FR,"règne").setTarget(Concept.KING);
}
