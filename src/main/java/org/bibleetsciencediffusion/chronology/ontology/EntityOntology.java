package org.bibleetsciencediffusion.chronology.ontology;

public interface EntityOntology {

    Entity ENGLISH = new Entity(Entity.ENGLISH,"english")
            .addName(Entity.FRENCH,"anglais").addClass(Concept.LANGUAGE)
            .addProperty(Property.ISO_CODE,"en");

    Entity FRENCH = new Entity(EntityOntology.ENGLISH,"french")
            .addName(Entity.FRENCH,"français").addClass(Concept.LANGUAGE)
            .addProperty(Property.ISO_CODE,"fr");
    
    Entity ISRAEL = new Entity(Entity.ENGLISH,"Israel")
            .addName(Entity.FRENCH,"Israël")
            .addClass(Concept.COUNTRY);

    Entity CANAAN = new Entity(Entity.ENGLISH,"Canaan")
            .addName(Entity.FRENCH,"Canaan")
            .addClass(Concept.COUNTRY);;

    Entity EGYPT = new Entity(Entity.ENGLISH,"Egypt")
            .addName(Entity.FRENCH,"Egypte")
            .addClass(Concept.COUNTRY);;

    Entity ABRAHAM = new Entity(Entity.ENGLISH, "Abram")
            .addClass(Concept.HUMAN)
            .addProcess(
                    new Process(Process.LIFE)
                            .setBegin(new Event().setDate(new Date().setYear(1948)))
                            .setEnd(new Event().setDate(new Date().setYear(2123)))
                            .addProcess(new Process((Process.COVENANT))
                                    .setBegin(new Event().setDate(new Date().setYear(2018)))
                                    .addRole(Role.PARTICIPANT, new Entity(Entity.ABRAHAM)
                                            .addName(Entity.ENGLISH, "Abraham"))
                                    .addRole(Role.LOCATION, CANAAN)
                            ));

}
