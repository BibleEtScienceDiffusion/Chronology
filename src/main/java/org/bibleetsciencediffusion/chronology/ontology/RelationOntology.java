package org.bibleetsciencediffusion.chronology.ontology;

public interface RelationOntology {

    Relation HAS_CLASS = new Relation(Entity.ENGLISH, "has class")
            .addName(Entity.FRENCH, "a pour classe")
            .addClass(Concept.RELATION);

    Relation HAS_PARENT = new Relation(Entity.ENGLISH, "has parent")
            .addName(Entity.FRENCH, "a pour parent")
            .addClass(Concept.RELATION);

    Relation HAS_SIBLING = new Relation(Entity.ENGLISH, "has sibling")
            .addName(Entity.FRENCH, "a pour frère")
            .addClass(Concept.RELATION);

    Relation AND = new Relation(Entity.ENGLISH, "and")
            .addName(Entity.FRENCH, "et")
            .addClass(Concept.LOGICAL_RELATION);

    Relation OR = new Relation(Entity.ENGLISH, "or")
            .addName(Entity.FRENCH, "ou")
            .addClass(Concept.LOGICAL_RELATION);

    Relation NOT = new Relation(Entity.ENGLISH, "not")
            .addName(Entity.FRENCH, "non")
            .addClass(Concept.LOGICAL_RELATION);

    Relation REFERENCE = new Relation(Entity.ENGLISH, "reference")
            .addName(Entity.FRENCH, "référence")
            .addClass(Concept.RELATION);

    Relation DEPENDENCY = new Relation(Entity.ENGLISH, "dependency")
            .addName(Entity.FRENCH, "dépendance")
            .addClass(Concept.RELATION);

}
