package org.bibleetsciencediffusion.chronology.semantics.core.entity;


//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.semanticweb.owlapi.model.OWLIndividual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * TODO: prepare extension and intension
 */


//@JsonIgnoreProperties

/**
 * instanciation of concept with a concrete state
 */
public class Referent extends NamedEntity<OWLIndividual> {


    // space it is located in (mental space, according Fauconnier)
    Referent space;

    private List<Process> process = new ArrayList<Process>();

    public Referent(OWLIndividual individual) {
        this.setEntity(individual);
    }


    public Referent(Referent model) {
        this.process.addAll(model.process);
    }

    public static Referent newReferent(OWLIndividual individual) {
        return EntityFactory.getInstance().newReferent(individual);
    }


    public Referent addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Referent addName(Locale locale, String localizedName) {
        super.addName(locale, localizedName);
        return this;
    }

    public Referent addProcess(Process process) {
        this.process.add(process);
        //process.setSubject(this.clone());
        return this;
    }


    public void accept(EntityVisitor v) {
        v.visit(this);
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