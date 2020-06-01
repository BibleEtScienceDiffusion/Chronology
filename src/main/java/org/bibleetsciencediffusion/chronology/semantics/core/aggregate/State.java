package org.bibleetsciencediffusion.chronology.semantics.core.aggregate;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Property;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.Relation;

import java.util.HashMap;
import java.util.Map;

public class State {

    protected Map<Property, Object> property = new HashMap<Property, Object>();

    protected EntityList<Relation> relation = new EntityList<Relation>();

    public State() {

    }

    public Map<Property, Object> getProperty() {
        return property;
    }

    public State setProperty(Map<Property, Object> property) {
        this.property = property;
        return this;
    }

    public EntityList<Relation> getRelation() {
        return relation;
    }

    public State setRelation(EntityList<Relation> relation) {
        this.relation = relation;
        return this;
    }
}
