package org.bibleetsciencediffusion.chronology.semantics.core.repository;

/**
 * Entities that evolve in time
 */

public class ReferentRepository {

    protected static ReferentRepository instance = new ReferentRepository();

    public static ReferentRepository getInstance() {
        return instance;
    }


}
