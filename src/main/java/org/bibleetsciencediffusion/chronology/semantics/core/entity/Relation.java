package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.bibleetsciencediffusion.chronology.semantics.core.service.OntologyService;
import org.semanticweb.owlapi.model.*;

import java.util.Locale;

public class Relation extends NamedEntity<OWLObjectProperty> {


    public Relation() {

    }


    public Relation(OWLObjectProperty objectProperty) {
        setOWLObject(objectProperty);
    }


    public static Relation createRelation(String id) {
        return EntityFactory.getInstance().createRelation(id);
    }

    public String getId() {
        return getOWLObject().toStringID();
    }

    public Relation addName(String localizedName, String language) {
        super.addName(localizedName, language);
        return this;
    }

    public Relation addName(String localizedName, Locale locale) {
        super.addName(localizedName, locale);
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

    public Relation equivalent(Relation relation) {
        OWLEquivalentObjectPropertiesAxiom axiom = EntityFactory.getInstance().getDataFactory()
                .getOWLEquivalentObjectPropertiesAxiom(getOWLObject(), relation.getOWLObject());
        OntologyService.getInstance().addAxiom(axiom);
        return this;
    }

    public Relation subRelationOf(Relation relation) {
        OWLSubObjectPropertyOfAxiom axiom = EntityFactory.getInstance().getDataFactory()
                .getOWLSubObjectPropertyOfAxiom(getOWLObject(), relation.getOWLObject());
        OntologyService.getInstance().addAxiom(axiom);
        return this;
    }

    public void accept(EntityVisitor v) {
        v.visit(this);
    }

}
