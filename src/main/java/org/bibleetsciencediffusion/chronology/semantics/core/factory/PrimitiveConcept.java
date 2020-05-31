package org.bibleetsciencediffusion.chronology.semantics.core.factory;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Process;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.*;

import java.util.Locale;

import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept.newConcept;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Process.newProcess;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Property.newProperty;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Relation.newRelation;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Role.newRole;

public interface PrimitiveConcept {

    Concept CONCEPT = newConcept(Locale.ENGLISH, "concept")
            .addName(Locale.FRENCH, "concept");
    Relation HAS_CLASS = newRelation(Locale.ENGLISH, "has class")
            .addName(Locale.FRENCH, "a pour classe");
    Concept RELATION = newConcept(Locale.ENGLISH, "relation")
            .addName(Locale.FRENCH, "relation")
            .addClass(CONCEPT);
    Concept ROLE = newConcept(Locale.ENGLISH, "role")
            .addName(Locale.FRENCH, "rôle")
            .addClass(CONCEPT);
    Role TARGET = newRole(Locale.ENGLISH, "target")
            .addName(Locale.FRENCH, "cible")
            .addClass(ROLE);
    //.addClass(Concept.RELATION);
    Relation DEPENDENCY = newRelation(Locale.ENGLISH, "dependency")
            .addName(Locale.FRENCH, "dépendance")
            .addClass(RELATION);
    Relation EQUIVALENCY = newRelation(Locale.ENGLISH, "equivalency")
            .addName(Locale.FRENCH, "équivalence")
            .addClass(RELATION);
    Concept LIST = newConcept(Locale.ENGLISH, "list")
            .addName(Locale.FRENCH, "liste")
            .addClass(CONCEPT);
    Relation HAS_ELEMENT = newRelation(Locale.ENGLISH, "has for element")
            .addName(Locale.FRENCH, "a pour élément")
            .addClass(RELATION);
    Concept ENTITY = newConcept(Locale.ENGLISH, "entity")
            .addName(Locale.FRENCH, "entité")
            .addClass(CONCEPT);
    Concept PROPERTY = newConcept(Locale.ENGLISH, "property")
            .addName(Locale.FRENCH, "propriété")
            .addClass(CONCEPT);

    Concept PROCESS = newConcept(Locale.ENGLISH, "process")
            .addName(Locale.FRENCH, "processus")
            .addClass(RELATION);

    Concept EVENT = newConcept(Locale.ENGLISH, "event")
            .addName(Locale.FRENCH, "événement")
            .addClass(RELATION);
    Property VALUE = newProperty(Locale.ENGLISH, "date")
            .addName(Locale.FRENCH, "date")
            //.setType(Object.class)
            .setSubject(PROPERTY)
            .addClass(PROPERTY);

    Concept LOGICAL_RELATION = newConcept(Locale.ENGLISH, "logical relation")
            .addName(Locale.FRENCH, "relation logique")
            .addClass(RELATION);

    Concept SPATIO_TEMPORAL_RELATION = newConcept(Locale.ENGLISH, "spatio-temporal relation")
            .addName(Locale.FRENCH, "relation spatio-temporelle")
            .addClass(RELATION);

    Concept TEMPORAL_RELATION = newConcept(Locale.ENGLISH, "temporal relation")
            .addName(Locale.FRENCH, "relation temporelle")
            .addClass(SPATIO_TEMPORAL_RELATION);

    Concept SPATIAL_RELATION = newConcept(Locale.ENGLISH, "spatial relation")
            .addName(Locale.FRENCH, "relation spaciale")
            .addClass(SPATIO_TEMPORAL_RELATION);

    Concept HUMAN = newConcept(Locale.ENGLISH, "human")
            .addName(Locale.FRENCH, "humain")
            .addClass(ENTITY);

    Concept PLACE = newConcept(Locale.ENGLISH, "place")
            .addName(Locale.FRENCH, "lieu")
            .addClass(ENTITY);

    Concept LANGUAGE = newConcept(Locale.ENGLISH, "language")
            .addName(Locale.FRENCH, "langue")
            .addClass(ENTITY);

    Property ISO_CODE = newProperty(Locale.ENGLISH, "ISO code")
            .addName(Locale.FRENCH, "code ISO")
            //.setType(String.class);
            .setSubject(LANGUAGE)
            .addProperty(VALUE, Void.TYPE)
            .addClass(PROPERTY);


    Property DATE = newProperty(Locale.ENGLISH, "date")
            .addName(Locale.FRENCH, "date")
            //.setType(Date.class)
            .setSubject(EVENT)
            .addClass(PROPERTY);

    Relation HAS_PARENT = newRelation(Locale.ENGLISH, "has parent")
            .addName(Locale.FRENCH, "a pour parent")
            .addClass(RELATION);

    Relation HAS_SIBLING = newRelation(Locale.ENGLISH, "has sibling")
            .addName(Locale.FRENCH, "a pour frère")
            .addClass(RELATION);

    Relation AND = newRelation(Locale.ENGLISH, "and")
            .addName(Locale.FRENCH, "et")
            .addClass(LOGICAL_RELATION);

    Relation OR = newRelation(Locale.ENGLISH, "or")
            .addName(Locale.FRENCH, "ou")
            .addClass(LOGICAL_RELATION);

    Relation NOT = newRelation(Locale.ENGLISH, "not")
            .addName(Locale.FRENCH, "non")
            .addClass(LOGICAL_RELATION);

    Relation REFERENCE = newRelation(Locale.ENGLISH, "reference")
            .addName(Locale.FRENCH, "référence")
            .addClass(RELATION);
    Role AGENT = newRole(Locale.ENGLISH, "agent")
            .addName(Locale.FRENCH, "agent")
            .addClass(ROLE);
    Role PATIENT = newRole(Locale.ENGLISH, "patient")
            .addName(Locale.FRENCH, "patient")
            .addClass(ROLE);
    Role LOCATION = newRole(Locale.ENGLISH, "location")
            .addName(Locale.FRENCH, "localisation")
            .addClass(ROLE);
    Role TIME = newRole(Locale.ENGLISH, "time")
            .addName(Locale.FRENCH, "temps")
            .addClass(ROLE);
    Role PARTICIPANT = newRole(Locale.ENGLISH, "participant")
            .addName(Locale.FRENCH, "participant")
            .addClass(ROLE);
    Role ORIGIN = newRole(Locale.ENGLISH, "origin")
            .addName(Locale.FRENCH, "origine")
            .addClass(ROLE);
    Role DESTINATION = newRole(Locale.ENGLISH, "destination")
            .addName(Locale.FRENCH, "destination")
            .addClass(ROLE);
    Role SOURCE = newRole(Locale.ENGLISH, "source")
            .addName(Locale.FRENCH, "source")
            .addClass(ROLE);
    Role CAUSE = newRole(Locale.ENGLISH, "cause")
            .addName(Locale.FRENCH, "cause")
            .addClass(ROLE);
    Role BEGIN = newRole(Locale.ENGLISH, "begin")
            .addName(Locale.FRENCH, "début")
            .addClass(ROLE);
    Role END = newRole(Locale.ENGLISH, "end")
            .addName(Locale.FRENCH, "fin")
            .addClass(ROLE);
    Event BIRTH = Event.newEvent(Locale.ENGLISH, "birth")
            .addName(Locale.FRENCH, "naissance")
            .addRelation(newRelation(DEPENDENCY).addRole(TARGET, HUMAN))
            .addClass(EVENT);
    Event DEATH = Event.newEvent(Locale.ENGLISH, "death")
            .addName(Locale.FRENCH, "mort")
            .addRelation(newRelation(DEPENDENCY).addRole(TARGET, HUMAN))
            .addClass(EVENT);
    Process LIFE = newProcess(Locale.ENGLISH, "life")
            .addName(Locale.FRENCH, "vie")
            .addRole(AGENT, HUMAN)
            .addClass(PROCESS);
    Property NAME = newProperty(Locale.ENGLISH, "name")
            .addName(Locale.FRENCH, "nom")
            //.setType(Name.class)
            .setSubject(CONCEPT)
            .addClass(PROPERTY);
    Property YEAR = newProperty(Locale.ENGLISH, "year")
            .addName(Locale.FRENCH, "année")
            //.setType(Integer.class)
            .setSubject(DATE)
            .addClass(PROPERTY);
    Event BIRTH_JC = Event.newEvent(Locale.ENGLISH, "birth of Jesus")
            .addName(Locale.FRENCH, "naissance de Jésus")
            .addRole(TIME, new Date().setYear(3925))
            .addClass(BIRTH);
    Property MONTH = newProperty(Locale.ENGLISH, "month")
            .addName(Locale.FRENCH, "mois")
            .setType(Integer.class)
            .setSubject(DATE)
            .addClass(PROPERTY);
    Property DAY = newProperty(Locale.ENGLISH, "day")
            .addName(Locale.FRENCH, "jour")
            .setType(Integer.class)
            .setSubject(DATE)
            .addClass(PROPERTY);

    void accept(ConceptVisitor v);
}
