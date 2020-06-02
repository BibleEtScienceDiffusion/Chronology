package org.bibleetsciencediffusion.chronology.semantics.core.factory;


import org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.Relation;

import java.util.Locale;

import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept.createConcept;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Relation.createRelation;

public interface DomainDefinition extends PrimitiveConcept {

    /* Domain definition */

    Concept KING = createConcept("king")
            .addName("king", Locale.ENGLISH)
            .addName("roi", Locale.FRENCH)
            .subClassOf(HUMAN);

    Concept PHARAOH = createConcept("pharaoh")
            .addName("pharaoh", Locale.ENGLISH)
            .addName("pharaon", Locale.FRENCH)
            .subClassOf(KING);


    Relation REIGN = createRelation("reign")
            .addName("reign", Locale.ENGLISH)
            .addName("règne", Locale.FRENCH)
            .subRelationOf(PROCESS);

    Relation COVENANT = createRelation(null).addName("covenant", Locale.ENGLISH)
            .addName("alliance", Locale.FRENCH)
            .subRelationOf(PROCESS);

    /*
    Event CREATION = newEvent(null).addName(Locale.ENGLISH, "creation")
            .addName(Locale.FRENCH, "création");

    Event AM = newEvent(null).addName(Locale.ENGLISH, "Anno Mundi")
            .addName(Locale.FRENCH, "Anno Mundi");

    Event INTRONIZATION = newEvent(null).addName(Locale.ENGLISH, "intronization")
            .addName(Locale.FRENCH, "intronisation");
    */
    Concept COUNTRY = createConcept("country").
            addName("country", Locale.ENGLISH)
            .addName("pays", Locale.FRENCH)
            .subClassOf(PLACE);





}
