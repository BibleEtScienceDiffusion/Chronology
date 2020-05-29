package org.bibleetsciencediffusion.chronology.core;

import org.bibleetsciencediffusion.chronology.core.entity.Concept;
import org.bibleetsciencediffusion.chronology.core.entity.Entity;
import org.bibleetsciencediffusion.chronology.core.entity.FormatterVisitor;
import org.bibleetsciencediffusion.chronology.core.entity.Property;
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
        Entity.ABRAHAM.accept(new FormatterVisitor(new PrintWriter(System.out), "fr"));
    }


}
