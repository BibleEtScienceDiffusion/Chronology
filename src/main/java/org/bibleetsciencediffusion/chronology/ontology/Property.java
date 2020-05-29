package org.bibleetsciencediffusion.chronology.ontology;

public class Property extends Concept implements PropertyOntology {

    /**
     * the concept on which the property applies (subject)
     */
    private Concept subject;

    private Class type;


    public Property() {

    }

    public Property(Property model) {
        super(model);
        setSubject(model.getSubject());
        setType(model.getType());
    }

    public Property(Entity language, String localizedName) {
        super(language, localizedName);
    }

    public Property addName(Entity language, String localizedName) {
        addName(language, localizedName);
        return this;
    }

    public Property addProperty(Property property, Object value) {
        super.addProperty(property, value);
        return this;
    }

    public Property addRelation(Relation relation) {
        super.addRelation(relation);
        return this;
    }

    public Property setSubject(Concept subject) {
        this.subject = subject;
        return this;
    }

    public Concept getSubject() {
        return subject;
    }

    public Property setType(Class type) {
        this.type = type;
        return this;
    }

    public Class getType() {
        return type;
    }

    public Property addClass(Concept concept) {
        addClass(concept);
        return this;
    }

    public void accept(OntologyVisitor v) {
        v.visit(this);
    }

}
