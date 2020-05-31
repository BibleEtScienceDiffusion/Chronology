package org.bibleetsciencediffusion.chronology.semantics.core.factory;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept;
import org.bibleetsciencediffusion.chronology.semantics.core.entity.Referent;
import org.bibleetsciencediffusion.chronology.semantics.core.repository.ReferentRepository;

public class ReferentFactory {

    private static ReferentFactory instance = new ReferentFactory();

    public static ReferentFactory getInstance() {
        return instance;
    }

    private ReferentFactory() {
    }

    public Referent newReferent(Concept prototype, Referent space) {
        Referent referent = new Referent(prototype, space);
        store(referent);
        return referent;
    }

    public Referent newReferent(Concept prototype) {
        Referent referent = new Referent(prototype, null);
        store(referent);
        return referent;
    }

    private void store(Referent referent) {
        // new ID
        referent.setId(IdFactory.getInstance().generate());
        // store in repository
        ReferentRepository.getInstance().add(referent);
    }
}
