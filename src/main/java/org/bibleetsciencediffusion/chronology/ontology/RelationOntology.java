package org.bibleetsciencediffusion.chronology.ontology;

public interface RelationOntology {

    Relation HAS_CLASS = new Relation(Entity.ENGLISH,"has class")
            .addName(Entity.FRENCH,"a pour classe")
            .addClass(Concept.RELATION);

    Relation PARENT = new Relation(Entity.ENGLISH,"parent")
            .addName(Entity.FRENCH,"parent")
            .addClass(Concept.RELATION);

    Relation SIBLING = new Relation(Entity.ENGLISH,"sibling")
            .addName(Entity.FRENCH,"frère")
            .addClass(Concept.RELATION);

    Relation AND = new Relation(Entity.ENGLISH,"and")
            .addName(Entity.FRENCH,"et")
            .addClass(Concept.LOGICAL_RELATION);

    Relation OR = new Relation(Entity.ENGLISH,"or")
            .addName(Entity.FRENCH,"ou")
            .addClass(Concept.LOGICAL_RELATION);

    Relation NOT = new Relation(Entity.ENGLISH,"not")
            .addName(Entity.FRENCH,"non")
            .addClass(Concept.LOGICAL_RELATION);

}
