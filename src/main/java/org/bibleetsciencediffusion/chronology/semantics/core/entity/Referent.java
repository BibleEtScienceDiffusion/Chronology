package org.bibleetsciencediffusion.chronology.semantics.core.entity;


//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * TODO: prepare extension and intension
 */


//@JsonIgnoreProperties
public class Referent extends Object {

    String id;

    // type (is a kind of)
    Concept prototype;


    // space it is located in (mental space, according Fauconnier)
    Referent space;

    // value (type is getPrototype().getRange()
    Object value;

    public Referent(Concept prototype) {
        this.prototype = prototype;

    }

    public Referent(Concept prototype, Referent space) {
        this.prototype = prototype;
        this.space = space;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Concept getPrototype() {
        return prototype;
    }

    public void setPrototype(Concept prototype) {
        this.prototype = prototype;
    }

    public Referent getSpace() {
        return space;
    }

    public void setSpace(Referent space) {
        this.space = space;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Referent clone() {
        return clone();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        return sb.toString();
    }
}