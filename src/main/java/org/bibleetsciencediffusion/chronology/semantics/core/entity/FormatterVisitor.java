package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import java.io.PrintWriter;

public class FormatterVisitor implements EntityVisitor {

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
        //printWriter.println("concept name:" + concept.getName().get(getLang()));

    }

    @Override
    public void visit(Referent referent) {

    }

    public void visit(Entity entity) {
        //printWriter.print("entity name:" + entity.getName().get(getLang()) + " ");
    }

    public void visit(Property property) {
        //printWriter.print("property name:" + property.getName().get(getLang()) + " ");
    }

    public void visit(Relation relation) {
        //printWriter.print("relation name:" + relation.getName().get(getLang()) + " ");
    }

    public void visit(Process process) {
        //printWriter.print("process name:" + process.getName().get(getLang()) + " ");

    }

    @Override
    public void visit(EntityList v) {

    }


}
