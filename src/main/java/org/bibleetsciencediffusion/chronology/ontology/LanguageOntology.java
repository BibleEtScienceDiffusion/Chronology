package org.bibleetsciencediffusion.chronology.ontology;

public interface LanguageOntology  {

    Language EN = new Language(LanguageOntology.EN,"english")
                        .addName(LanguageOntology.FR,"anglais");

    Language FR = new Language(LanguageOntology.EN,"french")
                        .addName(LanguageOntology.FR,"français");

}
