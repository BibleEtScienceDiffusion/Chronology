package org.bibleetsciencediffusion.chronology.semantics.core.entity;


//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import org.bibleetsciencediffusion.chronology.semantics.core.aggregate.ConceptList;
import org.bibleetsciencediffusion.chronology.semantics.core.factory.ReferentFactory;

import java.util.Locale;

/**
 * TODO: prepare extension and intension
 */


//@JsonIgnoreProperties

/**
 * instanciation of concept with a concrete state
 */
public class Referent extends Concept {

    // type (is a kind of)
    Concept prototype;


    // space it is located in (mental space, according Fauconnier)
    Referent space;

    private ConceptList<Process> process = new ConceptList<Process>();

    public Referent(Concept prototype) {
        this.prototype = prototype;

    }

    public Referent(Concept prototype, Referent space) {
        this.prototype = prototype;
        this.space = space;
    }


    public Referent(Referent model) {
        this.process.addAll(model.process);
    }

    public static Referent newReferent(Concept prototype) {
        return ReferentFactory.getInstance().newReferent(prototype);
    }

    public static Referent newReferent(Concept prototype, Referent space) {
        return ReferentFactory.getInstance().newReferent(prototype, space);
    }


    public Referent addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Referent addName(Locale locale, String localizedName) {
        super.addName(locale.getLanguage(), localizedName);
        return this;
    }

    public Referent addProcess(Process process) {
        this.process.add(process);
        //process.setSubject(this.clone());
        return this;
    }

    public Referent addProperty(Property property, Object value) {
        super.addProperty(property, value);
        //property.setSubject(this.clone());
        return this;
    }

    public Referent addRelation(Relation relation) {
        super.addRelation(relation);

        return this;
    }

    public Referent addClass(Concept concept) {
        super.addClass(concept);
        return this;
    }


    public void accept(ConceptVisitor v) {
        v.visit(this);
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



    public Referent clone() {
        return clone();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        return sb.toString();
    }
}