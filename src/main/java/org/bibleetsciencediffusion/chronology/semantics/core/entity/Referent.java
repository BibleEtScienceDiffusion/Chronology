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


    public Referent clone() {
        return clone();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        return sb.toString();
    }
}