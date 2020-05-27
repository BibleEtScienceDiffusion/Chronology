package org.bibleetsciencediffusion.chronology.ontology;

public interface EntityOntology {

    Entity ISRAEL = new Entity(LanguageOntology.EN,"Israel").addName(LanguageOntology.FR,"Israël").setParent(ConceptOntology.COUNTRY);
    Entity CANAAN = new Entity(LanguageOntology.EN,"Canaan").addName(LanguageOntology.FR,"Canaan").setParent(ConceptOntology.COUNTRY);;
    Entity EGYPT = new Entity(LanguageOntology.EN,"Egypt").addName(LanguageOntology.FR,"Egypte").setParent(ConceptOntology.COUNTRY);;

}
