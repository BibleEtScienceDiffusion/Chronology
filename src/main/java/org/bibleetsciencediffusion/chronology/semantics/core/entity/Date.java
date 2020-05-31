package org.bibleetsciencediffusion.chronology.semantics.core.entity;

/**
 * concept valeur
 */

public class Date extends Concept {

    public Date() {
        addRelation(REFERENCE.clone().addRole(TARGET, BIRTH_JC));
    }

    public Date getReference() {
        return (Date) getRelation().findFirstByModel(REFERENCE).getRole(TARGET);
    }

    public Date setReference(Event reference) {
        getRelation().findFirstByModel(REFERENCE).addRole(TARGET, reference);
        return this;
    }

    public int getYear() {
        return (Integer) getProperty().get(YEAR);
    }

    public Date setYear(int year) {
        addProperty(YEAR, year);
        return this;
    }

    public int getMonth() {
        return (Integer) getProperty().get(MONTH);
    }

    public Date setMonth(int month) {
        addProperty(MONTH, month);
        return this;
    }

    public int getDay() {
        return (Integer) getProperty().get(DAY);
    }

    public Date setDay(int day) {
        addProperty(DAY, day);
        return this;
    }

    public void accept(ConceptVisitor v) {
        v.visit(this);
    }


}
