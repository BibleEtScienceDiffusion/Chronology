package org.bibleetsciencediffusion.chronology.semantics.core.repository;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Entity;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.NamedEntity;
import org.bibleetsciencediffusion.chronology.semantics.core.value.EntityKey;
import org.bibleetsciencediffusion.chronology.semantics.core.value.Name;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EntityRepository {
    protected static EntityRepository instance = new EntityRepository();

    // storage per key
    private Map<EntityKey, Collection<Entity>> keyMap = new HashMap<EntityKey, Collection<Entity>>();

    // storage per id
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
                Collection<Entity> entityList = keyMap.getOrDefault(entityKey, new ArrayList<Entity>());
                entityList.add(newConcept);
                keyMap.put(entityKey, entityList);
            }
        }
    }

    public Collection<Entity> findByKey(EntityKey key) {
        return keyMap.get(key);
    }

    public Entity findById(String id) {
        return idMap.get(id);
    }
}
