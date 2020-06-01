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


    public static Concept newConcept(OWLClass clazz) {
        return EntityFactory.getInstance().newConcept(clazz);
    }


    public Concept addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Concept addName(Locale locale, String localizedName) {
        super.addName(locale, localizedName);
        return this;
    }


    public void accept(EntityVisitor v) {
        v.visit(this);
    }
}
