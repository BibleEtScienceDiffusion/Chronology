package org.bibleetsciencediffusion.chronology.core.entity;

import org.bibleetsciencediffusion.chronology.core.factory.ConceptFactory;

public class Role extends Concept {

    public Role() {
    }

    public Role(String language, String localizedName) {
        super(language, localizedName);
    }

    public static Role newRole(String lang, String name) {
        return ConceptFactory.getInstance().newRole(lang, name);
    }

    public Role addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Role addClass(Concept concept) {
        super.addClass(concept);
        return this;
    }

    public void accept(ConceptVisitor v) {
        v.visit(this);
    }
}
