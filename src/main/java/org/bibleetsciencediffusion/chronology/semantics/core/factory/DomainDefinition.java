package org.bibleetsciencediffusion.chronology.semantics.core.factory;


import org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.Relation;

import java.util.Locale;

import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept.createConcept;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Relation.createRelation;

public interface DomainDefinition extends PrimitiveConcept {

    /* Domain definition */

    Concept KING = createConcept("king")
            .name("king", Locale.ENGLISH)
            .name("roi", Locale.FRENCH)
            .subClassOf(HUMAN);

    Concept PHARAOH = createConcept("pharaoh")
            .name("pharaoh", Locale.ENGLISH)
            .name("pharaon", Locale.FRENCH)
            .subClassOf(KING);


    Relation REIGN = createRelation("reign")
            .name("reign", Locale.ENGLISH)
            .name("règne", Locale.FRENCH)
            .subRelationOf(PROCESS);

    Relation COVENANT = createRelation(null).name("covenant", Locale.ENGLISH)
            .name("alliance", Locale.FRENCH)
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
            name("country", Locale.ENGLISH)
            .name("pays", Locale.FRENCH)
            .subClassOf(PLACE);





}
