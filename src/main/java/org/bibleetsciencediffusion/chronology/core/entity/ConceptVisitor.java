package org.bibleetsciencediffusion.chronology.core.entity;

public interface ConceptVisitor {

    void visit(Concept concept);

    void visit(Entity entity);

    void visit(Property property);

    void visit(Relation relation);

    void visit(Process process);

    void visit(Event event);

    void visit(Role role);

    void visit(Date date);

}
