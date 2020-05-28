package org.bibleetsciencediffusion.chronology.ontology;

import java.util.ArrayList;
import java.util.List;

public class Event extends Relation implements EventOntology {



    /**
     * decomposition of event
     */
    private List<Process> process = new ArrayList<Process>();

    public Event() {

    }

    public Event(Entity language, String localizedName) {
        super(language, localizedName);
    }


    public Event(Event model) {
        super(model);
        this.process = model.process;
    }

    public Event addName(Entity language, String localizedName) {
        addName(language, localizedName);
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
        addProcess(process);
        return this;
    }

    public Event addProperty(Property property, Object value) {
        addProperty(property, value);
        return this;
    }

    public Event addRole(Role role, Concept concept) {
        addRole(role,concept);
        return this;
    }

    public Event addClass(Concept concept) {
        addClass(concept);
        return this;
    }

    public void accept(OntologyVisitor v) {
        v.visit(this);
    }

}
