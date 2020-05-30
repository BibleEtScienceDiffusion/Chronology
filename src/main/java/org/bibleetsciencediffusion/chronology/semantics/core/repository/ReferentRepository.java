package org.bibleetsciencediffusion.chronology.semantics.core.repository;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Referent;
import org.bibleetsciencediffusion.chronology.semantics.core.value.ConceptKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Entities that evolve in time
 */

public class ReferentRepository {
    protected static ReferentRepository instance = new ReferentRepository();

    public static ReferentRepository getInstance() {
        return instance;
    }

    private Map<ConceptKey, List<Referent>> keyMap = new HashMap<>();
    private Map<String, Referent> idMap = new HashMap<>();

    private ReferentRepository() {
    }

    public void add(Referent newReferent) {
        idMap.put(newReferent.getId(), newReferent);
        List<ConceptKey> conceptKeyList = newReferent.getPrototype().getName().getList();
        for (ConceptKey conceptKey : conceptKeyList) {
            List<Referent> referentList = keyMap.getOrDefault(conceptKey, new ArrayList<>());
            referentList.add(newReferent);
            keyMap.put(conceptKey, referentList);
        }
    }

    public List<Referent> findByKey(ConceptKey key) {
        return keyMap.get(key);
    }

    public Referent findById(String id) {
        return idMap.get(id);
    }

}