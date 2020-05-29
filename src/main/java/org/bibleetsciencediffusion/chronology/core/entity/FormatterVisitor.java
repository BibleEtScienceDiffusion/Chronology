package org.bibleetsciencediffusion.chronology.core.entity;

import java.io.PrintWriter;

public class FormatterVisitor implements ConceptVisitor {

    /**
     * locale
     */
    private String lang;
    private PrintWriter printWriter;


    public FormatterVisitor() {

    }


    public FormatterVisitor(PrintWriter out, String lang) {
        setLang(lang);
        this.printWriter = out;
    }


    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;

    }

    public PrintWriter getPrintWriter() {
        return printWriter;
    }

    public void setPrintWriter(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }

    public void visit(Concept concept) {
        printWriter.println("concept name:" + concept.getName().get(getLang()));

        for (Property property : concept.getProperty().keySet()) {
            property.accept(this);
            printWriter.println("value:" + concept.getProperty().get(property));
        }
        for (Relation relation : concept.getRelation().getList()) {
            relation.accept(this);
        }
    }

    public void visit(Entity entity) {
        printWriter.print("entity name:" + entity.getName().get(getLang()) + " ");
    }

    public void visit(Property property) {
        printWriter.print("property name:" + property.getName().get(getLang()) + " ");
    }

    public void visit(Relation relation) {
        printWriter.print("relation name:" + relation.getName().get(getLang()) + " ");
    }

    public void visit(Process process) {
        printWriter.print("process name:" + process.getName().get(getLang()) + " ");
        if (process.getBegin()!=null) {
            printWriter.print("from:");
            process.getBegin().accept(this);
        }
        if (process.getEnd()!=null) {
            printWriter.print("from:");
            process.getEnd().accept(this);
        }
    }

    public void visit(Event event) {
        printWriter.print("event name:" + event.getName().get(getLang()) + " ");
        printWriter.println("date:" + event.getDate().getYear());
    }

    public void visit(Role role) {
        printWriter.print("role name:" + role.getName().get(getLang()) + " ");
    }

    public void visit(Date date) {

    }
}
