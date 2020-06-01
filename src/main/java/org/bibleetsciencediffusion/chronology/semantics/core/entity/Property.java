package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.bibleetsciencediffusion.chronology.semantics.core.service.OntologyService;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import java.util.Locale;

public class Property extends NamedEntity<OWLDataProperty> {


    public Property() {

    }

    public Property(OWLDataProperty dataProperty) {
        setOWLObject(dataProperty);
    }

    public String getId() {
        return getOWLObject().toStringID();
    }

    public static Property newProperty(String id) {
        return EntityFactory.getInstance().newProperty(id);
    }


    public Property addName(Locale locale, String localizedName) {
        super.addName(locale, localizedName);
        return this;
    }

    public Property addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }


    public Property domain(Concept concept) {
        OWLDataPropertyDomainAxiom axiom = EntityFactory.getInstance()
                .getDataFactory().getOWLDataPropertyDomainAxiom(getOWLObject(), concept.getOWLObject());
        OntologyService.getInstance().addAxiom(axiom);
        return this;
    }

    // TODO : use a class to embed OWL2Datatype (factory datatype)
    public Property range(OWL2Datatype dataType) {
        OWLDataPropertyRangeAxiom axiom = EntityFactory.getInstance()
                .getDataFactory().getOWLDataPropertyRangeAxiom(getOWLObject(), dataType);
        OntologyService.getInstance().addAxiom(axiom);
        return this;
    }

    public void accept(EntityVisitor v) {
        v.visit(this);
    }

}
