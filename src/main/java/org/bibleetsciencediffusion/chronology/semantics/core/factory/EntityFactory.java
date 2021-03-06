package org.bibleetsciencediffusion.chronology.semantics.core.factory;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.*;
import org.bibleetsciencediffusion.chronology.semantics.core.repository.EntityRepository;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

public class EntityFactory {

    private static EntityFactory instance = new EntityFactory();

    private OWLDataFactory dataFactory;

    private String ontologyIRI = "";

    //TODO : use namespace in a map : String -> EntityFactory
    public static EntityFactory getInstance() {
        return instance;
    }


    public String getOntologyIRI() {
        return ontologyIRI;
    }

    public void setOntologyIRI(String ontologyIRI) {
        this.ontologyIRI = ontologyIRI;
    }

    private EntityFactory() {
        dataFactory = OWLManager.getOWLDataFactory();
    }

    public OWLDataFactory getDataFactory() {
        return dataFactory;
    }

    public void setDataFactory(OWLDataFactory dataFactory) {
        this.dataFactory = dataFactory;
    }


    public Referent createReferent(String id) {
        OWLNamedIndividual individual = dataFactory.getOWLNamedIndividual(IRI.create(ontologyIRI + ":" + id));
        Referent referent = new Referent(individual);
        store(referent);
        return referent;
    }

    public Concept createConcept(String id) {
        OWLClass clazz = dataFactory.getOWLClass(IRI.create(ontologyIRI + "#" + id));
        Concept concept = new Concept(clazz);
        store(concept);
        return concept;
    }

    public Property createProperty(String id) {
        OWLDataProperty dataProperty = dataFactory.getOWLDataProperty(IRI.create(ontologyIRI + "#" + id));
        Property property = new Property(dataProperty);
        store(property);
        return property;
    }

    public Relation createRelation(String id) {
        OWLObjectProperty objectProperty = dataFactory.getOWLObjectProperty(IRI.create(ontologyIRI + "#" + id));
        Relation relation = new Relation(objectProperty);
        store(relation);
        return relation;
    }

    private void store(Entity entity) {
        // store in repository
        EntityRepository.getInstance().add((NamedEntity) entity);
    }
}
