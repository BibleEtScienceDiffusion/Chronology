package org.bibleetsciencediffusion.chronology.semantics.core.service;

import org.bibleetsciencediffusion.chronology.semantics.core.entity.Concept;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import org.springframework.stereotype.Service;

/**
 * reasonner (chronology.semantic.core)
 */

//@Service
public class ConceptOperationService {
    private static ConceptOperationService instance = new ConceptOperationService();

    private ConceptOperationService() {
    }

    public static ConceptOperationService getInstance() {
        return instance;
    }

    public boolean isSubTypeOf(Concept concept1, Concept concept2) {
        /*
        if (concept1.getKindOf()==null) {
            return false;
        }
        if (concept1.getKindOf().getLang()!= null &&
                concept1.getKindOf().getLang().getName().equalsIgnoreCase(concept2.getLang().getName())
                && concept1.getKindOf().getName()!= null &&
                concept1.getKindOf().getName().equalsIgnoreCase(concept2.getName())) {
            return true;
        }

        return isSubTypeOf(concept1.getKindOf(),concept2);

         */
        return false;
    }


    public Concept unify(Concept concept1, Concept concept2, Map<String, Object> variables) {
        if (concept1 == null) {
            return concept2;
        }
        if (concept2 == null) {
            return concept1;
        }
        /*
        if (concept1.getLang()!= null &&
                concept1.getLang().getName().equalsIgnoreCase(concept2.getLang().getName())
                && concept1.getName()!= null &&
                concept1.getName().equalsIgnoreCase(concept2.getName())) {
            concept1.kindOf(unify(concept1.getKindOf(),concept2.getKindOf(), variables));
            return concept1;
        }

         */
        return null;
    }

    public List<Concept> unify(List<Concept> conceptList1, List<Concept> conceptList2, Map<String, Object> variables) {
        if (conceptList1 == null) {
            return conceptList2;
        }
        if (conceptList2 == null) {
            return conceptList1;
        }
        List<Concept> result = new ArrayList<>();
        for (Concept concept1 : conceptList1) {
            for (Concept concept2 : conceptList2) {
                Concept concept = unify(concept1, concept2, variables);
                if (concept != null) {
                    result.add(concept);
                }
            }
        }
        return result;
    }

    public Concept expand(Concept concept) {
        //TODO
        return null;
    }
}
