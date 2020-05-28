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
        setParent(model.getParent()).setName(model.getName());
        this.property = model.property;
        this.relation = model.relation;
    }

    public Concept(Concept language, String localizedName) {
        addName(language, localizedName);
    }



    public Concept addName(Concept language, String localizedName) {
        Map<Concept,Object> name = getName();
        if (name == null) {
            name = new HashMap<Concept,Object>();
        }
        name.put(language, localizedName);
        setName (name);
        return this;
    }

    public Concept setName( Map<Concept, Object> name) {
        this.property.put(Property.NAME, name);
        return this;
    }

    public  Map<Concept, Object> getName() {
        return (Map<Concept,Object>) this.property.get(Property.NAME);
    }

    /**
     * helper
     * @param parent
     * @return this
     */
    public Concept setParent(Concept parent) {
        Relation parentRelation = new Relation(Relation.PARENT);
        parentRelation.addRole(Role.TARGET,parent);
        addRelation(parentRelation);
        return this;
    }

    /**
     * helper
     * @return
     */
    public Concept getParent() {
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
