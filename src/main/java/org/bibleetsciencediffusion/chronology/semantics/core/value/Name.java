package org.bibleetsciencediffusion.chronology.semantics.core.value;

import java.util.HashSet;
import java.util.Set;

public class Name {

    public static String ENGLISH = "EN";
    public static String FRENCH = "FR";

    private Set<ConceptKey> set = new HashSet<ConceptKey>();


    public Name add(String languageIsoCode, String localizedName) {
        set.add(new ConceptKey(languageIsoCode, localizedName));
        return this;
    }

    public Set<ConceptKey> getSet() {
        return set;
    }

}
