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
            .name("concept", Locale.ENGLISH)
            .name("concept", Locale.FRENCH);

    Concept TEMPORAL_STRUCTURE = createConcept("temporal structure")
            .name("temporal structure", Locale.ENGLISH)
            .name("structure temporelle", Locale.FRENCH)
            .subClassOf(CONCEPT);

    Property DYNAMIC = createProperty("dynamic")
            .name("dynamic", Locale.ENGLISH)
            .name("dynamique", Locale.FRENCH)
            .domain(TEMPORAL_STRUCTURE);

    Concept ACTION = createConcept("action")
            .name("action", Locale.ENGLISH)
            .name("action", Locale.FRENCH)
            .subClassOf(TEMPORAL_STRUCTURE);


    Concept STATE = createConcept("state")
            .name("state", Locale.ENGLISH)
            .name("state", Locale.FRENCH)
            .subClassOf(TEMPORAL_STRUCTURE);

    Property PROPERTY = createProperty("property")
            .name("property", Locale.ENGLISH)
            .name("propriété", Locale.FRENCH);

    Property TRANSITIONALITY = createProperty("transitionality")
            .name("transitionality", Locale.ENGLISH)
            .name("transitionalité", Locale.FRENCH);


    Relation RELATION = createRelation("relation")
            .name("relation", Locale.ENGLISH)
            .name("relation", Locale.FRENCH);
    Relation ROLE = createRelation("role")
            .name("Relation", Locale.ENGLISH)
            .name("rôle", Locale.FRENCH)
            .subRelationOf(RELATION);
    Relation TARGET = createRelation("target")
            .name("target", Locale.ENGLISH)
            .name("cible", Locale.FRENCH)
            .subRelationOf(ROLE);
    //.subClassOf(Concept.RELATION);
    Relation DEPENDENCY = createRelation("dependency")
            .name("dependency", Locale.ENGLISH)
            .name("dépendance", Locale.FRENCH)
            .subRelationOf(RELATION);

    Concept LIST = createConcept("list")
            .name("list", Locale.ENGLISH)
            .name("liste", Locale.FRENCH)
            .subClassOf(CONCEPT);
    Relation HAS_ELEMENT = createRelation("hasElement")
            .name("has for element", Locale.ENGLISH)
            .name("a pour élément", Locale.FRENCH)
            .subRelationOf(RELATION);


    Relation PROCESS = createRelation("process")
            .name("process", Locale.ENGLISH)
            .name("processus", Locale.FRENCH)
            .subRelationOf(RELATION);

    Relation EVENT = createRelation("event")
            .name("event", Locale.ENGLISH)
            .name("événement", Locale.FRENCH)
            .subRelationOf(RELATION);

    Relation LOGICAL_RELATION = createRelation("logicalRelation")
            .name("logical relation", Locale.ENGLISH)
            .name("relation logique", Locale.FRENCH)
            .subRelationOf(RELATION);

    Relation SPATIO_TEMPORAL_RELATION = createRelation("spatioTemporalRelation")
            .name("spatio-temporal relation", Locale.ENGLISH)
            .name("relation spatio-temporelle", Locale.FRENCH)
            .subRelationOf(RELATION);

    Relation TEMPORAL_RELATION = createRelation("temporalRelation")
            .name("temporal relation", Locale.ENGLISH)
            .name("relation temporelle", Locale.FRENCH)
            .subRelationOf(SPATIO_TEMPORAL_RELATION);

    Relation SPATIAL_RELATION = createRelation("spatialRelation").name("spatial relation", Locale.ENGLISH)
            .name("relation spaciale", Locale.FRENCH)
            .subRelationOf(SPATIO_TEMPORAL_RELATION);

    Concept HUMAN = createConcept("human")
            .name("human", Locale.ENGLISH)
            .name("humain", Locale.FRENCH)
            .subClassOf(CONCEPT);

    Concept PLACE = createConcept("place")
            .name("place", Locale.ENGLISH)
            .name("lieu", Locale.FRENCH)
            .subClassOf(CONCEPT);

    Concept LANGUAGE = createConcept("language")
            .name("language", Locale.ENGLISH)
            .name("langue", Locale.FRENCH)
            .subClassOf(CONCEPT);

    Property DATE = createProperty("date")
            .name("date", Locale.ENGLISH)
            .name("date", Locale.FRENCH);
    //.setType(Date.class)
    //.setDomain(EVENT)
    //.subClassOf(PROPERTY);

    Relation AND = createRelation("and").name("and", Locale.ENGLISH)
            .name("et", Locale.FRENCH)
            .subRelationOf(LOGICAL_RELATION);

    Relation OR = createRelation("or").name("or", Locale.ENGLISH)
            .name("ou", Locale.FRENCH)
            .subRelationOf(LOGICAL_RELATION);

    Relation NOT = createRelation("not").name("not", Locale.ENGLISH)
            .name("non", Locale.FRENCH)
            .subRelationOf(LOGICAL_RELATION);

    Relation HAS_AGENT = createRelation("hasAgent").name("agent", Locale.ENGLISH)
            .name("agent", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_PATIENT = createRelation("hasPatient").name("patient", Locale.ENGLISH)
            .name("patient", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_LOCATION = createRelation("hasLocation").name("location", Locale.ENGLISH)
            .name("localisation", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation OCCURS_TIME = createRelation("occursTime").name("time", Locale.ENGLISH)
            .name("temps", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_PARTICIPANT = createRelation("hasParticipant").name("participant", Locale.ENGLISH)
            .name("participant", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_ORIGIN = createRelation("hasOrigin").name("origin", Locale.ENGLISH)
            .name("origine", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_DESTINATION = createRelation("hasDestination").name("destination", Locale.ENGLISH)
            .name("destination", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_SOURCE = createRelation("hasSource").name("source", Locale.ENGLISH)
            .name("source", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_CAUSE = createRelation("hasCause").name("cause", Locale.ENGLISH)
            .name("cause", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation HAS_BEGIN = createRelation("hasBegin").name("begin", Locale.ENGLISH)
            .name("début", Locale.FRENCH)
            .subRelationOf(ROLE);
    Relation END = createRelation("hasEnd").name("end", Locale.ENGLISH)
            .name("fin", Locale.FRENCH)
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
