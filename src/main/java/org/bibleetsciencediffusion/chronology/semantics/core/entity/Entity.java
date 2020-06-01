package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.semanticweb.owlapi.model.OWLObject;

public abstract class Entity<T extends OWLObject> {

    protected T OWLObject;

    public abstract String getId();

    public T getOWLObject() {
        return OWLObject;
    }

    public void setOWLObject(T OWLObject) {
        this.OWLObject = OWLObject;
    }

}
