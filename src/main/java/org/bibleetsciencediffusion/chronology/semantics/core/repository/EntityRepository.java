package org.bibleetsciencediffusion.chronology.semantics.core.repository;

import org.bibleetsciencediffusion.chronology.semantics.core.aggregate.EntityList;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.Entity;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.NamedEntity;
import org.bibleetsciencediffusion.chronology.semantics.core.value.EntityKey;
import org.bibleetsciencediffusion.chronology.semantics.core.value.Name;

import java.util.HashMap;
import java.util.Map;

public class EntityRepository {
    protected static EntityRepository instance = new EntityRepository();
    private Map<EntityKey, EntityList> keyMap = new HashMap<EntityKey, EntityList>();
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
            for (EntityKey entityKey : name.getList()) {
                EntityList entityList = keyMap.getOrDefault(entityKey, new EntityList());
                entityList.add(newConcept);
                keyMap.put(entityKey, entityList);
            }
        }
    }

    public EntityList findByKey(EntityKey key) {
        return keyMap.get(key);
    }

    public Entity findById(String id) {
        return idMap.get(id);
    }
}
