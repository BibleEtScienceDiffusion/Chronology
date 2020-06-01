package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;

import java.util.Locale;

public class Property extends NamedEntity<OWLDataProperty> {


    public Property() {

    }

    public Property(OWLDataProperty dataProperty) {
        setEntity(dataProperty);
    }


    public static Property newProperty(OWLDataProperty dataProperty) {
        return EntityFactory.getInstance().newProperty(dataProperty);
    }


    public Property addName(Locale locale, String localizedName) {
        super.addName(locale, localizedName);
        return this;
    }

    public Property addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }


    public void accept(EntityVisitor v) {
        v.visit(this);
    }

}
