package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.ConceptFactory;
import org.bibleetsciencediffusion.chronology.semantics.core.value.Name;

import java.util.Locale;
import java.util.Map;

public class Concept implements PrimitiveConcept {


    protected String id;

    protected Name name = new Name();


    protected State state = new State();

    public Concept() {
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Concept(Concept model) {
        state.getProperty().putAll(model.getState().getProperty());
        state.getRelation().addAll(model.getState().getRelation());
    }

    public Concept(String language, String localizedName) {
        addName(language, localizedName);
    }


    public static Concept newConcept(Concept model) {
        return ConceptFactory.getInstance().newConcept(model);
    }

    public static Concept newConcept(String lang, String name) {
        return ConceptFactory.getInstance().newConcept(lang, name);
    }

    public static Concept newConcept(Locale locale, String name) {
        return ConceptFactory.getInstance().newConcept(locale, name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Concept addName(String language, String localizedName) {
        Name name = getName();
        name.add(language, localizedName);
        return this;
    }

    public Concept addName(Locale locale, String localizedName) {
        Name name = getName();
        name.add(locale, localizedName);
        return this;
    }

    public Concept setName(Name name) {
        this.name = name;
        return this;
    }

    public Name getName() {
        return name;
    }

    /**
     * helper
     * @param concept
     * @return this
     */
    public Concept addClass(Concept concept) {
        Relation parentRelation = Relation.HAS_CLASS.clone();
        parentRelation.addRole(Role.TARGET,concept);
        addRelation(parentRelation);
        return this;
    }

    /**
     * helper
     * @return
     */
    public Concept getFirstClass() {
        Relation parentRelation = getFirstRelationByModel(Relation.HAS_CLASS);
        if (parentRelation == null) {
           return null;
        }
        else  {
            return (Concept) parentRelation.getRole(Role.TARGET);
        }

    }

    public Concept addProperty(Property property, Object value) {
        state.getProperty().put(property, value);
        property.setSubject(this);
        return this;
    }

    public Map<Property, Object> getProperty() {
        return state.getProperty();
    }


    public Concept addRelation(Relation relation) {
        state.getRelation().add(relation);
        relation.setSubject(this);
        return this;
    }

    public ConceptList<Relation> getRelation() {
        return state.getRelation();
    }

    public Concept setRelation(ConceptList<Relation> relation) {
        state.setRelation(relation);
        return this;
    }

    public Relation getFirstRelationByModel(Relation model) {
        return getRelation().findFirstByModel(model);
    }


    public boolean isNegation() {
        Relation negationRelation = getFirstRelationByModel(Relation.NOT);
        return (negationRelation != null);
    }

    public boolean isAffirmation() {
        Relation negationRelation = getFirstRelationByModel(Relation.NOT);
        return (negationRelation == null);
    }


    public Concept clone() {
        return clone();
    }

    public Concept self() {
        return this;
    }

    public void accept(ConceptVisitor v) {
        v.visit(this);
    }
}
