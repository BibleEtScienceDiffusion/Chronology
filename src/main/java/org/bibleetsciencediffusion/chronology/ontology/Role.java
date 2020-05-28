package org.bibleetsciencediffusion.chronology.ontology;

public class Role extends Concept implements RoleOntology {

    public Role() {

    }

    public Role(Entity language, String localizedName) {
        super(language, localizedName);
    }

    public Role addName(Entity language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Role addClass(Concept concept) {
        super.addClass(concept);
        return this;
    }

    public void accept(OntologyVisitor v) {
        v.visit(this);
    }
}
