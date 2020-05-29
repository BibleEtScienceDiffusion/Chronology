package org.bibleetsciencediffusion.chronology.core.entity;

import org.bibleetsciencediffusion.chronology.core.value.Name;

import static org.bibleetsciencediffusion.chronology.core.entity.Concept.newConcept;

public interface DomainDefinition {

    /* Domain definition */

    Concept KING = newConcept(Name.ENGLISH, "king")
            .addName(Name.FRENCH, "roi")
            .addClass(Concept.HUMAN);

    Concept PHARAOH = newConcept(Name.ENGLISH, "pharaoh")
            .addName(Name.FRENCH, "pharaon")
            .addClass(DomainDefinition.KING);


    Process REIGN = new Process(Name.ENGLISH, "reign")
            .addName(Name.FRENCH, "règne")
            .addRole(Role.AGENT, DomainDefinition.KING)
            .addClass(Concept.PROCESS);

    Process COVENANT = new Process(Name.ENGLISH, "covenant")
            .addName(Name.FRENCH, "alliance")
            .addRole(Role.AGENT, Concept.HUMAN)
            .addClass(Concept.PROCESS);


    Event CREATION = new Event(Name.ENGLISH, "creation")
            .addName(Name.FRENCH, "création")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.ENTITY))
            .addClass(Concept.EVENT);

    Event AM = new Event(Name.ENGLISH, "Anno Mundi")
            .addName(Name.FRENCH, "Anno Mundi")
            .addRole(Role.TIME, new Date())
            .addClass(DomainDefinition.CREATION);

    Event INTRONIZATION = new Event(Name.ENGLISH, "intronization")
            .addName(Name.FRENCH, "intronisation")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.HUMAN))
            .addClass(Concept.EVENT);

    Concept COUNTRY = newConcept(Name.ENGLISH, "country")
            .addName(Name.FRENCH, "pays")
            .addClass(Concept.PLACE);


    Property EN_ISO_CODE = new Property(Name.ENGLISH, "EN ISO code")
            .addName(Name.FRENCH, "ISO code EN")
            .addProperty(Property.VALUE, "en")
            .addClass(Property.ISO_CODE);

    Property FR_ISO_CODE = new Property(Name.ENGLISH, "FR ISO code")
            .addName(Name.FRENCH, "ISO code FR")
            .addProperty(Property.VALUE, "fr")
            .addClass(Property.ISO_CODE);


    Entity ENGLISH = new Entity(Name.ENGLISH, "english")
            .addName(Name.FRENCH, "anglais").addClass(Concept.LANGUAGE)
            .addProperty(Property.ISO_CODE, "en");

    Entity FRENCH = new Entity(Name.ENGLISH, "french")
            .addName(Name.FRENCH, "français").addClass(Concept.LANGUAGE)
            .addProperty(Property.ISO_CODE, "fr");

    Entity ISRAEL = new Entity(Name.ENGLISH, "Israel")
            .addName(Name.FRENCH, "Israël")
            .addClass(DomainDefinition.COUNTRY);

    Entity CANAAN = new Entity(Name.ENGLISH, "Canaan")
            .addName(Name.FRENCH, "Canaan")
            .addClass(DomainDefinition.COUNTRY);
    ;

    Entity EGYPT = new Entity(Name.ENGLISH, "Egypt")
            .addName(Name.FRENCH, "Egypte")
            .addClass(DomainDefinition.COUNTRY);
    ;

    Entity ABRAHAM = new Entity(Name.ENGLISH, "Abram")
            .addClass(Concept.HUMAN)
            .addProcess(
                    new Process(Process.LIFE)
                            .setBegin(new Event().setDate(new Date().setYear(1948)))
                            .setEnd(new Event().setDate(new Date().setYear(2123)))
                            .addProcess(new Process((DomainDefinition.COVENANT))
                                    .setBegin(new Event().setDate(new Date().setYear(2018)))
                                    .addRole(Role.PARTICIPANT, new Entity()
                                            .addName(Name.ENGLISH, "Abraham"))
                                    .addRole(Role.LOCATION, CANAAN)
                            ));

}
