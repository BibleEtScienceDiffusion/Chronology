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
        setEntity(objectProperty);
    }

    public Process addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Process addName(Locale locale, String localizedName) {
        super.addName(locale.getLanguage(), localizedName);
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
