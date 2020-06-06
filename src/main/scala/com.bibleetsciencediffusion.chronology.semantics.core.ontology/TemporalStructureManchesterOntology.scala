package com.bibleetsciencediffusion.chronology.semantics.core.ontology

import java.io.File

import org.phenoscape.scowl._
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.model.IRI

object TemporalStructureManchesterOntology extends App {

  // ontology namespace
  val ns = "http://bibleetsciencediffusion.org/chronology.owl#"

  // high level sememes
  val temporal_structure = Class(ns + "temporal_structure")
  val state = Class(ns + "state")
  val action = Class(ns + "action")
  val activity = Class(ns + "activity")
  val accomplishment = Class(ns + "accomplishment")
  val achievement = Class(ns + "achievement")

  // semes
  val dynamic = DataProperty(ns + "dynamic")
  val transitional = DataProperty(ns + "transitional")
  val bounded = DataProperty(ns + "bounded")
  val momentaneous = DataProperty(ns + "momentaneous")

  // semantic relations
  val part_of = ObjectProperty(ns + "part_of")

  val factory = OWLManager.getOWLDataFactory
  val label = factory.getRDFSLabel
  val comment = factory.getRDFSComment

  val ontology = Ontology("http://bibleetsciencediffusion.org/chronology.owl", Set(
    // axioms

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


  ))
  ontology.getOWLOntologyManager.saveOntology(ontology, IRI.create(new File(args(0))))

}
