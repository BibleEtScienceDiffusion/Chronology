package org.bibleetsciencediffusion.chronology.ontology;

public class Property extends Concept implements PropertyOntology {

    /**
     * the concept on which the property applies
     */
    private Concept target;

    private Object value;

    public Property() {

    }

    public Property(Property property) {
        Property clone = null;
        try {
            clone = (Property) property.clone();
        }
        catch (CloneNotSupportedException e) {
            clone = property;
        }
            this.setTarget(clone.target);
            this.setValue(clone.value);

    }

    public Property(Language language, String localizedName) {
        super(language, localizedName);
    }

    public Property addName(Language language, String localizedName) {
        this.name.put(language, localizedName);
        return this;
    }



    public Property setTarget(Concept target) {
        this.target = target;
        return this;
    }

    public Concept getTarget() {
        return target;
    }

    public Property setValue(Object value) {
        this.value = value;
        return this;
    }


    public Object getValue() {
        return value;
    }


}
