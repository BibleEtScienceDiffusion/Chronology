package org.bibleetsciencediffusion.chronology.ontology;

public interface ConceptOntology {
    Concept HUMAN = new Concept(Property.ENGLISH,"human").addName(Property.FRENCH,"humain");
    Concept KING = new Concept(Property.ENGLISH,"king").addName(Property.FRENCH,"roi").setAscendant(ConceptOntology.HUMAN);;
    Concept PHARAOH = new Concept(Property.ENGLISH,"pharaoh").addName(Property.FRENCH,"pharaon").setAscendant(ConceptOntology.KING);

    Concept PLACE = new Concept(Property.ENGLISH,"place").addName(Property.FRENCH,"lieu");
    Concept COUNTRY = new Concept(Property.ENGLISH,"country").addName(Property.FRENCH,"pays").setAscendant(ConceptOntology.PLACE);


}
