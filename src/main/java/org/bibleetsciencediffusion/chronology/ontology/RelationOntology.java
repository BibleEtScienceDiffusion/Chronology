package org.bibleetsciencediffusion.chronology.ontology;

public interface RelationOntology {

    Relation PARENT = new Relation(Entity.ENGLISH,"parent").addName(Entity.FRENCH,"parent");

    Relation SIBLING = new Relation(Entity.ENGLISH,"sibling").addName(Entity.FRENCH,"frère");

    Relation AND = new Relation(Entity.ENGLISH,"and").addName(Entity.FRENCH,"et");

    Relation OR = new Relation(Entity.ENGLISH,"or").addName(Entity.FRENCH,"ou");

    Relation NOT = new Relation(Entity.ENGLISH,"not").addName(Entity.FRENCH,"non");

}
