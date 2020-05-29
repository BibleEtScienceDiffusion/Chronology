package org.bibleetsciencediffusion.chronology.core.entity;

public class Property extends Concept implements PropertyOntology {

    /**
     * the concept on which the property applies (subject)
     */


    private Class type;


    public Property() {

    }

    public Property(Property model) {
        super(model);
        setType(model.getType());
    }

    public Property(String language, String localizedName) {
        super(language, localizedName);
    }

    public Property addName(String language, String localizedName) {
        super.addName(language, localizedName);
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

    public Concept getSubject() {
        return (Concept) getRelation().getFirstByModel(Relation.DEPENDENCY).getRole(Role.TARGET);
    }

    public Property setSubject(Concept subject) {
        addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, subject));
        return this;
    }

    public Property setType(Class type) {
        this.type = type;
        return this;
    }

    public Class getType() {
        return type;
    }

    public Property addClass(Concept concept) {
        super.addClass(concept);
        return this;
    }

    public void accept(OntologyVisitor v) {
        v.visit(this);
    }

}
