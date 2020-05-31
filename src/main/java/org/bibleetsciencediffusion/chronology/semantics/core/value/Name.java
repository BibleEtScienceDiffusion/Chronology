package org.bibleetsciencediffusion.chronology.semantics.core.value;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return list.equals(name.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
