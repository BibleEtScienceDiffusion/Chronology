package org.bibleetsciencediffusion.chronology.semantics.core.entity;

public class Entity<T> {

    //TODO : make abstract id and use OWL name in concrete class

    protected T entity;

    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

}
