package org.bibleetsciencediffusion.chronology.semantics.core

import java.io.File

import org.phenoscape.scowl._
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.model.IRI

object TemporalStructureManchesterOntology extends App {

  val factory = OWLManager.getOWLDataFactory
  val ns = "http://bibleetsciencediffusion.org/chronology.owl#"
  val temporal_structure = Class(ns + "temporal_structure")
  val state = Class(ns + "state")
  val action = Class(ns + "action")
  val activity = Class(ns + "activity")
  val accomplishment = Class(ns + "accomplishment")
  val achievement = Class(ns + "achievement")

  val dynamic = DataProperty(ns + "dynamic")
  val transitional = DataProperty(ns + "transitional")
  val bounded = DataProperty(ns + "bounded")
  val momentaneous = DataProperty(ns + "momentaneous")

  val part_of = ObjectProperty(ns + "part_of")
  val label = factory.getRDFSLabel

  val ontology = Ontology("http://bibleetsciencediffusion.org/chronology.owl", Set(
    temporal_structure Annotation(label, "temporal structure" @@ "en"),
    dynamic Domain temporal_structure,
    dynamic Range XSDBoolean,
    momentaneous Domain achievement,
    bounded Domain action,
    state SubClassOf temporal_structure,
    action SubClassOf temporal_structure,
    state DisjointWith action,
    activity SubClassOf action,
    activity SubClassOf ((bounded value false) and (momentaneous value false)),
    accomplishment SubClassOf action,
    achievement SubClassOf action,

    state SubClassOf (dynamic value false)


  ))
  ontology.getOWLOntologyManager.saveOntology(ontology, IRI.create(new File(args(0))))

}