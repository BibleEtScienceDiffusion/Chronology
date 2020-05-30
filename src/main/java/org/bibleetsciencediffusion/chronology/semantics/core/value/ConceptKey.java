package org.bibleetsciencediffusion.chronology.semantics.core.value;

public class ConceptKey {


    String name;

    String lang;

    public ConceptKey(String lang, String name) {
        this.name = name;
        this.lang = lang;
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
