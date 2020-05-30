package org.bibleetsciencediffusion.chronology.semantics.core.factory;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Process;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.*;
import org.bibleetsciencediffusion.chronology.semantics.core.repository.ConceptRepository;

import java.util.Locale;

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
     * named context in a given language
     *
     * @param name
     * @param locale
     * @return
     */
    public Concept newConcept(Locale locale, String name) {
        Concept result = new Concept(locale.getLanguage(), name);
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
     * named context in a given language
     *
     * @param name
     * @param locale
     * @return
     */
    public Property newProperty(Locale locale, String name) {
        Property result = new Property(locale.getLanguage(), name);
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
        Relation result = new Relation(model);
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

    public Relation newRelation(Locale locale, String name) {
        Relation result = new Relation(locale.getLanguage(), name);
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

    public Process newProcess(Locale locale, String name) {
        Process result = new Process(locale.getLanguage(), name);
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

    public Role newRole(Locale locale, String name) {
        Role result = new Role(locale.getLanguage(), name);
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

    public Event newEvent(Locale locale, String name) {
        Event result = new Event(locale.getLanguage(), name);
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
