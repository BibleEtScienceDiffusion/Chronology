package org.bibleetsciencediffusion.chronology.semantics.core;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.DomainDefinition;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.FormatterVisitor;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.Property;
import org.junit.Test;

import java.io.PrintWriter;


public class ConceptTest {

    @Test
    public void testConcept() throws Exception {
        Concept concept = new Concept();
    }


    @Test
    public void testPropertyIsoCode() throws Exception {
        Property.ISO_CODE.accept(new FormatterVisitor(new PrintWriter(System.out), "fr"));
    }

    @Test
    public void testPropertyName() throws Exception {
        Property.NAME.accept(new FormatterVisitor(new PrintWriter(System.out), "fr"));
    }

    @Test
    public void testAbraham() throws Exception {
        DomainDefinition.ABRAHAM.accept(new FormatterVisitor(new PrintWriter(System.out), "fr"));
    }


}
