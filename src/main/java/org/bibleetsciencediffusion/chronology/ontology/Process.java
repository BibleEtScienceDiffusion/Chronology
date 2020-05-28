package org.bibleetsciencediffusion.chronology.ontology;

public class Process extends Relation implements ProcessOntology {


    private Event begin;

    private Event end;

    /**
     * subprocesses
     */
    private ConceptList<Process> process = new ConceptList<Process>();

    public Process() {

    }

    public Process(Process model) {
        super(model);
        this.process = model.process;
        this.begin = model.begin;
        this.end = model.end;
    }


    public Process(Entity language, String localizedName) {
        super(language, localizedName);
    }

    public Process addName(Entity language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }


    public Process addRole(Role role, Concept concept) {
        super.addRole(role, concept);
        return this;
    }

    public Process addProcess(Process process) {
        this.process.getList().add(process);
        return this;
    }

    public Process addProperty(Property property, Object value) {
        super.addProperty(property, value);
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
        super.addClass(concept);
        return this;
    }

    public void accept(OntologyVisitor v) {
        v.visit(this);
    }

}
