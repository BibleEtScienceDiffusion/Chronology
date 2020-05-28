package org.bibleetsciencediffusion.chronology.ontology;

import java.util.HashMap;
import java.util.Map;

public class Concept implements ConceptOntology {

    protected Map<Property,Object> property = new HashMap<Property,Object>();


    protected ConceptList<Relation> relation = new ConceptList<Relation>();

    public Concept() {
    }

    public Concept(Concept model) {
        addClass(model.getFirstClass()).setName(model.getName());
        this.property = model.property;
        this.relation = model.relation;
    }

    public Concept(Entity language, String localizedName) {
        addName(language, localizedName);
    }



    public Concept addName(Entity language, String localizedName) {
        Name name = getName();
        name.add((String)language.getProperty().get(Property.ISO_CODE), localizedName);
        return this;
    }

    public Concept setName(Name name) {
        this.property.put(Property.NAME, name);
        return this;
    }

    public  Name getName() {
        Name name = (Name) this.property.get(Property.NAME);
        if (name == null) {
            name = new Name();
            setName(name);
        }
        return name;
    }

    /**
     * helper
     * @param concept
     * @return this
     */
    public Concept addClass(Concept concept) {
        Relation parentRelation = new Relation(Relation.HAS_CLASS);
        parentRelation.addRole(Role.TARGET,concept);
        addRelation(parentRelation);
        return this;
    }

    /**
     * helper
     * @return
     */
    public Concept getFirstClass() {
        Relation parentRelation = getFirstRelationByModel(Relation.HAS_CLASS);
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

    public Map<Property, Object> getProperty() {
        return property;
    }


    public Concept addRelation(Relation relation) {
        this.relation.add(relation);
        relation.setSubject(this);
        return this;
    }

    public ConceptList<Relation> getRelation() {
        return relation;
    }

    public void setRelation(ConceptList<Relation> relation) {
        this.relation = relation;
    }


    public Relation getFirstRelationByModel(Relation model) {
        Relation foundRelation = null;
        for (Relation relation : this.relation.getList()) {
            if (relation.getName().hashCode() == model.hashCode()) {
                foundRelation = relation;
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



    public void accept(OntologyVisitor v) {
        v.visit(this);
    }
}
