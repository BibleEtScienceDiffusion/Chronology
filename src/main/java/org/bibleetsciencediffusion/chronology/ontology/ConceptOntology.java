package org.bibleetsciencediffusion.chronology.ontology;

public interface ConceptOntology {
    Concept HUMAN = new Concept(Concept.ENGLISH,"human").addName(Concept.FRENCH,"humain");
    Concept KING = new Concept(Concept.ENGLISH,"king").addName(Concept.FRENCH,"roi").setAscendant(ConceptOntology.HUMAN);;
    Concept PHARAOH = new Concept(Concept.ENGLISH,"pharaoh").addName(Concept.FRENCH,"pharaon").setAscendant(ConceptOntology.KING);

    Concept PLACE = new Concept(Concept.ENGLISH,"place").addName(Concept.FRENCH,"lieu");
    Concept COUNTRY = new Concept(Concept.ENGLISH,"country").addName(Concept.FRENCH,"pays").setAscendant(ConceptOntology.PLACE);


    Concept ENGLISH = new Concept(Concept.ENGLISH,"english")
            .addName(Concept.FRENCH,"anglais");

    Concept FRENCH = new Concept(Concept.ENGLISH,"french")
            .addName(Concept.FRENCH,"français");
}
