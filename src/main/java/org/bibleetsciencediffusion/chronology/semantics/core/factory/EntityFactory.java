package org.bibleetsciencediffusion.chronology.semantics.core.factory;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.*;
import org.bibleetsciencediffusion.chronology.semantics.core.repository.EntityRepository;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;

public class EntityFactory {

    private static EntityFactory instance = new EntityFactory();

    public static EntityFactory getInstance() {
        return instance;
    }

    private EntityFactory() {
    }


    public Referent newReferent(OWLIndividual individual) {
        Referent referent = new Referent(individual);
        store(referent);
        return referent;
    }

    public Concept newConcept(OWLClass clazz) {
        Concept concept = new Concept(clazz);
        store(concept);
        return concept;
    }

    public Property newProperty(OWLDataProperty dataProperty) {
        Property property = new Property(dataProperty);
        store(property);
        return property;
    }

    public Relation newRelation(OWLObjectProperty objectProperty) {
        Relation relation = new Relation(objectProperty);
        store(relation);
        return relation;
    }

    private void store(Entity entity) {
        // new ID
        entity.setId(IdFactory.getInstance().generate());
        // store in repository
        EntityRepository.getInstance().add((NamedEntity) entity);
    }
}
