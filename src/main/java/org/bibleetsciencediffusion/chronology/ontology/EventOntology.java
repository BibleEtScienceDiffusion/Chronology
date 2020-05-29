package org.bibleetsciencediffusion.chronology.ontology;

public interface EventOntology {

    Event CREATION = new Event(Name.ENGLISH, "creation")
            .addName(Name.FRENCH, "création")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.ENTITY))
            .addClass(Concept.EVENT);

    Event BIRTH = new Event(Name.ENGLISH, "birth")
            .addName(Name.FRENCH, "naissance")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.HUMAN))
            .addClass(Concept.EVENT);

    Event DEATH = new Event(Name.ENGLISH, "death")
            .addName(Name.FRENCH, "mort")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.HUMAN))
            .addClass(Concept.EVENT);

    Event INTRONIZATION = new Event(Name.ENGLISH, "intronization")
            .addName(Name.FRENCH, "intronisation")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.HUMAN))
            .addClass(Concept.EVENT);

    Event AM = new Event(Name.ENGLISH, "Anno Mundi")
            .addName(Name.FRENCH, "Anno Mundi")
            .addRole(Role.TIME, new Date())
            .addClass(Event.CREATION);

    Event BIRTH_JC = new Event(Name.ENGLISH, "birth of Jesus")
            .addName(Name.FRENCH, "naissance de Jésus")
            .addRole(Role.TIME, new Date().setYear(3925))
            .addClass(Event.BIRTH);

}
