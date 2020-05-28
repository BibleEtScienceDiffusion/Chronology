package org.bibleetsciencediffusion.chronology.ontology;

public class Entity extends Concept implements EntityOntology {

    private ConceptList<Process> process = new ConceptList<Process>();

    public Entity() {

    }

    public Entity(Entity model) {
        super(model);
        this.process = model.process;
    }


    public Entity(Entity language, String localizedName) {
        super(language, localizedName);
    }

    public Entity addName(Entity language, String localizedName) {
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

    public void accept(OntologyVisitor v) {
        v.visit(this);
    }
}
