package org.bibleetsciencediffusion.chronology.ontology;

import java.util.ArrayList;
import java.util.List;

public class Relation extends Concept implements RelationOntology {

    private List<Concept> target = new ArrayList<Concept>();



    public Relation() {

    }

    public Relation(Language language, String localizedName) {
        new Relation().addName(language, localizedName);
    }

    public Relation addName(Language language, String localizedName) {
        this.name.put(language, localizedName);
        return this;
    }

    public Relation addTarget(Concept target) {
        this.target.add(target);
        return this;
    }

}
