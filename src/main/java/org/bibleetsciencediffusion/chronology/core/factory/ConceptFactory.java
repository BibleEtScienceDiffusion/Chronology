package org.bibleetsciencediffusion.chronology.core.factory;

import org.bibleetsciencediffusion.chronology.core.entity.Concept;

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
    public Concept newInstance(Concept model) {
        Concept result = new Concept(model);// model.clone();
        // new ID
        //result.setId(IdFactory.getInstance().generate());
        // store in repository
        //ConceptRepository.getInstance().add(result);
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
        // set ID
        //result.setId(IdFactory.getInstance().generate());
        // store in repository
        //ConceptRepository.getInstance().add(result);
        return result;
    }


}
