package org.bibleetsciencediffusion.chronology.ontology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concept implements ConceptOntology {

    protected Map<Language, String> name = new HashMap();

    protected Concept parent = null;

    protected List<Property> property = new ArrayList<Property>();

    public Concept() {

    }

    public Concept(Language language, String localizedName) {
        new Concept().addName(language, localizedName);
    }



    public Concept addName(Language language, String localizedName) {
        this.name.put(language, localizedName);
        return this;
    }

    public Concept setParent(Concept parent) {
        this.parent = parent;
        return this;
    }

    public Concept getParent() {
        return parent;
    }

    public Concept addProperty(Property property) {
        this.property.add(new Property(property));
        property.setTarget(this);
        return this;
    }


}
