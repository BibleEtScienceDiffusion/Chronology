package org.bibleetsciencediffusion.chronology.semantics.core.service;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class OntologyService {
    private static OntologyService instance = new OntologyService();
    private OWLOntologyManager ontologyManager;


    private OWLOntology ontology;

    private OntologyService() {
        ontologyManager = OWLManager.createOWLOntologyManager();
        // default ontology;
        try {
            ontology = ontologyManager.createOntology();
        } catch (OWLOntologyCreationException e) {
            //OK
        }
    }

    public static OntologyService getInstance() {
        return instance;
    }

    public OWLOntologyManager getOntologyManager() {
        return ontologyManager;
    }

    public void setOntologyManager(OWLOntologyManager ontologyManager) {
        this.ontologyManager = ontologyManager;
    }

    public OWLOntology getOntology() {
        return ontology;
    }

    public void setOntology(OWLOntology ontology) {
        this.ontology = ontology;
    }

    public void addAxiom(OWLAxiom axiom) {
        ontologyManager.addAxiom(ontology, axiom);
    }


}
