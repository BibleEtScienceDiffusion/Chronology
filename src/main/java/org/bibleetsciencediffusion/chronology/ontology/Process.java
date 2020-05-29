package org.bibleetsciencediffusion.chronology.ontology;

public class Process extends Relation implements ProcessOntology {

    /**
     * subprocesses
     */
    private ConceptList<Process> process = new ConceptList<Process>();

    public Process() {

    }

    public Process(Process model) {
        super(model);
        this.process = model.process;
    }


    public Process(String language, String localizedName) {
        super(language, localizedName);
    }

    public Process addName(String language, String localizedName) {
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

    public Process addRelation(Relation relation) {
        super.addRelation(relation);
        return this;
    }

    public Event getBegin() {
        return (Event) getRole(Role.BEGIN);
    }

    public Process setBegin(Event begin) {
        addRole(Role.BEGIN, begin);
        return this;
    }

    public Event getEnd() {
        return (Event) getRole(Role.END);
    }

    public Process setEnd(Event end) {
        addRole(Role.BEGIN, end);
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
