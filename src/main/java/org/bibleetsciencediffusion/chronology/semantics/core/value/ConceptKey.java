package org.bibleetsciencediffusion.chronology.semantics.core.value;

import java.util.Locale;

public class ConceptKey {


    String name;

    String lang;

    public ConceptKey(String lang, String name) {
        this.name = name;
        this.lang = lang;
    }

    public ConceptKey(Locale locale, String name) {
        this.name = name;
        this.lang = locale.getLanguage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
