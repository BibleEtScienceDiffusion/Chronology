package org.bibleetsciencediffusion.chronology.semantics.core.entity;


import java.util.Locale;

import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept.newConcept;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Event.newEvent;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Process.newProcess;

public interface DomainDefinition {

    /* Domain definition */

    Concept KING = newConcept(Locale.ENGLISH, "king")
            .addName(Locale.FRENCH, "roi")
            .addClass(Concept.HUMAN);

    Concept PHARAOH = newConcept(Locale.ENGLISH, "pharaoh")
            .addName(Locale.FRENCH, "pharaon")
            .addClass(DomainDefinition.KING);


    Process REIGN = newProcess(Locale.ENGLISH, "reign")
            .addName(Locale.FRENCH, "règne")
            .addRole(Role.AGENT, DomainDefinition.KING)
            .addClass(Concept.PROCESS);

    Process COVENANT = newProcess(Locale.ENGLISH, "covenant")
            .addName(Locale.FRENCH, "alliance")
            .addRole(Role.AGENT, Concept.HUMAN)
            .addClass(Concept.PROCESS);


    Event CREATION = newEvent(Locale.ENGLISH, "creation")
            .addName(Locale.FRENCH, "création")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.ENTITY))
            .addClass(Concept.EVENT);

    Event AM = newEvent(Locale.ENGLISH, "Anno Mundi")
            .addName(Locale.FRENCH, "Anno Mundi")
            .addRole(Role.TIME, new Date())
            .addClass(DomainDefinition.CREATION);

    Event INTRONIZATION = newEvent(Locale.ENGLISH, "intronization")
            .addName(Locale.FRENCH, "intronisation")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.HUMAN))
            .addClass(Concept.EVENT);

    Concept COUNTRY = newConcept(Locale.ENGLISH, "country")
            .addName(Locale.FRENCH, "pays")
            .addClass(Concept.PLACE);

/*
    Property EN_ISO_CODE = newProperty(Locale.ENGLISH, "EN ISO code")
            .addName(Locale.FRENCH, "ISO code EN")
            .addProperty(Property.VALUE, "en")
            .addClass(Property.ISO_CODE);

    Property FR_ISO_CODE = newProperty(Locale.ENGLISH, "FR ISO code")
            .addName(Locale.FRENCH, "ISO code FR")
            .addProperty(Property.VALUE, "fr")
            .addClass(Property.ISO_CODE);


    Entity ENGLISH = new Entity(Locale.ENGLISH, "english")
            .addName(Locale.FRENCH, "anglais").addClass(Concept.LANGUAGE)
            .addProperty(Property.ISO_CODE, "en");

    Entity FRENCH = new Entity(Locale.ENGLISH, "french")
            .addName(Locale.FRENCH, "français").addClass(Concept.LANGUAGE)
            .addProperty(Property.ISO_CODE, "fr");

     */

    Entity ISRAEL = new Entity(Locale.ENGLISH, "Israel")
            .addName(Locale.FRENCH, "Israël")
            .addClass(DomainDefinition.COUNTRY);

    Entity CANAAN = new Entity(Locale.ENGLISH, "Canaan")
            .addName(Locale.FRENCH, "Canaan")
            .addClass(DomainDefinition.COUNTRY);
    ;

    Entity EGYPT = new Entity(Locale.ENGLISH, "Egypt")
            .addName(Locale.FRENCH, "Egypte")
            .addClass(DomainDefinition.COUNTRY);
    ;

    Entity ABRAHAM = new Entity(Locale.ENGLISH, "Abram")
            .addClass(Concept.HUMAN)
            .addProcess(
                    new Process(Process.LIFE)
                            .setBegin(new Event().setDate(new Date().setYear(1948)))
                            .setEnd(new Event().setDate(new Date().setYear(2123)))
                            .addProcess(new Process((DomainDefinition.COVENANT))
                                    .setBegin(new Event().setDate(new Date().setYear(2018)))
                                    .addRole(Role.PARTICIPANT, new Entity()
                                            .addName(Locale.ENGLISH, "Abraham"))
                                    .addRole(Role.LOCATION, CANAAN)
                            ));

}
