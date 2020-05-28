package org.bibleetsciencediffusion.chronology.ontology;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concept implements ConceptOntology {

    protected Map<Property,Object> property = new HashMap<Property,Object>();

    protected List<Relation> relation = new ArrayList<Relation>();

    public Concept() {

    }

    public Concept(Concept model) {
        addParent(model.getFirstParent()).setName(model.getName());
        this.property = model.property;
        this.relation = model.relation;
    }

    public Concept(Entity language, String localizedName) {
        addName(language, localizedName);
    }



    public Concept addName(Entity language, String localizedName) {
        Map<Entity,Object> name = getName();
        if (name == null) {
            name = new HashMap<Entity,Object>();
        }
        name.put(language, localizedName);
        setName (name);
        return this;
    }

    public Concept setName( Map<Entity, Object> name) {
        this.property.put(Property.NAME, name);
        return this;
    }

    public  Map<Entity, Object> getName() {
        return (Map<Entity,Object>) this.property.get(Property.NAME);
    }

    /**
     * helper
     * @param parent
     * @return this
     */
    public Concept addParent(Concept parent) {
        Relation parentRelation = new Relation(Relation.PARENT);
        parentRelation.addRole(Role.TARGET,parent);
        addRelation(parentRelation);
        return this;
    }

    /**
     * helper
     * @return
     */
    public Concept getFirstParent() {
        Relation parentRelation = getFirstRelationByModel(Relation.PARENT);
        if (parentRelation == null) {
           return null;
        }
        else  {
            return parentRelation.getRole(Role.TARGET);
        }

    }

    public Concept addProperty(Property property, Object value) {
        this.property.put(property, value);
        property.setSubject(this);
        return this;
    }

    public Concept addRelation(Relation relation) {
        this.relation.add(relation);
        relation.setSubject(this);
        return this;
    }

    public Relation getFirstRelationByModel(Relation model) {
        Relation foundRelation = null;
        for (Relation relation: this.relation) {
            if (relation.getName().hashCode() == model.hashCode()) {
                foundRelation =relation;
                break;
            }
        }
        return foundRelation;
    }

    public boolean isNegation() {
        Relation  negationRelation = getFirstRelationByModel(Relation.NOT);
        return (negationRelation != null);
    }

    public boolean isAffirmation() {
        Relation  negationRelation = getFirstRelationByModel(Relation.NOT);
        return (negationRelation == null);
    }
}
