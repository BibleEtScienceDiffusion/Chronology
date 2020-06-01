package org.bibleetsciencediffusion.chronology.semantics.core.factory;


import org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.Relation;

import java.util.Locale;

import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept.newConcept;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Relation.newRelation;

public interface DomainDefinition {

    /* Domain definition */

    Concept KING = newConcept(null).addName(Locale.ENGLISH, "king")
            .addName(Locale.FRENCH, "roi");

    Concept PHARAOH = newConcept(null).addName(Locale.ENGLISH, "pharaoh")
            .addName(Locale.FRENCH, "pharaon");


    Relation REIGN = newRelation(null).addName(Locale.ENGLISH, "reign")
            .addName(Locale.FRENCH, "règne");

    Relation COVENANT = newRelation(null).addName(Locale.ENGLISH, "covenant")
            .addName(Locale.FRENCH, "alliance");

    /*
    Event CREATION = newEvent(null).addName(Locale.ENGLISH, "creation")
            .addName(Locale.FRENCH, "création");

    Event AM = newEvent(null).addName(Locale.ENGLISH, "Anno Mundi")
            .addName(Locale.FRENCH, "Anno Mundi");

    Event INTRONIZATION = newEvent(null).addName(Locale.ENGLISH, "intronization")
            .addName(Locale.FRENCH, "intronisation");
    */
    Concept COUNTRY = newConcept(null).addName(Locale.ENGLISH, "country")
            .addName(Locale.FRENCH, "pays");





}
