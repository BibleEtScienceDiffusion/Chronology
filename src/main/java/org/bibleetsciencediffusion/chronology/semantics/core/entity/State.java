package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import java.util.HashMap;
import java.util.Map;

public class State {

    protected Map<Property, Object> property = new HashMap<Property, Object>();

    protected ConceptList<Relation> relation = new ConceptList<Relation>();

    public State() {

    }

    public Map<Property, Object> getProperty() {
        return property;
    }

    public State setProperty(Map<Property, Object> property) {
        this.property = property;
        return this;
    }

    public ConceptList<Relation> getRelation() {
        return relation;
    }

    public State setRelation(ConceptList<Relation> relation) {
        this.relation = relation;
        return this;
    }
}
