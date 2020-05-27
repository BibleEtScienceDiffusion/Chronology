package org.bibleetsciencediffusion.chronology.ontology;

import java.util.HashMap;
import java.util.Map;

public class Relation extends Concept implements RelationOntology {

    /**
     * the concept on which the property applies (subject)
     */
    private Concept subject;

    protected Map<Role,Concept> role = new HashMap<Role,Concept>();



    public Relation() {

    }

    public Relation(Relation model) {
        super(model);
        this.role = model.role;
    }

    public Relation(Concept language, String localizedName) {
        super(language, localizedName);
    }

    public Relation addName(Concept language, String localizedName) {
        addName(language, localizedName);
        return this;
    }


    public Relation setSubject(Concept subject) {
        this.subject = subject;
        return this;
    }

    public Relation addRole(Role role, Concept concept) {
        addRole(role,concept);
        return this;
    }

    public Concept getSubject() {
        return subject;
    }

    public Concept getRole(Role role) {
        return this.role.get(role);
    }

}
