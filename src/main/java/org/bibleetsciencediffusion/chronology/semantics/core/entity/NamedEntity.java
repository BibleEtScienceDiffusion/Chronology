package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.value.Name;

import java.util.Locale;

public class NamedEntity<T> extends Entity<T> {

    /**
     * null if anonymous
     */
    protected Name name;


    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public NamedEntity<T> addName(String language, String localizedName) {
        Name name = getName();
        if (name == null) {
            name = new Name();
        }
        name.add(language, localizedName);
        return this;
    }

    public NamedEntity<T> addName(Locale locale, String localizedName) {
        Name name = getName();
        name.add(locale, localizedName);
        return this;
    }

    public boolean isAnonymous() {
        return name != null;
    }

}