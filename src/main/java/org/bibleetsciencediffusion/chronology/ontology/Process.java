package org.bibleetsciencediffusion.chronology.ontology;

import java.util.ArrayList;
import java.util.List;

public class Process extends Relation implements PropertyOntology {

    private Event begin;

    private Event end;

    private Concept target;



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



    public Process setTarget(Concept target) {
        this.target = target;
        return this;
    }

    public Concept getTarget() {
        return target;
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
