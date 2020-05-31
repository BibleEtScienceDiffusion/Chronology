package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.ConceptFactory;

import java.util.Locale;

public class Role extends Concept {

    static public String MULTIPLICITY_0 = "0";

    static public String MULTIPLICITY_1 = "1";

    static public String MULTIPLICITY_N = "N";

    String sourceMultiplicity;

    String destinationMultiplicity;

    public Role() {
    }

    public Role(String language, String localizedName) {
        super(language, localizedName);
    }

    public static Role newRole(String lang, String name) {
        return ConceptFactory.getInstance().newRole(lang, name);
    }

    public static Role newRole(Locale locale, String name) {
        return ConceptFactory.getInstance().newRole(locale, name);
    }

    public String getDestinationMultiplicity() {
        return destinationMultiplicity;
    }

    public void setDestinationMultiplicity(String destinationMultiplicity) {
        this.destinationMultiplicity = destinationMultiplicity;
    }

    public String getSourceMultiplicity() {
        return sourceMultiplicity;
    }

    public void setSourceMultiplicity(String sourceMultiplicity) {
        this.sourceMultiplicity = sourceMultiplicity;
    }


    public Role addName(String language, String localizedName) {
        super.addName(language, localizedName);
        return this;
    }

    public Role addName(Locale locale, String localizedName) {
        super.addName(locale.getLanguage(), localizedName);
        return this;
    }

    public Role addClass(Concept concept) {
        super.addClass(concept);
        return this;
    }

    public Role clone() {
        return clone();
    }

    public void accept(ConceptVisitor v) {
        v.visit(this);
    }
}
