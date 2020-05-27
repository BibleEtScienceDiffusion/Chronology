package org.bibleetsciencediffusion.chronology.ontology;

import java.util.ArrayList;
import java.util.List;

public class Event extends Relation implements PropertyOntology {


    /**
     * date when the event occurs
     */



    /**
     * decomposition of event
     */
    private List<Process> process = new ArrayList<Process>();

    public Event() {

    }

    public Event(Language language, String localizedName) {
        super(language, localizedName);
    }


    public Event(Event model) {
        super(model);
        this.process = model.process;
    }

    public Event addName(Language language, String localizedName) {
        this.name.put(language, localizedName);
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
    public void setDate(Date date) {
        this.property.put(Property.DATE,date);
    }

    public Event addProcess(Process process) {
        this.process.add(process);
        return this;
    }

    public Event addProperty(Property property, Object value) {
        this.property.put(property, value);
        return this;
    }

    public Event addRole(Role role, Concept concept) {
        this.role.put(role,concept);
        return this;
    }


}
