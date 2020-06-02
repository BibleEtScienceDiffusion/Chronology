package org.bibleetsciencediffusion.chronology.semantics.core.entity;

import org.bibleetsciencediffusion.chronology.semantics.core.factory.EntityFactory;
import org.bibleetsciencediffusion.chronology.semantics.core.service.OntologyService;
import org.bibleetsciencediffusion.chronology.semantics.core.value.Name;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLEntity;

import java.util.Locale;

public abstract class NamedEntity<T extends OWLEntity> extends Entity<T> {

    /**
     * null if anonymous
     */
    protected Name name;


    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public NamedEntity<T> addName(String localizedName, String language) {
        Name name = getName();
        if (name == null) {
            name = new Name();
        }
        name.add(language, localizedName);
        OWLAnnotation commentAnnotation = EntityFactory.getInstance().getDataFactory()
                .getRDFSLabel(EntityFactory.getInstance().getDataFactory().getOWLLiteral(localizedName, language));
        OWLAxiom axiom = EntityFactory.getInstance().getDataFactory().getOWLAnnotationAssertionAxiom(getOWLObject().getIRI(), commentAnnotation);
        OntologyService.getInstance().addAxiom(axiom);
        return this;
    }

    public NamedEntity<T> addName(String localizedName, Locale locale) {
        Name name = getName();
        name.add(locale, localizedName);
        OWLAnnotation commentAnnotation = EntityFactory.getInstance().getDataFactory()
                .getRDFSLabel(EntityFactory.getInstance().getDataFactory().getOWLLiteral(localizedName, locale.getLanguage()));
        OWLAxiom axiom = EntityFactory.getInstance().getDataFactory().getOWLAnnotationAssertionAxiom(getOWLObject().getIRI(), commentAnnotation);
        OntologyService.getInstance().addAxiom(axiom);
        return this;
    }

    public boolean isAnonymous() {
        return name != null;
    }

}
