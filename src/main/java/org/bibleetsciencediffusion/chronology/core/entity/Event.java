package org.bibleetsciencediffusion.chronology.core.entity;

public class Event extends Relation implements EventOntology {



    /**
     * decomposition of event
     */
    private ConceptList<Process> process = new ConceptList<Process>();

    public Event() {

    }

    public Event(String language, String localizedName) {
        super(language, localizedName);
    }


    public Event(Event model) {
        super(model);
        this.process = model.process;
    }

    public Event addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }


    /**
     * helper
     * @return
     */
    public Date getDate() {
        return  (Date)
                this.property.get(Property.DATE);
    }

    /**
     * helper
     * @param date
     */
    public Event setDate(Date date) {
        this.property.put(Property.DATE,date);
        return this;
    }

    public Event addProcess(Process process) {
        this.process.add(process);
        return this;
    }

    public Event addProperty(Property property, Object value) {
        super.addProperty(property, value);
        return this;
    }

    public Event addRelation(Relation relation) {
        super.addRelation(relation);
        return this;
    }

    public Event addRole(Role role, Concept concept) {
        super.addRole(role, concept);
        return this;
    }

    public Event addClass(Concept concept) {
        super.addClass(concept);
        return this;
    }

    public void accept(OntologyVisitor v) {
        v.visit(this);
    }

}
