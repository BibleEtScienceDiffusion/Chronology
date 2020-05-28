package org.bibleetsciencediffusion.chronology.ontology;

import java.util.HashMap;
import java.util.Map;

public class Name {

    private Map<Entity,Object> map = new HashMap<Entity,Object>();

    public Name add(Entity language, String localizedName) {
        map.put(language, localizedName);
        return this;
    }

    public Object get(Entity language) {
        return map.get(language);
    }

}
