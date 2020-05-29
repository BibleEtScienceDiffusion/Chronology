package org.bibleetsciencediffusion.chronology.ontology;

public interface EventOntology {

    Event CREATION = new Event(Entity.ENGLISH, "creation")
            .addName(Entity.FRENCH, "création")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.ENTITY))
            .addClass(Concept.EVENT);

    Event BIRTH = new Event(Entity.ENGLISH, "birth")
            .addName(Entity.FRENCH, "naissance")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.HUMAN))
            .addClass(Concept.EVENT);

    Event DEATH = new Event(Entity.ENGLISH, "death")
            .addName(Entity.FRENCH, "mort")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.HUMAN))
            .addClass(Concept.EVENT);

    Event INTRONIZATION = new Event(Entity.ENGLISH, "intronization")
            .addName(Entity.FRENCH, "intronisation")
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.HUMAN))
            .addClass(Concept.EVENT);

    Event AM = new Event(Entity.ENGLISH, "Anno Mundi")
            .addName(Entity.FRENCH, "Anno Mundi")
            .addRole(Role.TIME, new Date())
            .addClass(Event.CREATION);

    Event BIRTH_JC = new Event(Entity.ENGLISH, "birth of Jesus")
            .addName(Entity.FRENCH, "naissance de Jésus")
            .addRole(Role.TIME, new Date().setYear(3925))
            .addClass(Event.BIRTH);

}
