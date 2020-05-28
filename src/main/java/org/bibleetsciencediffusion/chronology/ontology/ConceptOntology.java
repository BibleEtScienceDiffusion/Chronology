package org.bibleetsciencediffusion.chronology.ontology;

public interface ConceptOntology {

    void accept(OntologyVisitor v);

    Concept CONCEPT = new Concept(Entity.ENGLISH,"concept")
            .addName(Entity.FRENCH,"concept");

    Concept ENTITY = new Concept(Entity.ENGLISH,"entity")
            .addName(Entity.FRENCH,"entité")
            .addClass(CONCEPT);

    Concept RELATION = new Concept(Entity.ENGLISH,"relation")
            .addName(Entity.FRENCH,"relation")
            .addClass(CONCEPT);

    Concept PROPERTY = new Concept(Entity.ENGLISH,"property").
            addName(Entity.FRENCH,"propriété").
            addClass(CONCEPT);

    Concept ROLE = new Concept(Entity.ENGLISH,"role")
            .addName(Entity.FRENCH,"rôle")
            .addClass(CONCEPT);

    Concept PROCESS = new Concept(Entity.ENGLISH,"process")
            .addName(Entity.FRENCH,"processus")
            .addClass(RELATION);

    Concept EVENT = new Concept(Entity.ENGLISH,"event")
            .addName(Entity.FRENCH,"événement")
            .addClass(RELATION);

    Concept LOGICAL_RELATION = new Concept(Entity.ENGLISH,"logical relation")
            .addName(Entity.FRENCH,"relation logique")
            .addClass(RELATION);

    Concept HUMAN = new Concept(Entity.ENGLISH,"human")
            .addName(Entity.FRENCH,"humain")
            .addClass(ENTITY);

    Concept KING = new Concept(Entity.ENGLISH,"king")
            .addName(Entity.FRENCH,"roi")
            .addClass(HUMAN);

    Concept PHARAOH = new Concept(Entity.ENGLISH,"pharaoh")
            .addName(Entity.FRENCH,"pharaon")
            .addClass(KING);

    Concept PLACE = new Concept(Entity.ENGLISH,"place")
            .addName(Entity.FRENCH,"lieu")
            .addClass(ENTITY);

    Concept COUNTRY = new Concept(Entity.ENGLISH,"country")
            .addName(Entity.FRENCH,"pays")
            .addClass(PLACE);

    Concept LANGUAGE = new Concept(Entity.ENGLISH,"language")
            .addName(Entity.FRENCH,"langue")
            .addClass(ENTITY);

}
