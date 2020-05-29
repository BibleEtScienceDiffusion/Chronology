package org.bibleetsciencediffusion.chronology.ontology;

import java.util.ArrayList;
import java.util.List;

public class ConceptList<T extends Concept> extends Concept {

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

    public T getFirstByModel(T model) {
        T found = null;
        for (T item : getList()) {
            if (item.getName().hashCode() == model.getName().hashCode()) {
                found = item;
                break;
            }
        }
        return found;
    }

}
