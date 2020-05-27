package org.bibleetsciencediffusion.chronology.ontology;
import java.util.HashMap;
import java.util.Map;

public class Concept implements ConceptOntology {

    protected Map<Language, String> name = new HashMap();

    protected Concept ascendant = null;

    protected Map<Property,Object> property = new HashMap<Property,Object>();

    public Concept() {

    }

    public Concept(Concept model) {
        new Concept().setAscendant(model.getAscendant()).setName(model.getName());
    }

    public Concept(Language language, String localizedName) {
        new Concept().addName(language, localizedName);
    }



    public Concept addName(Language language, String localizedName) {
        this.name.put(language, localizedName);
        return this;
    }

    public Concept setName( Map<Language, String> name) {
        this.name = name;
        return this;
    }

    public  Map<Language, String> getName() {
        return name;
    }

    public Concept setAscendant(Concept ascendant) {
        this.ascendant = ascendant;
        return this;
    }

    public Concept getAscendant() {
        return ascendant;
    }

    public Concept addProperty(Property property, Object value) {
        this.property.put(property, value);
        property.setTarget(this);
        return this;
    }



}
