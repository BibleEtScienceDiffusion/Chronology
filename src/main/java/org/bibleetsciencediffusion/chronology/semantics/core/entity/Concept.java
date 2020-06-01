package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.bibleetsciencediffusion.chronology.semantics.core.factory.PrimitiveConcept;
import org.semanticweb.owlapi.model.OWLClass;

import java.util.Locale;

public class Concept extends NamedEntity<OWLClass> implements PrimitiveConcept {


    public Concept() {
    }


    public Concept(OWLClass clazz) {
        setEntity(clazz);
    }


    public static Concept newConcept(String id) {
        return EntityFactory.getInstance().newConcept(id);
    }


    public Concept addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Concept addName(Locale locale, String localizedName) {
        super.addName(locale, localizedName);
        return this;
    }

    /*
    public Concept isA(Concept concept) {
        OWLClassAssertionAxiom classAssertion = EntityFactory.getInstance().getDataFactory()
                .getOWLClassAssertionAxiom(concept.getEntity(),
                        getEntity());
        OntologyService.getInstance().addAxiom(classAssertion);
        return this;
    }



    public Concept hasA(Relation relation, Referent referent) {
        OWLObjectPropertyAssertionAxiom assertion = EntityFactory.getInstance()
                .getDataFactory().getOWLObjectPropertyAssertionAxiom(relation.getEntity(),
                        getEntity(),
                        referent.getEntity());
        OntologyService.getInstance().addAxiom(assertion);
        return this;
    }

    public Concept hasA(Property property, Integer value) {
        OWLDataPropertyAssertionAxiom assertion = EntityFactory.getInstance()
                .getDataFactory().getOWLDataPropertyAssertionAxiom(property.getEntity(),
                        getEntity(),
                        value);
        OntologyService.getInstance().addAxiom(assertion);
        return this;
    }

    public Concept hasA(Property property, String value) {
        OWLDataPropertyAssertionAxiom assertion = EntityFactory.getInstance()
                .getDataFactory().getOWLDataPropertyAssertionAxiom(property.getEntity(),
                        getEntity(),
                        value);
        OntologyService.getInstance().addAxiom(assertion);
        return this;
    }

    public Concept hasA(Property property, Boolean value) {
        OWLDataPropertyAssertionAxiom assertion = EntityFactory.getInstance()
                .getDataFactory().getOWLDataPropertyAssertionAxiom(property.getEntity(),
                        getEntity(),
                        value);
        OntologyService.getInstance().addAxiom(assertion);
        return this;
    }
     */

    public void accept(EntityVisitor v) {
        v.visit(this);
    }
}
