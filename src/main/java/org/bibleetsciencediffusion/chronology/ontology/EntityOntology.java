package org.bibleetsciencediffusion.chronology.ontology;

public interface EntityOntology {

    Entity ISRAEL = new Entity(Property.ENGLISH,"Israel").addName(Property.FRENCH,"Israël").setAscendant(ConceptOntology.COUNTRY);
    Entity CANAAN = new Entity(Property.ENGLISH,"Canaan").addName(Property.FRENCH,"Canaan").setAscendant(ConceptOntology.COUNTRY);;
    Entity EGYPT = new Entity(Property.ENGLISH,"Egypt").addName(Property.FRENCH,"Egypte").setAscendant(ConceptOntology.COUNTRY);;

    Entity ABRAHAM = new Entity(Property.ENGLISH,"Abram").setAscendant(Concept.HUMAN)
                        .addProcess(
                                new Process(Process.LIFE)
                                        .setBegin(new Event(Event.BIRTH).setDate(new Date(Date.AM,1948)))
                                        .setEnd(new Event(Event.BIRTH).setDate(new Date(Date.AM,2223)))
                                        .addProcess(new Process((Process.COVENANT))
                                                .setBegin(new Event().setDate(new Date(Date.AM,2048))))
                                                .addRole(Role.PARTICIPANT, new Entity(EntityOntology.ABRAHAM)
                                                    .addName(Property.ENGLISH, "Abraham"))
                                                .addRole(Role.LOCATION, CANAAN)
                                                );

}
