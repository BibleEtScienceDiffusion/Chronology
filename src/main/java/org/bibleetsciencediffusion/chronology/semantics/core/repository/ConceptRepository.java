package org.bibleetsciencediffusion.chronology.semantics.core.repository;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.ConceptList;
import org.bibleetsciencediffusion.chronology.semantics.core.value.ConceptKey;
import org.bibleetsciencediffusion.chronology.semantics.core.value.Name;

import java.util.HashMap;
import java.util.Map;

public class ConceptRepository {
    protected static ConceptRepository instance = new ConceptRepository();
    private Map<ConceptKey, ConceptList> keyMap = new HashMap<ConceptKey, ConceptList>();
    private Map<String, Concept> idMap = new HashMap<String, Concept>();

    private ConceptRepository() {
    }

    public static ConceptRepository getInstance() {
        return instance;
    }

    public void add(Concept newConcept) {
        idMap.put(newConcept.getId(), newConcept);
        Name name = newConcept.getName();
        if (name != null) {
            for (ConceptKey conceptKey : name.getSet()) {
                ConceptList conceptList = keyMap.getOrDefault(conceptKey, new ConceptList());
                conceptList.add(newConcept);
                keyMap.put(conceptKey, conceptList);
            }
        }
    }

    public ConceptList findByKey(ConceptKey key) {
        return keyMap.get(key);
    }

    public Concept findById(String id) {
        return idMap.get(id);
    }
}
