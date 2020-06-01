package org.bibleetsciencediffusion.chronology.semantics.core.entity;


//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.bibleetsciencediffusion.chronology.semantics.core.service.OntologyService;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * TODO: prepare extension and intension
 */


//@JsonIgnoreProperties

/**
 * instanciation of concept with a concrete state
 */
public class Referent extends NamedEntity<OWLNamedIndividual> {


    // space it is located in (mental space, according Fauconnier)
    Referent space;

    private List<Process> process = new ArrayList<Process>();

    public Referent(OWLNamedIndividual individual) {
        this.setOWLObject(individual);
    }

    public String getId() {
        return getOWLObject().toStringID();
    }

    public static Referent newReferent(String id) {
        return EntityFactory.getInstance().newReferent(id);
    }


    public Referent addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Referent addName(Locale locale, String localizedName) {
        super.addName(locale, localizedName);
        return this;
    }

    public Referent addProcess(Process process) {
        this.process.add(process);
        //process.setSubject(this.clone());
        return this;
    }

    public Referent isA(Concept concept) {
        OWLClassAssertionAxiom classAssertion = EntityFactory.getInstance().getDataFactory()
                .getOWLClassAssertionAxiom(concept.getOWLObject(),
                        getOWLObject());
        OntologyService.getInstance().addAxiom(classAssertion);
        return this;
    }

    public Referent hasA(Relation relation, Referent referent) {
        OWLObjectPropertyAssertionAxiom assertion = EntityFactory.getInstance()
                .getDataFactory().getOWLObjectPropertyAssertionAxiom(relation.getOWLObject(),
                        getOWLObject(),
                        referent.getOWLObject());
        OntologyService.getInstance().addAxiom(assertion);
        return this;
    }

    public Referent hasA(Property property, Integer value) {
        OWLDataPropertyAssertionAxiom assertion = EntityFactory.getInstance()
                .getDataFactory().getOWLDataPropertyAssertionAxiom(property.getOWLObject(),
                        getOWLObject(),
                        value);
        OntologyService.getInstance().addAxiom(assertion);
        return this;
    }

    public Referent hasA(Property property, String value) {
        OWLDataPropertyAssertionAxiom assertion = EntityFactory.getInstance()
                .getDataFactory().getOWLDataPropertyAssertionAxiom(property.getOWLObject(),
                        getOWLObject(),
                        value);
        OntologyService.getInstance().addAxiom(assertion);
        return this;
    }

    public Referent hasA(Property property, Boolean value) {
        OWLDataPropertyAssertionAxiom assertion = EntityFactory.getInstance()
                .getDataFactory().getOWLDataPropertyAssertionAxiom(property.getOWLObject(),
                        getOWLObject(),
                        value);
        OntologyService.getInstance().addAxiom(assertion);
        return this;
    }


    public Referent getSpace() {
        return space;
    }

    public void setSpace(Referent space) {
        this.space = space;
    }


    public Referent clone() {
        return clone();
    }

    public void accept(EntityVisitor v) {
        v.visit(this);
    }


}