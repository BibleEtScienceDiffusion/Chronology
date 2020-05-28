package org.bibleetsciencediffusion.chronology.ontology;

public interface ConceptOntology {
    Concept HUMAN = new Concept(Entity.ENGLISH,"human").addName(Entity.FRENCH,"humain");
    Concept KING = new Concept(Entity.ENGLISH,"king").addName(Entity.FRENCH,"roi").setParent(ConceptOntology.HUMAN);;
    Concept PHARAOH = new Concept(Entity.ENGLISH,"pharaoh").addName(Entity.FRENCH,"pharaon").setParent(ConceptOntology.KING);

    Concept PLACE = new Concept(Entity.ENGLISH,"place").addName(Entity.FRENCH,"lieu");
    Concept COUNTRY = new Concept(Entity.ENGLISH,"country").addName(Entity.FRENCH,"pays").setParent(ConceptOntology.PLACE);

    Concept LANGUAGE = new Concept(Entity.ENGLISH,"language").addName(Entity.FRENCH,"langue");

}
