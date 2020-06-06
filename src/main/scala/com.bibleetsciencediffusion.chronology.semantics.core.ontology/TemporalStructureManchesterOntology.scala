package com.bibleetsciencediffusion.chronology.semantics.core.ontology

import java.io.File

import org.phenoscape.scowl._
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.model.IRI
import org.semanticweb.owlapi.vocab.OWL2Datatype

object TemporalStructureManchesterOntology extends App {


  val factory = OWLManager.getOWLDataFactory
  val label = factory.getRDFSLabel
  val comment = factory.getRDFSComment

  // ontology namespace
  val ns = "http://bibleetsciencediffusion.org/chronology.owl#"


  // high level sememes
  val temporal_structure = Class(ns + "temporal_structure")
  val state = Class(ns + "state")
  val action = Class(ns + "action")
  val activity = Class(ns + "activity")
  val accomplishment = Class(ns + "accomplishment")
  val achievement = Class(ns + "achievement")
  val human_being = Class(ns + "human_being")
  val animal_being = Class(ns + "animal_being")
  val animated_thing = Class(ns + "animated_thing")
  val place = Class(ns + "place")
  val event = Class(ns + "event")

  // semes
  val dynamic = DataProperty(ns + "dynamic")
  val transitional = DataProperty(ns + "transitional")
  val bounded = DataProperty(ns + "bounded")
  val momentaneous = DataProperty(ns + "momentaneous")
  val animated = DataProperty(ns + "animated")
  val human = DataProperty(ns + "human")
  val animal = DataProperty(ns + "animal")
  val inchoative = DataProperty(ns + "inchoative")
  val teminative = DataProperty(ns + "terminative")
  val living = DataProperty(ns + "living")
  val date = DataProperty(ns + "date")

  // semantic relations
  val part_of = ObjectProperty(ns + "part_of")
  val role = ObjectProperty(ns + "role")
  val agent = ObjectProperty(ns + "agent")
  val patient = ObjectProperty(ns + "patient")
  val location = ObjectProperty(ns + "location")
  val occurrence = ObjectProperty(ns + "occurence")


  val ontology = Ontology("http://bibleetsciencediffusion.org/chronology.owl", Set(
    // axioms
    animated_thing SubClassOf OWLThing,
    animated_thing SubClassOf (animated value true),
    animated_thing Annotation(label, "animated thing" @@ "en"),
    animated_thing Annotation(label, "chose animée " @@ "fr"),

    human_being SubClassOf animated_thing,
    human_being Annotation(label, "human being" @@ "en"),
    human_being Annotation(label, "être humain " @@ "fr"),
    human_being SubClassOf (human value true),

    animal_being SubClassOf animated_thing,
    animal_being Annotation(label, "animal" @@ "en"),
    animal_being Annotation(label, "animal" @@ "fr"),
    animal_being SubClassOf (animal value true),
    animal_being DisjointWith human_being,

    place SubClassOf OWLThing,
    place Annotation(label, "place" @@ "en"),
    place Annotation(label, "place" @@ "fr"),

    date Domain event,
    date Annotation(label, "date" @@ "en"),
    date Annotation(label, "date" @@ "fr"),
    date Range OWL2Datatype.XSD_STRING.getDatatype(factory),

    event SubClassOf OWLThing,
    event Annotation(label, "event" @@ "en"),
    event Annotation(label, "événement" @@ "fr"),

    animated Domain OWLThing,
    animated Range XSDBoolean,

    human Domain human_being,
    human Range XSDBoolean,

    living Domain human_being,
    living Domain animal_being,
    living Range XSDBoolean,

    temporal_structure SubClassOf OWLThing,
    temporal_structure Annotation(label, "temporal structure" @@ "en"),
    temporal_structure Annotation(label, "structure temporelle " @@ "fr"),

    // top seme of sememe temporal_structure
    dynamic Domain temporal_structure,
    dynamic Range XSDBoolean,
    dynamic Annotation(label, "dynamic" @@ "en"),
    dynamic Annotation(label, "dynamique" @@ "fr"),
    dynamic Annotation(comment, "top level seme of temporal structures" @@ "en"),
    dynamic Annotation(comment, "sème de premier niveau des structures temporelles" @@ "fr"),

    // first level of distrinction
    state SubClassOf temporal_structure,
    action SubClassOf temporal_structure,
    state DisjointWith action,
    state SubClassOf (dynamic value false),
    state Annotation(label, "state" @@ "en"),
    state Annotation(label, "état" @@ "fr"),
    action Annotation(label, "action" @@ "en"),
    action Annotation(label, "action" @@ "fr"),

    momentaneous Domain achievement,
    momentaneous Domain activity,
    momentaneous Range XSDBoolean,
    bounded Domain action,
    bounded Range XSDBoolean,

    activity SubClassOf action,
    activity SubClassOf ((bounded value false) and (momentaneous value false)),
    accomplishment SubClassOf action,
    achievement SubClassOf action,

    role Domain temporal_structure,
    role Range OWLThing,
    role Annotation(label, "role" @@ "en"),
    role Annotation(label, "rôle" @@ "fr"),

    agent SubPropertyOf role,
    agent Domain action,
    agent Range animated_thing,
    agent Annotation(label, "agent" @@ "en"),
    agent Annotation(label, "agent" @@ "fr"),

    patient SubPropertyOf role,
    patient Domain state,
    patient Range OWLThing,

    location SubPropertyOf role,
    location Domain temporal_structure,
    location Range place,

    occurrence SubPropertyOf role,
    occurrence Domain temporal_structure,
    occurrence Range event,

  ))
  ontology.getOWLOntologyManager.saveOntology(ontology, IRI.create(new File(args(0))))

}
