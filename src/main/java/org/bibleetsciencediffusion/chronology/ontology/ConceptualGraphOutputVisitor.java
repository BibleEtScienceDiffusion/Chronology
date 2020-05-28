package org.bibleetsciencediffusion.chronology.ontology;

public class ConceptualGraphOutputVisitor implements OntologyVisitor {

    public ConceptualGraphOutputVisitor() {

    }

    public ConceptualGraphOutputVisitor(String lang) {
        setLang(lang);
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    private String lang;



    public void visit(Concept concept) {
        System.out.println("concept name:"+concept.getName().get(getLang()));

        for (Property property: concept.getProperty().keySet()) {
            property.accept(this);
            System.out.println("value:" + concept.getProperty().get(property));
        }
        for (Relation relation: concept.getRelation()) {
            relation.accept(this);
        }
    }

    public void visit(Entity entity) {
        System.out.print("entity name:"+entity.getName().get(getLang())+" ");
    }

    public void visit(Property property) {
        System.out.print("property name:"+property.getName().get(getLang())+" ");
    }

    public void visit(Relation relation) {
        System.out.print("relation name:"+relation.getName().get(getLang())+" ");
    }

    public void visit(Process process) {
        System.out.print("process name:"+process.getName().get(getLang())+" ");
        if (process.getBegin()!=null) {
            System.out.print("from:");
            process.getBegin().accept(this);
        }
        if (process.getEnd()!=null) {
            System.out.print("from:");
            process.getEnd().accept(this);
        }
    }

    public void visit(Event event) {
        System.out.print("event name:"+event.getName().get(getLang())+" ");
        System.out.println("date:"+event.getDate().getYear());
    }

    public void visit(Role role) {
        System.out.print("role name:"+role.getName().get(getLang())+" ");
    }
}
