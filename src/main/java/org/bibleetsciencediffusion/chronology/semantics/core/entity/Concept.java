package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.bibleetsciencediffusion.chronology.semantics.core.service.OntologyService;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

import java.util.Locale;

public class Concept extends NamedEntity<OWLClass> {


    public Concept() {
    }


    public Concept(OWLClass clazz) {
        setOWLObject(clazz);
    }

    public String getId() {
        return getOWLObject().toStringID();
    }

    public static Concept createConcept(String id) {
        return EntityFactory.getInstance().createConcept(id);
    }


    public Concept name(String localizedName, String language) {
        super.name(localizedName, language);

        return this;
    }

    public Concept name(String localizedName, Locale locale) {
        super.name(localizedName, locale);
        return this;
    }


    public Concept subClassOf(Concept concept) {
        OWLSubClassOfAxiom classAssertion = EntityFactory.getInstance().getDataFactory()
                .getOWLSubClassOfAxiom(getOWLObject(), concept.getOWLObject());
        OntologyService.getInstance().addAxiom(classAssertion);
        return this;
    }

    public Concept equivalentOf(Concept concept) {
        OWLEquivalentClassesAxiom classAssertion = EntityFactory.getInstance().getDataFactory()
                .getOWLEquivalentClassesAxiom(getOWLObject(), concept.getOWLObject());
        OntologyService.getInstance().addAxiom(classAssertion);
        return this;
    }


    public void accept(EntityVisitor v) {
        v.visit(this);
    }
}
