package org.bibleetsciencediffusion.chronology.ontology;

public class Role extends Concept implements RoleOntology {

    public Role() {

    }



    public Role(Language language, String localizedName) {
        super(language, localizedName);
    }

    public Role addName(Language language, String localizedName) {
        this.name.put(language, localizedName);
        return this;
    }


}
