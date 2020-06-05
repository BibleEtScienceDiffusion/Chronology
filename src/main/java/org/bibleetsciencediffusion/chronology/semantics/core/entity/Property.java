package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.bibleetsciencediffusion.chronology.semantics.core.service.OntologyService;
import org.semanticweb.owlapi.model.*;

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

    public static Property createProperty(String id) {
        return EntityFactory.getInstance().createProperty(id);
    }


    public Property name(String localizedName, String language) {
        super.name(localizedName, language);
        return this;
    }

    public Property name(String localizedName, Locale locale) {
        super.name(localizedName, locale);
        return this;
    }


    public Property domain(Concept concept) {
        OWLDataPropertyDomainAxiom axiom = EntityFactory.getInstance()
                .getDataFactory().getOWLDataPropertyDomainAxiom(getOWLObject(), concept.getOWLObject());
        OntologyService.getInstance().addAxiom(axiom);
        return this;
    }

    // TODO : use a class to embed OWLDatatype (factory datatype)
    public Property range(OWLDatatype dataType) {
        OWLDataPropertyRangeAxiom axiom = EntityFactory.getInstance()
                .getDataFactory().getOWLDataPropertyRangeAxiom(getOWLObject(), dataType);
        OntologyService.getInstance().addAxiom(axiom);
        return this;
    }

    public Property equivalentOf(Property property) {
        OWLEquivalentDataPropertiesAxiom axiom = EntityFactory.getInstance().getDataFactory()
                .getOWLEquivalentDataPropertiesAxiom(getOWLObject(), property.getOWLObject());
        OntologyService.getInstance().addAxiom(axiom);
        return this;
    }

    public void accept(EntityVisitor v) {
        v.visit(this);
    }

}
