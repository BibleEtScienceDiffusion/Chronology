package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.semanticweb.owlapi.model.OWLObject;

public class Entity<T extends OWLObject> {

    //TODO : make abstract id and use OWL name in concrete class

    protected T OWLObject;

    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public T getOWLObject() {
        return OWLObject;
    }

    public void setOWLObject(T OWLObject) {
        this.OWLObject = OWLObject;
    }

}
