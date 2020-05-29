package org.bibleetsciencediffusion.chronology.core.entity;

import org.bibleetsciencediffusion.chronology.core.factory.ConceptFactory;
import org.bibleetsciencediffusion.chronology.core.value.Name;

import java.util.HashMap;
import java.util.Map;

public class Concept implements PrimitiveConcept {

    protected Name name = new Name();

    protected Map<Property, Object> property = new HashMap<Property, Object>();

    protected ConceptList<Relation> relation = new ConceptList<Relation>();

    public Concept() {
    }

    public Concept(Concept model) {
        //addClass(model.getFirstClass()).setName(model.getName());
        this.property = model.property;
        this.relation = model.relation;
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


    public Concept addName(String language, String localizedName) {
        Name name = getName();
        name.setConcept(this);
        name.add(language, localizedName);
        return this;
    }

    public Concept setName(Name name) {
        name.setConcept(this);
        this.name = name;
        return this;
    }

    public  Name getName() {
        return name;
    }

    /**
     * helper
     * @param concept
     * @return this
     */
    public Concept addClass(Concept concept) {
        Relation parentRelation = new Relation(Relation.HAS_CLASS);
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
        this.property.put(property, value);
        property.setSubject(this);
        return this;
    }

    public Map<Property, Object> getProperty() {
        return property;
    }


    public Concept addRelation(Relation relation) {
        this.relation.add(relation);
        relation.setSubject(this);
        return this;
    }

    public ConceptList<Relation> getRelation() {
        return relation;
    }

    public void setRelation(ConceptList<Relation> relation) {
        this.relation = relation;
    }

    public Relation getFirstRelationByModel(Relation model) {
        return getRelation().getFirstByModel(model);
    }


    public boolean isNegation() {
        Relation negationRelation = getFirstRelationByModel(Relation.NOT);
        return (negationRelation != null);
    }

    public boolean isAffirmation() {
        Relation negationRelation = getFirstRelationByModel(Relation.NOT);
        return (negationRelation == null);
    }


    public Concept expand() {
        //TODO
        return null;
    }

    public void accept(ConceptVisitor v) {
        v.visit(this);
    }
}
