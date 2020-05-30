package org.bibleetsciencediffusion.chronology.semantics.core.factory;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Process;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.*;
import org.bibleetsciencediffusion.chronology.semantics.core.repository.ConceptRepository;

public class ConceptFactory {
    private static ConceptFactory instance = new ConceptFactory();

    private ConceptFactory() {
    }

    public static ConceptFactory getInstance() {
        return instance;
    }

    /**
     * anonymous concept
     *
     * @param model
     * @return
     */
    public Concept newConcept(Concept model) {
        Concept result = new Concept(model);// model.clone();
        store(result);
        return result;
    }


    /**
     * named context in a given language
     *
     * @param name
     * @param lang
     * @return
     */
    public Concept newConcept(String lang, String name) {
        Concept result = new Concept(lang, name);
        store(result);
        return result;
    }

    /**
     * anonymous concept
     *
     * @param model
     * @return
     */
    public Property newProperty(Property model) {
        Property result = new Property(model);// model.clone();
        store(result);
        return result;
    }


    /**
     * named context in a given language
     *
     * @param name
     * @param lang
     * @return
     */
    public Property newProperty(String lang, String name) {
        Property result = new Property(lang, name);
        store(result);
        return result;
    }


    /**
     * anonymous concept
     *
     * @param model
     * @return
     */
    public Relation newRelation(Relation model) {
        Relation result = new Relation(model);// model.clone();
        store(result);
        return result;
    }


    /**
     * named context in a given language
     *
     * @param name
     * @param lang
     * @return
     */
    public Relation newRelation(String lang, String name) {
        Relation result = new Relation(lang, name);
        store(result);
        return result;
    }

    /**
     * anonymous concept
     *
     * @param model
     * @return
     */
    public Process newProcess(Process model) {
        Process result = new Process(model);// model.clone();
        store(result);
        return result;
    }


    /**
     * named context in a given language
     *
     * @param name
     * @param lang
     * @return
     */
    public Process newProcess(String lang, String name) {
        Process result = new Process(lang, name);
        store(result);
        return result;
    }

    /**
     * named context in a given language
     *
     * @param name
     * @param lang
     * @return
     */
    public Role newRole(String lang, String name) {
        Role result = new Role(lang, name);
        store(result);
        return result;
    }


    /**
     * anonymous concept
     *
     * @param model
     * @return
     */
    public Event newEvent(Event model) {
        Event result = new Event(model);// model.clone();
        store(result);
        return result;
    }


    /**
     * named context in a given language
     *
     * @param name
     * @param lang
     * @return
     */
    public Event newEvent(String lang, String name) {
        Event result = new Event(lang, name);
        store(result);
        return result;
    }

    private void store(Concept concept) {
        // new ID
        concept.setId(IdFactory.getInstance().generate());
        // store in repository
        ConceptRepository.getInstance().add(concept);
    }

}
