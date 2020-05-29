package org.bibleetsciencediffusion.chronology.ontology;

import java.util.HashMap;
import java.util.Map;

public class Relation extends Concept implements RelationOntology {


    protected Map<Role,Concept> role = new HashMap<Role,Concept>();



    public Relation() {

    }

    public Relation(Relation model) {
        super(model);
        this.role = model.role;
    }

    public Relation(Entity language, String localizedName) {
        super(language, localizedName);
    }

    public Relation addName(Entity language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Relation addProperty(Property property, Object value) {
        super.addProperty(property, value);
        return this;
    }


    public Relation addRole(Role role, Concept concept) {
        Concept mappedConcept = this.role.get(role);
        if (mappedConcept instanceof ConceptList) {
            ((ConceptList) mappedConcept).add(concept);
        } else {
            this.role.put(role, concept);
        }
        return this;
    }

    public Concept getSubject() {
        return getRelation().getFirstByModel(Relation.DEPENDENCY).getRole(Role.TARGET);
    }

    /**
     * the concept on which the property applies (subject = is on dependency)
     */

    public Relation setSubject(Concept subject) {
        addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, subject));
        return this;
    }

    public Concept getRole(Role role) {
        return this.role.get(role);
    }

    public Relation addClass(Concept concept) {
        super.addClass(concept);
        return this;
    }

    public void accept(OntologyVisitor v) {
        v.visit(this);
    }

}
