package org.bibleetsciencediffusion.chronology.ontology;

public class Language extends Concept implements LanguageOntology {

    public Language() {
        super();
    }

    public Language(Language language, String localizedName) {
        super(language, localizedName);
    }

    public Language addName(Language language, String localizedName) {
        this.name.put(language, localizedName);
        return this;
    }

}
