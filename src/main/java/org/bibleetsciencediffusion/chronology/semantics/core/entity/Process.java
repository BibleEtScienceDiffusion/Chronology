package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.semanticweb.owlapi.model.OWLObjectProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Process extends Relation {

    /**
     * subprocesses
     */
    private List<Process> process = new ArrayList<Process>();


    public Process() {
        super();
    }

    public Process(OWLObjectProperty objectProperty) {
        setOWLObject(objectProperty);
    }

    public Process name(String language, String localizedName) {
        super.name(language, localizedName);
        return this;
    }

    public Process name(Locale locale, String localizedName) {
        super.name(locale.getLanguage(), localizedName);
        return this;
    }


    public Process addProcess(Process process) {
        this.process.add(process);
        return this;
    }


    public void accept(EntityVisitor v) {
        v.visit(this);
    }

}
