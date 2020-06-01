package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.bibleetsciencediffusion.chronology.semantics.core.service.OntologyService;
import org.semanticweb.owlapi.model.OWLClass;
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


    public Concept subClassOf(Concept concept) {
        OWLSubClassOfAxiom classAssertion = EntityFactory.getInstance().getDataFactory()
                .getOWLSubClassOfAxiom(getOWLObject(), concept.getOWLObject());
        OntologyService.getInstance().addAxiom(classAssertion);
        return this;
    }

    public void accept(EntityVisitor v) {
        v.visit(this);
    }
}
