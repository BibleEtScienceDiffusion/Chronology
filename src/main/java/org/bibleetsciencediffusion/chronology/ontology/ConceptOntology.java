package org.bibleetsciencediffusion.chronology.ontology;

public interface ConceptOntology {

    void accept(OntologyVisitor v);

    Concept CONCEPT = new Concept(Name.ENGLISH, "concept")
            .addName(Name.FRENCH, "concept");
    Relation HAS_CLASS = new Relation(Name.ENGLISH, "has class")
            .addName(Name.FRENCH, "a pour classe")
            .addClass(Concept.RELATION);
    Concept ENTITY = new Concept(Name.ENGLISH, "entity")
            .addName(Name.FRENCH, "entité")
            .addClass(CONCEPT);
    Concept RELATION = new Concept(Name.ENGLISH, "relation")
            .addName(Name.FRENCH, "relation")
            .addClass(CONCEPT);
    Concept PROPERTY = new Concept(Name.ENGLISH, "property").
            addName(Name.FRENCH, "propriété").
            addClass(CONCEPT);

    Concept ROLE = new Concept(Name.ENGLISH, "role")
            .addName(Name.FRENCH, "rôle")
            .addClass(CONCEPT);

    Concept PROCESS = new Concept(Name.ENGLISH, "process")
            .addName(Name.FRENCH, "processus")
            .addClass(RELATION);

    Concept EVENT = new Concept(Name.ENGLISH, "event")
            .addName(Name.FRENCH, "événement")
            .addClass(RELATION);

    Property VALUE = new Property(Name.ENGLISH, "date")
            .addName(Name.FRENCH, "date")
            //.setType(Object.class)
            .setSubject(Concept.PROPERTY)
            .addClass(Concept.PROPERTY);

    Concept LOGICAL_RELATION = new Concept(Name.ENGLISH, "logical relation")
            .addName(Name.FRENCH, "relation logique")
            .addClass(RELATION);

    Concept SPATIO_TEMPORAL_RELATION = new Concept(Name.ENGLISH, "spatio-temporal relation")
            .addName(Name.FRENCH, "relation spatio-temporelle")
            .addClass(RELATION);

    Concept TEMPORAL_RELATION = new Concept(Name.ENGLISH, "temporal relation")
            .addName(Name.FRENCH, "relation temporelle")
            .addClass(SPATIO_TEMPORAL_RELATION);

    Concept SPATIAL_RELATION = new Concept(Name.ENGLISH, "spatial relation")
            .addName(Name.FRENCH, "relation spaciale")
            .addClass(SPATIO_TEMPORAL_RELATION);

    Concept HUMAN = new Concept(Name.ENGLISH, "human")
            .addName(Name.FRENCH, "humain")
            .addClass(ENTITY);

    Concept KING = new Concept(Name.ENGLISH, "king")
            .addName(Name.FRENCH, "roi")
            .addClass(HUMAN);

    Concept PHARAOH = new Concept(Name.ENGLISH, "pharaoh")
            .addName(Name.FRENCH, "pharaon")
            .addClass(KING);

    Concept PLACE = new Concept(Name.ENGLISH, "place")
            .addName(Name.FRENCH, "lieu")
            .addClass(ENTITY);

    Concept COUNTRY = new Concept(Name.ENGLISH, "country")
            .addName(Name.FRENCH, "pays")
            .addClass(PLACE);

    Concept LANGUAGE = new Concept(Name.ENGLISH, "language")
            .addName(Name.FRENCH, "langue")
            .addClass(ENTITY);

    Property ISO_CODE = new Property(Name.ENGLISH, "ISO code")
            .addName(Name.FRENCH, "code ISO")
            //.setType(String.class);
            .setSubject(Concept.LANGUAGE)
            .addProperty(Concept.VALUE, Void.TYPE)
            .addClass(Concept.PROPERTY);


    Property DATE = new Property(Name.ENGLISH, "date")
            .addName(Name.FRENCH, "date")
            //.setType(Date.class)
            .setSubject(Concept.EVENT)
            .addClass(Concept.PROPERTY);

}
