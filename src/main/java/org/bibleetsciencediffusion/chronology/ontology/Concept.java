package org.bibleetsciencediffusion.chronology.ontology;
import java.util.HashMap;
import java.util.Map;

public class Concept implements ConceptOntology {

    protected Concept ascendant = null;

    protected Map<Property,Object> property = new HashMap<Property,Object>();

    public Concept() {

    }

    public Concept(Concept model) {
        setAscendant(model.getAscendant()).setName(model.getName());
        this.property = model.property;
    }

    public Concept(Concept language, String localizedName) {
        addName(language, localizedName);
    }



    public Concept addName(Concept language, String localizedName) {
        Map<Concept,Object> name = getName();
        if (name == null) {
            name = new HashMap<Concept,Object>();
        }
        name.put(language, localizedName);
        setName (name);
        return this;
    }

    public Concept setName( Map<Concept, Object> name) {
        this.property.put(Property.NAME, name);
        return this;
    }

    public  Map<Concept, Object> getName() {
        return (Map<Concept,Object>) this.property.get(Property.NAME);
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
