package org.bibleetsciencediffusion.chronology.ontology;

import java.util.HashMap;
import java.util.Map;

public class Relation extends Concept implements RelationOntology {

    protected Map<Role,Concept> role = new HashMap<Role,Concept>();

    public Relation() {

    }

    public Relation(Language language, String localizedName) {
        new Relation().addName(language, localizedName);
    }

    public Relation addName(Language language, String localizedName) {
        this.name.put(language, localizedName);
        return this;
    }

    public Relation addRole(Role role, Concept concept) {
        this.role.put(role,concept);
        return this;
    }

    public Concept getRole(Role role) {
        return this.role.get(role);
    }

}
