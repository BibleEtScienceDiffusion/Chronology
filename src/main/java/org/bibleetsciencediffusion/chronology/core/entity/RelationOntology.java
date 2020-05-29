package org.bibleetsciencediffusion.chronology.core.entity;

import org.bibleetsciencediffusion.chronology.core.value.Name;

public interface RelationOntology {


    Relation HAS_PARENT = new Relation(Name.ENGLISH, "has parent")
            .addName(Name.FRENCH, "a pour parent")
            .addClass(Concept.RELATION);

    Relation HAS_SIBLING = new Relation(Name.ENGLISH, "has sibling")
            .addName(Name.FRENCH, "a pour frère")
            .addClass(Concept.RELATION);

    Relation AND = new Relation(Name.ENGLISH, "and")
            .addName(Name.FRENCH, "et")
            .addClass(Concept.LOGICAL_RELATION);

    Relation OR = new Relation(Name.ENGLISH, "or")
            .addName(Name.FRENCH, "ou")
            .addClass(Concept.LOGICAL_RELATION);

    Relation NOT = new Relation(Name.ENGLISH, "not")
            .addName(Name.FRENCH, "non")
            .addClass(Concept.LOGICAL_RELATION);

    Relation REFERENCE = new Relation(Name.ENGLISH, "reference")
            .addName(Name.FRENCH, "référence")
            .addClass(Concept.RELATION);

    Relation DEPENDENCY = new Relation(Name.ENGLISH, "dependency")
            .addName(Name.FRENCH, "dépendance")
            .addClass(Concept.RELATION);

}
