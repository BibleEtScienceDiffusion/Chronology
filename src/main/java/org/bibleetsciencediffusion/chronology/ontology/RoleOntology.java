package org.bibleetsciencediffusion.chronology.ontology;

public interface RoleOntology {

    Role AGENT = new Role(Language.EN,"agent").addName(Language.FR,"agent");

    Role PATIENT = new Role(Language.EN,"patient").addName(Language.FR,"patient");

    Role LOCATION = new Role(Language.EN,"location").addName(Language.FR,"localisation");
}
