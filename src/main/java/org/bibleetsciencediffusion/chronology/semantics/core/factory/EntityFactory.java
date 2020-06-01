package org.bibleetsciencediffusion.chronology.semantics.core.factory;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.*;
import org.bibleetsciencediffusion.chronology.semantics.core.repository.EntityRepository;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

public class EntityFactory {

    private static EntityFactory instance = new EntityFactory();

    private OWLDataFactory dataFactory;

    private String ontologyIRI = "";

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


    public Referent newReferent(String id) {
        OWLNamedIndividual individual = dataFactory.getOWLNamedIndividual(ontologyIRI + ":", id);
        Referent referent = new Referent(individual);
        store(referent);
        return referent;
    }

    public Concept newConcept(String id) {
        OWLClass clazz = dataFactory.getOWLClass(ontologyIRI + "#", id);
        Concept concept = new Concept(clazz);
        store(concept);
        return concept;
    }

    public Property newProperty(String id) {
        OWLDataProperty dataProperty = dataFactory.getOWLDataProperty(ontologyIRI + "#", id);
        Property property = new Property(dataProperty);
        store(property);
        return property;
    }

    public Relation newRelation(String id) {
        OWLObjectProperty objectProperty = dataFactory.getOWLObjectProperty(ontologyIRI + "#", id);
        Relation relation = new Relation(objectProperty);
        store(relation);
        return relation;
    }

    private void store(Entity entity) {
        // store in repository
        EntityRepository.getInstance().add((NamedEntity) entity);
    }
}
