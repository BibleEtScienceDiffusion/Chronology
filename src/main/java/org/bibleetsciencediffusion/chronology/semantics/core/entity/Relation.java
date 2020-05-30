package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.ConceptFactory;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Relation extends Concept {

    /**
     * map role to ConceptList or Concept
     */
    protected Map<Role, Object> role = new HashMap<Role, Object>();


    public Relation() {

    }

    public Relation(Relation model) {
        super(model);
        this.role.putAll(model.role);
    }

    public Relation(String language, String localizedName) {
        super(language, localizedName);
    }

    public static Relation newRelation(Relation model) {
        return ConceptFactory.getInstance().newRelation(model);
    }

    public static Relation newRelation(String lang, String name) {
        return ConceptFactory.getInstance().newRelation(lang, name);
    }

    public static Relation newRelation(Locale locale, String name) {
        return ConceptFactory.getInstance().newRelation(locale, name);
    }

    public Relation addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Relation addName(Locale locale, String localizedName) {
        super.addName(locale.getLanguage(), localizedName);
        return this;
    }

    public Relation addProperty(Property property, Object value) {
        super.addProperty(property, value);
        return this;
    }


    public Relation addRole(Role role, Concept concept) {
        Object mappedConcept = this.role.get(role);
        if (mappedConcept instanceof ConceptList) {
            ((ConceptList) mappedConcept).add(concept);
        } else {
            this.role.put(role, concept);
        }
        return this;
    }

    public Concept getSubject() {
        return (Concept) getRelation().getFirstByModel(DEPENDENCY).getRole(TARGET);
    }

    /**
     * the concept on which the property applies (subject = is on dependency)
     */

    public Relation setSubject(Concept subject) {
        addRelation(new Relation(DEPENDENCY).addRole(TARGET, subject));
        return this;
    }

    public Object getRole(Role role) {
        return this.role.get(role);
    }

    public Relation addClass(Concept concept) {
        super.addClass(concept);
        return this;
    }

    public void accept(ConceptVisitor v) {
        v.visit(this);
    }

}
