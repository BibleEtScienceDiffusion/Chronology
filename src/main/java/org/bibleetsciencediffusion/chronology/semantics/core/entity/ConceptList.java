package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.value.ConceptKey;
import org.bibleetsciencediffusion.chronology.semantics.core.value.Name;

import java.util.ArrayList;
import java.util.List;

public class ConceptList<T extends Concept> /*extends Concept*/ {

    private List<T> list = new ArrayList<T>();

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public ConceptList<T> add(T element) {
        list.add(element);
        return this;
    }

    public ConceptList<T> addAll(List<T> list) {
        this.list.addAll(list);
        return this;
    }

    public ConceptList<T> addAll(ConceptList conceptList) {
        this.list.addAll(conceptList.getList());
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

    public T findFirstByKey(ConceptKey key) {
        T found = null;
        for (T item : getList()) {
            Name name = item.getName();
            for (ConceptKey ck : name.getList()) {
                if (ck.equals(key)) {
                    found = item;
                    break;
                }
            }
        }
        return found;
    }

    public Concept asConcept() {
        Concept target = Concept.LIST.clone();
        for (Concept concept : getList()) {
            target.addRelation(Relation.HAS_ELEMENT.clone().addRole(Role.TARGET, concept));
        }
        return target;
    }
}
