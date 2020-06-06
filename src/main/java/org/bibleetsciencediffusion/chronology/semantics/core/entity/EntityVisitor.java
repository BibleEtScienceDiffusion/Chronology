package org.bibleetsciencediffusion.chronology.semantics.core.entity;

public interface EntityVisitor {

    void visit(Concept concept);

    void visit(Referent referent);

    void visit(Property property);

    void visit(Relation relation);

    void visit(Process process);


}
