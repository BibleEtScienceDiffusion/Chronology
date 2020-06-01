package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.semanticweb.owlapi.model.OWLObjectProperty;

import java.util.Locale;

public class Relation extends NamedEntity<OWLObjectProperty> {


    public Relation() {

    }


    public Relation(OWLObjectProperty objectProperty) {
        setEntity(objectProperty);
    }


    public static Relation newRelation(String id) {
        return EntityFactory.getInstance().newRelation(id);
    }


    public Relation addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Relation addName(Locale locale, String localizedName) {
        super.addName(locale.getLanguage(), localizedName);
        return this;
    }


    /*
    public Relation addRole(Role role, Concept concept) {
        Object mappedConcept = this.role.get(role);
        if (mappedConcept instanceof EntityList) {
            ((EntityList) mappedConcept).add(concept);
        } else {
            this.role.put(role, concept);
        }
        return this;
    }
    */

    public void accept(EntityVisitor v) {
        v.visit(this);
    }

}
