package org.bibleetsciencediffusion.chronology.semantics.core.entity;

public class Entity extends Concept /*implements DomainDefinition*/ {

    private ConceptList<Process> process = new ConceptList<Process>();

    public Entity() {

    }

    public Entity(Entity model) {
        super(model);
        this.process.addAll(model.process);
    }


    public Entity(String language, String localizedName) {
        super(language, localizedName);
    }

    public Entity addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }


    public Entity addProcess(Process process) {
        this.process.add(process);
        process.setSubject(new Entity(this));
        return this;
    }

    public Entity addProperty(Property property, Object value) {
        super.addProperty(property, value);
        property.setSubject(new Entity(this));
        return this;
    }

    public Entity addRelation(Relation relation) {
        super.addRelation(relation);
        relation.setSubject(new Entity(this));
        return this;
    }

    public Entity addClass(Concept concept) {
        super.addClass(concept);
        return this;
    }

    public void accept(ConceptVisitor v) {
        v.visit(this);
    }
}
