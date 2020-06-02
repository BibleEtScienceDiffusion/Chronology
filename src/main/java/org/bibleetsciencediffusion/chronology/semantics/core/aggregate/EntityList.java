package org.bibleetsciencediffusion.chronology.semantics.core.aggregate;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.EntityVisitor;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.NamedEntity;
import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.bibleetsciencediffusion.chronology.semantics.core.value.EntityKey;
import org.bibleetsciencediffusion.chronology.semantics.core.value.Name;
import org.semanticweb.owlapi.model.OWLNamedIndividual;

import java.util.ArrayList;
import java.util.List;

//TODO : change with collection Class
public class EntityList<T extends NamedEntity> extends NamedEntity<OWLNamedIndividual> {

    private static int counter = 0;

    private List<T> list = new ArrayList<T>();

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public EntityList() {
        counter++;
        OWLNamedIndividual individual = EntityFactory.getInstance().getDataFactory().getOWLNamedIndividual(
                EntityFactory.getInstance().getOntologyIRI() + "#", "list" + counter);
        this.setOWLObject(individual);
    }

    public EntityList<T> add(T element) {
        list.add(element);
        return this;
    }

    public EntityList<T> addAll(List<T> list) {
        this.list.addAll(list);
        return this;
    }

    public EntityList<T> addAll(EntityList entityList) {
        this.list.addAll(entityList.getList());
        return this;
    }

    public T findFirstByModel(T model) {
        T found = null;
        for (T item : getList()) {
            if (item.getName().equals(model.getName())) {
                found = item;
                break;
            }
        }
        return found;
    }

    public T findFirstByKey(EntityKey key) {
        T found = null;
        for (T item : getList()) {
            Name name = item.getName();
            for (EntityKey ck : name.getList()) {
                if (ck.equals(key)) {
                    found = item;
                    break;
                }
            }
        }
        return found;
    }

    /*
    public Concept asConcept() {
        Concept target = Concept.LIST.clone();
        for (Concept concept : getList()) {
            target.addRelation(Relation.HAS_ELEMENT.clone().addRole(Role.TARGET, concept));
        }
        return target;
    }

     */
    @Override
    public void accept(EntityVisitor v) {
        v.visit(this);
    }
}
