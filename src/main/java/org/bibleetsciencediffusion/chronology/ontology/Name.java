package org.bibleetsciencediffusion.chronology.ontology;

import java.util.HashMap;
import java.util.Map;

public class Name {

    private Map<String,Object> map = new HashMap<String,Object>();

    public Name add(String languageIsoCode, String localizedName) {
        map.put(languageIsoCode, localizedName);
        return this;
    }

    public Object get(String languageIsoCode) {
        return map.get(languageIsoCode);
    }

}
