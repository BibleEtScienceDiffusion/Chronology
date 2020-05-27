package org.bibleetsciencediffusion.chronology.ontology;

public class Role extends Concept implements RoleOntology {

    public Role() {

    }



    public Role(Concept language, String localizedName) {
        super(language, localizedName);
    }

    public Role addName(Concept language, String localizedName) {
        addName(language, localizedName);
        return this;
    }


}
