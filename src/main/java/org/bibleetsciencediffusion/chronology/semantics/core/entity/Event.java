package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.ConceptFactory;

public class Event extends Relation {


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
        this.process.addAll(model.process);
    }

    public static Event newEvent(String lang, String name) {
        return ConceptFactory.getInstance().newEvent(lang, name);
    }

    public static Event newEvent(Event model) {
        return ConceptFactory.getInstance().newEvent(model);
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
        return (Date)
                this.property.get(DATE);
    }

    /**
     * helper
     * @param date
     */
    public Event setDate(Date date) {
        this.property.put(DATE, date);
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

    public void accept(ConceptVisitor v) {
        v.visit(this);
    }

}
