package com.bibleetsciencediffusion.chronology.semantics.core.ontology

import java.io.File

import org.phenoscape.scowl._
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.model.IRI

object TemporalStructureManchesterOntology extends App {

  val factory = OWLManager.getOWLDataFactory
  val label = factory.getRDFSLabel
  val comment = factory.getRDFSComment

  // ontology namespace
  val toplevel_ns = "http://purl.obolibrary.org/obo/"
  val ns = "http://bibleetsciencediffusion.org/chronology.owl#"

  val manager = OWLManager.createOWLOntologyManager()
  val ontology = manager.loadOntologyFromOntologyDocument(new File("C:\\Users\\frup43047\\Projects\\github.com\\BibleEtScienceDiffusion\\GenealogyTools\\src\\main\\resources\\ontologies\\bioontology-toplevel.rdf"))

  // variables
  val x = factory.getSWRLVariable(IRI.create(ns + "x"))

  // high level sememes
  val obj = factory.getOWLClass(IRI.create(toplevel_ns + "BFO_0000030"))
  val role = factory.getOWLClass(IRI.create(toplevel_ns + "BFO_0000023"))
  val agent_role = Class(ns + "agent_role")
  val patient_role = Class(ns + "patient_rome")
  val temporal_structure = factory.getOWLClass(IRI.create(toplevel_ns + "BFO_0000003"))
  val temporal_region = factory.getOWLClass(IRI.create(toplevel_ns + "BFO_0000008"))
  val state = Class(ns + "state")
  val action = Class(ns + "action")
  val activity = Class(ns + "activity")
  val accomplishment = Class(ns + "accomplishment")
  val achievement = Class(ns + "achievement")
  val date = Class(ns + "date")
  val human_being = Class(ns + "human_being")
  val animal_being = Class(ns + "animal_being")
  val biological_organism = Class(ns + "biological_organism")

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
  //val date = ObjectProperty(ns + "date")

  // semantic relations
  val part_of = factory.getOWLObjectProperty(IRI.create(toplevel_ns + "BFO_0000050"))
  val has_role = factory.getOWLObjectProperty(IRI.create(toplevel_ns + "RO_0000087"))
  val has_agent = ObjectProperty(ns + "has_agent")
  val has_patient = ObjectProperty(ns + "has_patient")


  val axioms = Set(
    // axioms
    biological_organism SubClassOf obj,
    biological_organism SubClassOf (animated value true),
    biological_organism Annotation(label, "biological organism" @@ "en"),
    biological_organism Annotation(label, "organisme biologique " @@ "fr"),

    human_being SubClassOf biological_organism,
    human_being Annotation(label, "human being" @@ "en"),
    human_being Annotation(label, "être humain " @@ "fr"),
    human_being SubClassOf (human value true),

    animal_being SubClassOf biological_organism,
    animal_being Annotation(label, "animal" @@ "en"),
    animal_being Annotation(label, "animal" @@ "fr"),
    animal_being SubClassOf (animal value true),
    animal_being DisjointWith human_being,

    // rules
    factory.getSWRLClassAtom(activity, x) --> factory.getSWRLClassAtom(action, x),
    accomplishment(x) --> action(x),


    animated Domain biological_organism,
    animated Range XSDBoolean,

    human Domain human_being,
    human Range XSDBoolean,

    living Domain human_being,
    living Domain animal_being,
    living Range XSDBoolean,

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

    date SubClassOf temporal_region,

    agent_role SubClassOf role,
    patient_role SubClassOf role,

    has_agent SubPropertyOf has_role,
    has_agent Domain action,
    has_agent Range agent_role,
    has_agent Annotation(label, "has agent" @@ "en"),
    has_agent Annotation(label, "a pour agent" @@ "fr"),

    has_patient SubPropertyOf has_role,
    has_patient Domain state,
    has_patient Range patient_role,
    has_patient Annotation(label, "has patient" @@ "en"),
    has_patient Annotation(label, "a pour patient" @@ "fr"),
  )

  axioms.foreach(a => manager.addAxiom(ontology, a))

  manager.saveOntology(ontology, IRI.create(new File(args(0))))

}
