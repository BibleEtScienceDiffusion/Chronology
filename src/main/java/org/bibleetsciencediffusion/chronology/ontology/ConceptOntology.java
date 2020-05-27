package org.bibleetsciencediffusion.chronology.ontology;

public interface ConceptOntology {
    Concept HUMAN = new Concept(Language.EN,"human").addName(Language.FR,"humain");
    Concept KING = new Concept(Language.EN,"king").addName(Language.FR,"roi").setParent(ConceptOntology.HUMAN);;
    Concept PHARAOH = new Concept(Language.EN,"pharaoh").addName(Language.FR,"pharaon").setParent(ConceptOntology.KING);

    Concept LOCATION = new Concept(Language.EN,"location").addName(Language.FR,"lieu");
    Concept COUNTRY = new Concept(Language.EN,"country").addName(Language.FR,"pays").setParent(LOCATION);
}
