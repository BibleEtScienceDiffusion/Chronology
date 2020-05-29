package org.bibleetsciencediffusion.chronology.ontology;

import java.util.HashMap;
import java.util.Map;

public class Name {

    public static String ENGLISH = "EN";
    public static String FRENCH = "FR";

    // possibility inherit from ISO_FR_LANGUAGE or ISO_EN_LANGUAGE
    private Map<String, Object> map = new HashMap<String, Object>();
    private Concept concept;

    public Concept getConcept() {
        return concept;
    }

    public void setConcept(Concept concept) {
        this.concept = concept;
    }

    public Name add(String languageIsoCode, String localizedName) {
        map.put(languageIsoCode, localizedName);
        return this;
    }

    public Object get(String languageIsoCode) {
        return map.get(languageIsoCode);
    }

}
