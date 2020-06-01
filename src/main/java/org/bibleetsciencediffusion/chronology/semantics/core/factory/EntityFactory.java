package org.bibleetsciencediffusion.chronology.semantics.core.factory;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.*;
import org.bibleetsciencediffusion.chronology.semantics.core.repository.EntityRepository;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

public class EntityFactory {

    private static EntityFactory instance = new EntityFactory();

    public static EntityFactory getInstance() {
        return instance;
    }


    private OWLDataFactory dataFactory;

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
        OWLIndividual individual = dataFactory.getOWLNamedIndividual(id);
        Referent referent = new Referent(individual);
        referent.setId(id);
        store(referent);
        return referent;
    }

    public Concept newConcept(String id) {
        OWLClass clazz = dataFactory.getOWLClass(id);
        Concept concept = new Concept(clazz);
        concept.setId(id);
        store(concept);
        return concept;
    }

    public Property newProperty(String id) {
        OWLDataProperty dataProperty = dataFactory.getOWLDataProperty(id);
        Property property = new Property(dataProperty);
        property.setId(id);
        store(property);
        return property;
    }

    public Relation newRelation(String id) {
        OWLObjectProperty objectProperty = dataFactory.getOWLObjectProperty(id);
        Relation relation = new Relation(objectProperty);
        relation.setId(id);
        store(relation);
        return relation;
    }

    private void store(Entity entity) {
        // new ID
        if (entity.getId() == null) {
            entity.setId(IdFactory.getInstance().generate());
        }
        // store in repository
        EntityRepository.getInstance().add((NamedEntity) entity);
    }
}
