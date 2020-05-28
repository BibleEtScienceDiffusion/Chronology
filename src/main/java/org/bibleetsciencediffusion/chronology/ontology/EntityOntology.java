package org.bibleetsciencediffusion.chronology.ontology;

public interface EntityOntology {

    Entity ENGLISH = new Entity(Entity.ENGLISH,"english")
            .addName(Entity.FRENCH,"anglais").setParent(Concept.LANGUAGE);

    Entity FRENCH = new Entity(EntityOntology.ENGLISH,"french")
            .addName(Entity.FRENCH,"français").setParent(Concept.LANGUAGE);


    Entity ISRAEL = new Entity(Entity.ENGLISH,"Israel").addName(Entity.FRENCH,"Israël").setParent(ConceptOntology.COUNTRY);
    Entity CANAAN = new Entity(Entity.ENGLISH,"Canaan").addName(Entity.FRENCH,"Canaan").setParent(ConceptOntology.COUNTRY);;
    Entity EGYPT = new Entity(Entity.ENGLISH,"Egypt").addName(Entity.FRENCH,"Egypte").setParent(ConceptOntology.COUNTRY);;



    Entity ABRAHAM = new Entity(Entity.ENGLISH,"Abram").setParent(Concept.HUMAN)
                        .addProcess(
                                new Process(Process.LIFE)
                                        .setBegin(new Event(Event.BIRTH).setDate(new Date(Date.AM,1948)))
                                        .setEnd(new Event(Event.BIRTH).setDate(new Date(Date.AM,2223)))
                                        .addProcess(new Process((Process.COVENANT))
                                                .setBegin(new Event().setDate(new Date(Date.AM,2048))))
                                                .addRole(Role.PARTICIPANT, new Entity(EntityOntology.ABRAHAM)
                                                    .addName(Entity.ENGLISH, "Abraham"))
                                                .addRole(Role.LOCATION, CANAAN)
                                                );

}
