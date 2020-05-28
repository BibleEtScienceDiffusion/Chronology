package org.bibleetsciencediffusion.chronology.ontology;

import java.util.ArrayList;
import java.util.List;

public class Process extends Relation implements ProcessOntology {


    private Event begin;

    private Event end;

    public Process(Process model) {
        super(model);
        this.process = model.process;
        this.begin = model.begin;
        this.end = model.end;
    }


    /**
     * subprocesses
     */
    private List<Process> process = new ArrayList<Process>();

    public Process() {

    }

    public Process(Entity language, String localizedName) {
        super(language, localizedName);
    }

    public Process addName(Entity language, String localizedName) {
        addName(language, localizedName);
        return this;
    }



    public Process addRole(Role role, Concept concept) {
        addRole(role,concept);
        return this;
    }

    public Process addProcess(Process process) {
        addProcess(process);
        return this;
    }

    public Process addProperty(Property property) {
        addProperty(property);
        return this;
    }

    public Event getBegin() {
        return begin;
    }

    public Process setBegin(Event begin) {
        this.begin = begin;
        return this;
    }

    public Event getEnd() {
        return end;

    }

    public Process setEnd(Event end) {
        this.end = end;
        return this;
    }

    public Process addClass(Concept concept) {
        addClass(concept);
        return this;
    }

}
