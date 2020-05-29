package org.bibleetsciencediffusion.chronology.ontology;

public interface PropertyOntology {

    Property VALUE = new Property(Entity.ENGLISH, "date")
            .addName(Entity.FRENCH, "date")
            .setType(Object.class)
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.PROPERTY))
            .setSubject(Concept.PROPERTY)
            .addClass(Concept.PROPERTY);

    Property DATE = new Property(Entity.ENGLISH, "date")
            .addName(Entity.FRENCH, "date")
            .setType(Date.class)
            .addRelation(new Relation(Relation.DEPENDENCY).addRole(Role.TARGET, Concept.EVENT))
            .setSubject(Concept.EVENT)
            .addClass(Concept.PROPERTY);

    Property NAME = new Property(Entity.ENGLISH, "name")
            .addName(Entity.FRENCH, "nom")
            .setType(Name.class)
            .setSubject(Concept.CONCEPT)
            .addClass(Concept.PROPERTY);

    Property ISO_CODE = new Property(Entity.ENGLISH, "ISO code")
            .addName(Entity.FRENCH, "code ISO")
            .setType(String.class)
            .setSubject(Concept.LANGUAGE)
            .addProperty(Property.VALUE, Void.TYPE)
            .addClass(Concept.PROPERTY);

    Property EN_ISO_CODE = new Property(Entity.ENGLISH, "EN ISO code")
            .addName(Entity.FRENCH, "ISO code EN")
            .addProperty(Property.VALUE, "en")
            .addClass(Property.ISO_CODE);

    Property FR_ISO_CODE = new Property(Entity.ENGLISH, "FR ISO code")
            .addName(Entity.FRENCH, "ISO code FR")
            .addProperty(Property.VALUE, "fr")
            .addClass(Property.ISO_CODE);

    Property YEAR = new Property(Entity.ENGLISH, "year")
            .addName(Entity.FRENCH, "année")
            .setType(Integer.class)
            .setSubject(Property.DATE)
            .addClass(Concept.PROPERTY);

    Property MONTH = new Property(Entity.ENGLISH, "month")
            .addName(Entity.FRENCH, "mois")
            .setType(Integer.class)
            .setSubject(Property.DATE)
            .addClass(Concept.PROPERTY);

    Property DAY = new Property(Entity.ENGLISH, "day")
            .addName(Entity.FRENCH, "jour")
            .setType(Integer.class)
            .setSubject(Property.DATE)
            .addClass(Concept.PROPERTY);
}
