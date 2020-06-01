package org.bibleetsciencediffusion.chronology.semantics.core.repository;

import org.bibleetsciencediffusion.chronology.semantics.core.aggregate.EntityList;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.Entity;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.NamedEntity;
import org.bibleetsciencediffusion.chronology.semantics.core.value.ConceptKey;
import org.bibleetsciencediffusion.chronology.semantics.core.value.Name;

import java.util.HashMap;
import java.util.Map;

public class EntityRepository {
    protected static EntityRepository instance = new EntityRepository();
    private Map<ConceptKey, EntityList> keyMap = new HashMap<ConceptKey, EntityList>();
    private Map<String, Entity> idMap = new HashMap<String, Entity>();

    private EntityRepository() {
    }

    public static EntityRepository getInstance() {
        return instance;
    }

    public void add(NamedEntity newConcept) {
        idMap.put(newConcept.getId(), newConcept);
        Name name = newConcept.getName();
        if (name != null) {
            for (ConceptKey conceptKey : name.getList()) {
                EntityList entityList = keyMap.getOrDefault(conceptKey, new EntityList());
                entityList.add(newConcept);
                keyMap.put(conceptKey, entityList);
            }
        }
    }

    public EntityList findByKey(ConceptKey key) {
        return keyMap.get(key);
    }

    public Entity findById(String id) {
        return idMap.get(id);
    }
}
