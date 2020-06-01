package org.bibleetsciencediffusion.chronology.semantics.core.value;

import java.util.Locale;
import java.util.Objects;

public class EntityKey {

    String term;

    String lang;

    public EntityKey(String lang, String term) {
        this.term = term;
        this.lang = lang;
    }

    public EntityKey(Locale locale, String term) {
        this.term = term;
        this.lang = locale.getLanguage();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityKey that = (EntityKey) o;
        return term.equals(that.term) &&
                lang.equals(that.lang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(term, lang);
    }
}
