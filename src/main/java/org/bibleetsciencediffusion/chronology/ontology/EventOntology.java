package org.bibleetsciencediffusion.chronology.ontology;

public interface EventOntology {

    Event AM = new Event(Entity.ENGLISH, "Anno Mundi")
            .addName(Entity.FRENCH, "Anno Mundi")
            .addRole(Role.TIME, new Date())
            .addClass(Event.CREATION);

    Event BIRTH_JC = new Event(Entity.ENGLISH, "birth of Jesus")
            .addName(Entity.FRENCH, "naissance de Jésus")
            .addRole(Role.TIME, new Date().setYear(3925))
            .addClass(Event.BIRTH);

}
