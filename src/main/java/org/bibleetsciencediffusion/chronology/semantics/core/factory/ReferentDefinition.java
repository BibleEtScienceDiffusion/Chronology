package org.bibleetsciencediffusion.chronology.semantics.core.factory;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Referent;

import java.util.Locale;

public interface ReferentDefinition extends DomainDefinition {


    Referent CANAAN = Referent.createReferent("Canaan")
            .addName("Canaan", Locale.ENGLISH)
            .addName("Canaan", Locale.FRENCH)
            .isA(COUNTRY);

    Referent ISRAEL = Referent.createReferent("Israel")
            .addName("Israel", Locale.ENGLISH)
            .addName("Israël", Locale.FRENCH)
            .isA(COUNTRY);

    //TODO : modelize location of reign of pharaoh is in Egypt (Referent)
    Referent EGYPT = Referent.createReferent("Egypt")
            .addName("Egypt", Locale.ENGLISH)
            .addName("Egypte", Locale.FRENCH)
            .isA(COUNTRY);

    Referent ABRAHAM = Referent.createReferent("Abraham")
            .addName("Abram", Locale.ENGLISH)
            .addName("Abram", Locale.FRENCH)
            .isA(HUMAN);
            /*
            .addProcess(
                    new Process(Process.LIFE)
                            .setBegin(new Event().setDate(new Date().setYear(1948)))
                            .setEnd(new Event().setDate(new Date().setYear(2123)))
                            .addProcess(new Process((DomainDefinition.COVENANT))
                                    .setBegin(new Event().setDate(new Date().setYear(2018)))
                                    .addRole(Role.LOCATION, CANAAN)
                            ));*/


}
