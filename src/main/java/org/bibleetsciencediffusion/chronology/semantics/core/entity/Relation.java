package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.bibleetsciencediffusion.chronology.semantics.core.service.OntologyService;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;

import java.util.Locale;

public class Relation extends NamedEntity<OWLObjectProperty> {


    public Relation() {

    }


    public Relation(OWLObjectProperty objectProperty) {
        setOWLObject(objectProperty);
    }


    public static Relation newRelation(String id) {
        return EntityFactory.getInstance().newRelation(id);
    }

    public String getId() {
        return getOWLObject().toStringID();
    }

    public Relation addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Relation addName(Locale locale, String localizedName) {
        super.addName(locale.getLanguage(), localizedName);
        return this;
    }


    public Relation domain(Concept concept) {
        OWLObjectPropertyDomainAxiom axiom = EntityFactory.getInstance()
                .getDataFactory().getOWLObjectPropertyDomainAxiom(getOWLObject(), concept.getOWLObject());
        OntologyService.getInstance().addAxiom(axiom);
        return this;
    }

    public Relation range(Concept concept) {
        OWLObjectPropertyRangeAxiom axiom = EntityFactory.getInstance()
                .getDataFactory().getOWLObjectPropertyRangeAxiom(getOWLObject(), concept.getOWLObject());
        OntologyService.getInstance().addAxiom(axiom);
        return this;
    }


    public void accept(EntityVisitor v) {
        v.visit(this);
    }

}
