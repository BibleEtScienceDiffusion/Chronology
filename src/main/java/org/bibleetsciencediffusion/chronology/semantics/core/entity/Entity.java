package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.semanticweb.owlapi.model.OWLEntity;

public abstract class Entity<T extends OWLEntity> {

    protected T OWLObject;

    public String getId() {
        return getOWLObject().toStringID();
    }

    public T getOWLObject() {
        return OWLObject;
    }

    public void setOWLObject(T OWLObject) {
        this.OWLObject = OWLObject;
    }

    abstract void accept(EntityVisitor v);

}
