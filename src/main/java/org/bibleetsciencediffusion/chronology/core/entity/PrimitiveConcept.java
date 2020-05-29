package org.bibleetsciencediffusion.chronology.core.entity;

import org.bibleetsciencediffusion.chronology.core.value.Name;

import static org.bibleetsciencediffusion.chronology.core.entity.Concept.newConcept;
import static org.bibleetsciencediffusion.chronology.core.entity.Event.newEvent;
import static org.bibleetsciencediffusion.chronology.core.entity.Process.newProcess;
import static org.bibleetsciencediffusion.chronology.core.entity.Property.newProperty;
import static org.bibleetsciencediffusion.chronology.core.entity.Relation.newRelation;
import static org.bibleetsciencediffusion.chronology.core.entity.Role.newRole;

public interface PrimitiveConcept {

    Concept CONCEPT = newConcept(Name.ENGLISH, "concept")
            .addName(Name.FRENCH, "concept");
    Relation HAS_CLASS = newRelation(Name.ENGLISH, "has class")
            .addName(Name.FRENCH, "a pour classe");
    Concept RELATION = newConcept(Name.ENGLISH, "relation")
            .addName(Name.FRENCH, "relation")
            .addClass(CONCEPT);
    //.addClass(Concept.RELATION);
    Relation DEPENDENCY = newRelation(Name.ENGLISH, "dependency")
            .addName(Name.FRENCH, "dépendance")
            .addClass(Concept.RELATION);
    Concept ENTITY = newConcept(Name.ENGLISH, "entity")
            .addName(Name.FRENCH, "entité")
            .addClass(CONCEPT);
    Concept PROPERTY = newConcept(Name.ENGLISH, "property")
            .addName(Name.FRENCH, "propriété")
            .addClass(CONCEPT);
    Concept ROLE = newConcept(Name.ENGLISH, "role")
            .addName(Name.FRENCH, "rôle")
            .addClass(CONCEPT);
    Role TARGET = newRole(Name.ENGLISH, "target")
            .addName(Name.FRENCH, "cible")
            .addClass(Concept.ROLE);
    Concept PROCESS = newConcept(Name.ENGLISH, "process")
            .addName(Name.FRENCH, "processus")
            .addClass(RELATION);

    Concept EVENT = newConcept(Name.ENGLISH, "event")
            .addName(Name.FRENCH, "événement")
            .addClass(RELATION);

    Property VALUE = new Property(Name.ENGLISH, "date")
            .addName(Name.FRENCH, "date")
            //.setType(Object.class)
            .setSubject(Concept.PROPERTY)
            .addClass(Concept.PROPERTY);

    Concept LOGICAL_RELATION = newConcept(Name.ENGLISH, "logical relation")
            .addName(Name.FRENCH, "relation logique")
            .addClass(RELATION);

    Concept SPATIO_TEMPORAL_RELATION = newConcept(Name.ENGLISH, "spatio-temporal relation")
            .addName(Name.FRENCH, "relation spatio-temporelle")
            .addClass(RELATION);

    Concept TEMPORAL_RELATION = newConcept(Name.ENGLISH, "temporal relation")
            .addName(Name.FRENCH, "relation temporelle")
            .addClass(SPATIO_TEMPORAL_RELATION);

    Concept SPATIAL_RELATION = newConcept(Name.ENGLISH, "spatial relation")
            .addName(Name.FRENCH, "relation spaciale")
            .addClass(SPATIO_TEMPORAL_RELATION);

    Concept HUMAN = newConcept(Name.ENGLISH, "human")
            .addName(Name.FRENCH, "humain")
            .addClass(ENTITY);

    Concept PLACE = newConcept(Name.ENGLISH, "place")
            .addName(Name.FRENCH, "lieu")
            .addClass(ENTITY);

    Concept LANGUAGE = newConcept(Name.ENGLISH, "language")
            .addName(Name.FRENCH, "langue")
            .addClass(ENTITY);

    Property ISO_CODE = newProperty(Name.ENGLISH, "ISO code")
            .addName(Name.FRENCH, "code ISO")
            //.setType(String.class);
            .setSubject(Concept.LANGUAGE)
            .addProperty(Concept.VALUE, Void.TYPE)
            .addClass(Concept.PROPERTY);


    Property DATE = newProperty(Name.ENGLISH, "date")
            .addName(Name.FRENCH, "date")
            //.setType(Date.class)
            .setSubject(Concept.EVENT)
            .addClass(Concept.PROPERTY);

    Relation HAS_PARENT = newRelation(Name.ENGLISH, "has parent")
            .addName(Name.FRENCH, "a pour parent")
            .addClass(Concept.RELATION);

    Relation HAS_SIBLING = newRelation(Name.ENGLISH, "has sibling")
            .addName(Name.FRENCH, "a pour frère")
            .addClass(Concept.RELATION);

    Relation AND = newRelation(Name.ENGLISH, "and")
            .addName(Name.FRENCH, "et")
            .addClass(Concept.LOGICAL_RELATION);

    Relation OR = newRelation(Name.ENGLISH, "or")
            .addName(Name.FRENCH, "ou")
            .addClass(Concept.LOGICAL_RELATION);

    Relation NOT = newRelation(Name.ENGLISH, "not")
            .addName(Name.FRENCH, "non")
            .addClass(Concept.LOGICAL_RELATION);

    Relation REFERENCE = newRelation(Name.ENGLISH, "reference")
            .addName(Name.FRENCH, "référence")
            .addClass(Concept.RELATION);
    Role AGENT = newRole(Name.ENGLISH, "agent")
            .addName(Name.FRENCH, "agent")
            .addClass(Concept.ROLE);
    Role PATIENT = newRole(Name.ENGLISH, "patient")
            .addName(Name.FRENCH, "patient")
            .addClass(Concept.ROLE);
    Role LOCATION = newRole(Name.ENGLISH, "location")
            .addName(Name.FRENCH, "localisation")
            .addClass(Concept.ROLE);
    Role TIME = newRole(Name.ENGLISH, "time")
            .addName(Name.FRENCH, "temps")
            .addClass(Concept.ROLE);
    Role PARTICIPANT = newRole(Name.ENGLISH, "participant")
            .addName(Name.FRENCH, "participant")
            .addClass(Concept.ROLE);
    Role ORIGIN = newRole(Name.ENGLISH, "origin")
            .addName(Name.FRENCH, "origine")
            .addClass(Concept.ROLE);
    Role DESTINATION = newRole(Name.ENGLISH, "destination")
            .addName(Name.FRENCH, "destination")
            .addClass(Concept.ROLE);
    Role SOURCE = newRole(Name.ENGLISH, "source")
            .addName(Name.FRENCH, "source")
            .addClass(Concept.ROLE);
    Role CAUSE = newRole(Name.ENGLISH, "cause")
            .addName(Name.FRENCH, "cause")
            .addClass(Concept.ROLE);
    Role BEGIN = newRole(Name.ENGLISH, "begin")
            .addName(Name.FRENCH, "début")
            .addClass(Concept.ROLE);
    Role END = newRole(Name.ENGLISH, "end")
            .addName(Name.FRENCH, "fin")
            .addClass(Concept.ROLE);
    Event BIRTH = newEvent(Name.ENGLISH, "birth")
            .addName(Name.FRENCH, "naissance")
            .addRelation(newRelation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.HUMAN))
            .addClass(Concept.EVENT);
    Event DEATH = newEvent(Name.ENGLISH, "death")
            .addName(Name.FRENCH, "mort")
            .addRelation(newRelation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.HUMAN))
            .addClass(Concept.EVENT);
    Process LIFE = newProcess(Name.ENGLISH, "life")
            .addName(Name.FRENCH, "vie")
            .addRole(Role.AGENT, Concept.HUMAN)
            .addClass(Concept.PROCESS);
    Property NAME = newProperty(Name.ENGLISH, "name")
            .addName(Name.FRENCH, "nom")
            //.setType(Name.class)
            .setSubject(Concept.CONCEPT)
            .addClass(Concept.PROPERTY);
    Property YEAR = newProperty(Name.ENGLISH, "year")
            .addName(Name.FRENCH, "année")
            //.setType(Integer.class)
            .setSubject(Property.DATE)
            .addClass(Concept.PROPERTY);
    Event BIRTH_JC = newEvent(Name.ENGLISH, "birth of Jesus")
            .addName(Name.FRENCH, "naissance de Jésus")
            .addRole(Role.TIME, new Date().setYear(3925))
            .addClass(Event.BIRTH);
    Property MONTH = newProperty(Name.ENGLISH, "month")
            .addName(Name.FRENCH, "mois")
            .setType(Integer.class)
            .setSubject(Property.DATE)
            .addClass(Concept.PROPERTY);
    Property DAY = newProperty(Name.ENGLISH, "day")
            .addName(Name.FRENCH, "jour")
            .setType(Integer.class)
            .setSubject(Property.DATE)
            .addClass(Concept.PROPERTY);

    void accept(ConceptVisitor v);
}
