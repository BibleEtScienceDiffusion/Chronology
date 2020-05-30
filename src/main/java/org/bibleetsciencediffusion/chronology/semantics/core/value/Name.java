package org.bibleetsciencediffusion.chronology.semantics.core.value;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Name {

    private List<ConceptKey> list = new ArrayList<ConceptKey>();


    public Name add(String languageIsoCode, String localizedName) {
        list.add(new ConceptKey(languageIsoCode, localizedName));
        return this;
    }

    public Name add(Locale locale, String localizedName) {
        list.add(new ConceptKey(locale, localizedName));
        return this;
    }

    public List<ConceptKey> getList() {
        return list;
    }

}
