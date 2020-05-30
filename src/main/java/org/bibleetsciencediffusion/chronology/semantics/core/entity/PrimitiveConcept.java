package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.value.Name;

import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept.newConcept;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Process.newProcess;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Property.newProperty;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Relation.newRelation;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Role.newRole;

public interface PrimitiveConcept {

    Concept CONCEPT = newConcept(Name.ENGLISH, "concept")
            .addName(Name.FRENCH, "concept");
    Relation HAS_CLASS = newRelation(Name.ENGLISH, "has class")
            .addName(Name.FRENCH, "a pour classe");
    Concept RELATION = newConcept(Name.ENGLISH, "relation")
            .addName(Name.FRENCH, "relation")
            .addClass(CONCEPT);
    Concept ROLE = newConcept(Name.ENGLISH, "role")
            .addName(Name.FRENCH, "rôle")
            .addClass(CONCEPT);
    Role TARGET = newRole(Name.ENGLISH, "target")
            .addName(Name.FRENCH, "cible")
            .addClass(ROLE);
    //.addClass(Concept.RELATION);
    Relation DEPENDENCY = newRelation(Name.ENGLISH, "dependency")
            .addName(Name.FRENCH, "dépendance")
            .addClass(RELATION);
    Concept ENTITY = newConcept(Name.ENGLISH, "entity")
            .addName(Name.FRENCH, "entité")
            .addClass(CONCEPT);
    Concept PROPERTY = newConcept(Name.ENGLISH, "property")
            .addName(Name.FRENCH, "propriété")
            .addClass(CONCEPT);

    Concept PROCESS = newConcept(Name.ENGLISH, "process")
            .addName(Name.FRENCH, "processus")
            .addClass(RELATION);

    Concept EVENT = newConcept(Name.ENGLISH, "event")
            .addName(Name.FRENCH, "événement")
            .addClass(RELATION);
    Property VALUE = new Property(Name.ENGLISH, "date")
            .addName(Name.FRENCH, "date")
            //.setType(Object.class)
            .setSubject(PROPERTY)
            .addClass(PROPERTY);

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
            .setSubject(LANGUAGE)
            .addProperty(VALUE, Void.TYPE)
            .addClass(PROPERTY);


    Property DATE = newProperty(Name.ENGLISH, "date")
            .addName(Name.FRENCH, "date")
            //.setType(Date.class)
            .setSubject(EVENT)
            .addClass(PROPERTY);

    Relation HAS_PARENT = newRelation(Name.ENGLISH, "has parent")
            .addName(Name.FRENCH, "a pour parent")
            .addClass(RELATION);

    Relation HAS_SIBLING = newRelation(Name.ENGLISH, "has sibling")
            .addName(Name.FRENCH, "a pour frère")
            .addClass(RELATION);

    Relation AND = newRelation(Name.ENGLISH, "and")
            .addName(Name.FRENCH, "et")
            .addClass(LOGICAL_RELATION);

    Relation OR = newRelation(Name.ENGLISH, "or")
            .addName(Name.FRENCH, "ou")
            .addClass(LOGICAL_RELATION);

    Relation NOT = newRelation(Name.ENGLISH, "not")
            .addName(Name.FRENCH, "non")
            .addClass(LOGICAL_RELATION);

    Relation REFERENCE = newRelation(Name.ENGLISH, "reference")
            .addName(Name.FRENCH, "référence")
            .addClass(RELATION);
    Role AGENT = newRole(Name.ENGLISH, "agent")
            .addName(Name.FRENCH, "agent")
            .addClass(ROLE);
    Role PATIENT = newRole(Name.ENGLISH, "patient")
            .addName(Name.FRENCH, "patient")
            .addClass(ROLE);
    Role LOCATION = newRole(Name.ENGLISH, "location")
            .addName(Name.FRENCH, "localisation")
            .addClass(ROLE);
    Role TIME = newRole(Name.ENGLISH, "time")
            .addName(Name.FRENCH, "temps")
            .addClass(ROLE);
    Role PARTICIPANT = newRole(Name.ENGLISH, "participant")
            .addName(Name.FRENCH, "participant")
            .addClass(ROLE);
    Role ORIGIN = newRole(Name.ENGLISH, "origin")
            .addName(Name.FRENCH, "origine")
            .addClass(ROLE);
    Role DESTINATION = newRole(Name.ENGLISH, "destination")
            .addName(Name.FRENCH, "destination")
            .addClass(ROLE);
    Role SOURCE = newRole(Name.ENGLISH, "source")
            .addName(Name.FRENCH, "source")
            .addClass(ROLE);
    Role CAUSE = newRole(Name.ENGLISH, "cause")
            .addName(Name.FRENCH, "cause")
            .addClass(ROLE);
    Role BEGIN = newRole(Name.ENGLISH, "begin")
            .addName(Name.FRENCH, "début")
            .addClass(ROLE);
    Role END = newRole(Name.ENGLISH, "end")
            .addName(Name.FRENCH, "fin")
            .addClass(ROLE);
    Event BIRTH = Event.newEvent(Name.ENGLISH, "birth")
            .addName(Name.FRENCH, "naissance")
            .addRelation(newRelation(DEPENDENCY).addRole(TARGET, HUMAN))
            .addClass(EVENT);
    Event DEATH = Event.newEvent(Name.ENGLISH, "death")
            .addName(Name.FRENCH, "mort")
            .addRelation(newRelation(DEPENDENCY).addRole(TARGET, HUMAN))
            .addClass(EVENT);
    Process LIFE = newProcess(Name.ENGLISH, "life")
            .addName(Name.FRENCH, "vie")
            .addRole(AGENT, HUMAN)
            .addClass(PROCESS);
    Property NAME = newProperty(Name.ENGLISH, "name")
            .addName(Name.FRENCH, "nom")
            //.setType(Name.class)
            .setSubject(CONCEPT)
            .addClass(PROPERTY);
    Property YEAR = newProperty(Name.ENGLISH, "year")
            .addName(Name.FRENCH, "année")
            //.setType(Integer.class)
            .setSubject(DATE)
            .addClass(PROPERTY);
    Event BIRTH_JC = Event.newEvent(Name.ENGLISH, "birth of Jesus")
            .addName(Name.FRENCH, "naissance de Jésus")
            .addRole(TIME, new Date().setYear(3925))
            .addClass(BIRTH);
    Property MONTH = newProperty(Name.ENGLISH, "month")
            .addName(Name.FRENCH, "mois")
            .setType(Integer.class)
            .setSubject(DATE)
            .addClass(PROPERTY);
    Property DAY = newProperty(Name.ENGLISH, "day")
            .addName(Name.FRENCH, "jour")
            .setType(Integer.class)
            .setSubject(DATE)
            .addClass(PROPERTY);

    void accept(ConceptVisitor v);
}
