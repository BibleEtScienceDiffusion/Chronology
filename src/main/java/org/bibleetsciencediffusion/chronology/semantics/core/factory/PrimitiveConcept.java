package org.bibleetsciencediffusion.chronology.semantics.core.factory;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.Property;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.Relation;

import java.util.Locale;

import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept.createConcept;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Property.createProperty;
import static org.bibleetsciencediffusion.chronology.semantics.core.entity.Relation.createRelation;

public interface PrimitiveConcept {

    Concept CONCEPT = createConcept("concept")
            .addName("concept", Locale.ENGLISH)
            .addName("concept", Locale.FRENCH);

    Property PROPERTY = createProperty("property")
            .addName("property", Locale.ENGLISH)
            .addName("propriété", Locale.FRENCH);
    Relation RELATION = createRelation("relation")
            .addName("relation", Locale.ENGLISH)
            .addName("relation", Locale.FRENCH);
    Relation ROLE = createRelation("role")
            .addName("Relation", Locale.ENGLISH)
            .addName("rôle", Locale.FRENCH)
            .subRelationOf(RELATION);
    Relation TARGET = createRelation("target")
            .addName("target", Locale.ENGLISH)
            .addName("cible", Locale.FRENCH)
            .subRelationOf(ROLE);
    //.subClassOf(Concept.RELATION);
    Relation DEPENDENCY = createRelation("dependency")
            .addName("dependency", Locale.ENGLISH)
            .addName("dépendance", Locale.FRENCH)
            .subRelationOf(RELATION);

    Concept LIST = createConcept("list")
            .addName("list", Locale.ENGLISH)
            .addName("liste", Locale.FRENCH)
            .subClassOf(CONCEPT);
    Relation HAS_ELEMENT = createRelation("hasElement")
            .addName("has for element", Locale.ENGLISH)
            .addName("a pour élément", Locale.FRENCH)
            .subRelationOf(RELATION);


    Relation PROCESS = createRelation("process")
            .addName("process", Locale.ENGLISH)
            .addName("processus", Locale.FRENCH)
            .subRelationOf(RELATION);

    Relation EVENT = createRelation("event")
            .addName("event", Locale.ENGLISH)
            .addName("événement", Locale.FRENCH)
            .subRelationOf(RELATION);

    Relation LOGICAL_RELATION = createRelation("logicalRelation")
            .addName("logical relation", Locale.ENGLISH)
            .addName("relation logique", Locale.FRENCH)
            .subRelationOf(RELATION);

    Relation SPATIO_TEMPORAL_RELATION = createRelation("spatioTemporalRelation")
            .addName("spatio-temporal relation", Locale.ENGLISH)
            .addName("relation spatio-temporelle", Locale.FRENCH)
            .subRelationOf(RELATION);

    Relation TEMPORAL_RELATION = createRelation("temporalRelation")
            .addName("temporal relation", Locale.ENGLISH)
            .addName("relation temporelle", Locale.FRENCH)
            .subRelationOf(SPATIO_TEMPORAL_RELATION);

    Relation SPATIAL_RELATION = createRelation("spatialRelation").addName("spatial relation", Locale.ENGLISH)
            .addName("relation spaciale", Locale.FRENCH)
            .subRelationOf(SPATIO_TEMPORAL_RELATION);

    Concept HUMAN = createConcept("human")
            .addName("human", Locale.ENGLISH)
            .addName("humain", Locale.FRENCH)
            .subClassOf(CONCEPT);

    Concept PLACE = createConcept("place")
            .addName("place", Locale.ENGLISH)
            .addName("lieu", Locale.FRENCH)
            .subClassOf(CONCEPT);

    Concept LANGUAGE = createConcept("language")
            .addName("language", Locale.ENGLISH)
            .addName("langue", Locale.FRENCH)
            .subClassOf(CONCEPT);

    Property DATE = createProperty("date")
            .addName("date", Locale.ENGLISH)
            .addName("date", Locale.FRENCH);
    //.setType(Date.class)
    //.setDomain(EVENT)
    //.subClassOf(PROPERTY);

    Relation AND = createRelation("and").addName("and", Locale.ENGLISH)
            .addName("et", Locale.FRENCH)
            .subRelationOf(LOGICAL_RELATION);

    Relation OR = createRelation("or").addName("or", Locale.ENGLISH)
            .addName("ou", Locale.FRENCH)
            .subRelationOf(LOGICAL_RELATION);

    Relation NOT = createRelation("not").addName("not", Locale.ENGLISH)
            .addName("non", Locale.FRENCH)
            .subRelationOf(LOGICAL_RELATION);

    Relation HAS_AGENT = createRelation("hasAgent").addName("agent", Locale.ENGLISH)
            .addName("agent", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_PATIENT = createRelation("hasPatient").addName("patient", Locale.ENGLISH)
            .addName("patient", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_LOCATION = createRelation("hasLocation").addName("location", Locale.ENGLISH)
            .addName("localisation", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation OCCURS_TIME = createRelation("occursTime").addName("time", Locale.ENGLISH)
            .addName("temps", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_PARTICIPANT = createRelation("hasParticipant").addName("participant", Locale.ENGLISH)
            .addName("participant", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_ORIGIN = createRelation("hasOrigin").addName("origin", Locale.ENGLISH)
            .addName("origine", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_DESTINATION = createRelation("hasDestination").addName("destination", Locale.ENGLISH)
            .addName("destination", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_SOURCE = createRelation("hasSource").addName("source", Locale.ENGLISH)
            .addName("source", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_CAUSE = createRelation("hasCause").addName("cause", Locale.ENGLISH)
            .addName("cause", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_BEGIN = createRelation("hasBegin").addName("begin", Locale.ENGLISH)
            .addName("début", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation END = createRelation("hasEnd").addName("end", Locale.ENGLISH)
            .addName("fin", Locale.FRENCH)
            .subRelationOf(ROLE);
    /*
    Event BIRTH = Event.newEvent("").addName(,Locale.ENGLISH "birth")
            .addName(,Locale.FRENCH "naissance")
            .addRelation(createRelation(DEPENDENCY).addRelation(TARGET, HUMAN))
            .subClassOf(EVENT);
    Event DEATH = Event.newEvent("").addName(,Locale.ENGLISH "death")
            .addName(,Locale.FRENCH "mort")
            .addRelation(createRelation(DEPENDENCY).addRelation(TARGET, HUMAN))
            .subClassOf(EVENT);
    Process LIFE = newProcess("").addName(,Locale.ENGLISH "life")
            .addName(,Locale.FRENCH "vie")
            .addRelation(AGENT, HUMAN)
            .subClassOf(PROCESS);
    Property NAME = createProperty("").addName(,Locale.ENGLISH "name")
            .addName(,Locale.FRENCH "nom")
            //.setType(Name.class)
            .setDomain(CONCEPT)
            .subClassOf(PROPERTY);
    Property YEAR = createProperty("").addName(,Locale.ENGLISH "year")
            .addName(,Locale.FRENCH "année")
            //.setType(Integer.class)
            .setDomain(DATE)
            .subClassOf(PROPERTY);
    Event BIRTH_JC = Event.newEvent("").addName(,Locale.ENGLISH "birth of Jesus")
            .addName(,Locale.FRENCH "naissance de Jésus")
            .addRelation(TIME, new Date().setYear(3925))
            .subClassOf(BIRTH);
    Property MONTH = createProperty("").addName(,Locale.ENGLISH "month")
            .addName(,Locale.FRENCH "mois")
            .setType(Integer.class)
            .setDomain(DATE)
            .subClassOf(PROPERTY);
    Property DAY = createProperty("").addName(,Locale.ENGLISH "day")
            .addName(,Locale.FRENCH "jour")
            .setType(Integer.class)
            .setDomain(DATE)
            .subClassOf(PROPERTY);
  */


}
