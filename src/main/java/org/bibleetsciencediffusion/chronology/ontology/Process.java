package org.bibleetsciencediffusion.chronology.ontology;

import java.util.ArrayList;
import java.util.List;

public class Process extends Relation implements PropertyOntology {

    private Event begin;

    private Event end;


    /**
     * subprocesses
     */
    private List<Process> process = new ArrayList<Process>();

    public Process() {

    }

    public Process(Language language, String localizedName) {
        super(language, localizedName);
    }

    public Process addName(Language language, String localizedName) {
        this.name.put(language, localizedName);
        return this;
    }

    public Process addRole(Role role, Concept concept) {
        this.role.put(role,concept);
        return this;
    }

    public Process addProcess(Process process) {
        this.process.add(process);
        return this;
    }

    public Process addProperty(Property property) {
        this.property.add(property);
        return this;
    }


}
