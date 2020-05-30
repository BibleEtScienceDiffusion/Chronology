package org.bibleetsciencediffusion.chronology.semantics.core.factory;

import java.util.UUID;

public class IdFactory {
    private static IdFactory instance = new IdFactory();

    private IdFactory() {
    }

    public static IdFactory getInstance() {
        return instance;
    }

    public String generate() {
        return Long.valueOf(UUID.randomUUID().getLeastSignificantBits()).toString();
    }
}