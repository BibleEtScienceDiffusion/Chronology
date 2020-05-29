package org.bibleetsciencediffusion.chronology.core.entity;

/**
 * concept valeur
 */

public class Date extends Concept {

    public Date() {
        addRelation(new Relation(Relation.REFERENCE).addRole(Role.TARGET, Event.BIRTH_JC));
    }

    public Date getReference() {
        return (Date) getRelation().getFirstByModel(Relation.REFERENCE).getRole(Role.TARGET);
    }

    public Date setReference(Event reference) {
        getRelation().getFirstByModel(Relation.REFERENCE).addRole(Role.TARGET, reference);
        return this;
    }

    public int getYear() {
        return (Integer) getProperty().get(Property.YEAR);
    }

    public Date setYear(int year) {
        addProperty(Property.YEAR, year);
        return this;
    }

    public int getMonth() {
        return (Integer) getProperty().get(Property.MONTH);
    }

    public Date setMonth(int month) {
        addProperty(Property.MONTH, month);
        return this;
    }

    public int getDay() {
        return (Integer) getProperty().get(Property.DAY);
    }

    public Date setDay(int day) {
        addProperty(Property.DAY, day);
        return this;
    }

    public void accept(ConceptVisitor v) {
        v.visit(this);
    }


}
