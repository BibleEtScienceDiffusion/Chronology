package org.bibleetsciencediffusion.chronology.ontology;

public class Property extends Concept implements PropertyOntology {

    /**
     * the concept on which the property applies (subject)
     */
    private Concept target;

    private Class type;

    public Property() {

    }

    public Property(Property model) {
        super(model);
        setTarget(model.getTarget());
        setType(model.getType());
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

    public Property setType(Class type) {
        this.type = type;
        return this;
    }


    public Class getType() {
        return type;
    }


}
