package org.bibleetsciencediffusion.chronology.ontology;

import java.util.ArrayList;
import java.util.List;

public class Entity extends Concept {

    private List<Process> process = new ArrayList<Process>();

    public Entity() {

    }

    public Entity(Entity model) {
        super(model);
        this.process = model.process;
    }


    public Entity(Concept language, String localizedName) {
        super(language, localizedName);
    }

    public Entity addName(Concept language, String localizedName) {
        addName(language, localizedName);
        return this;
    }


    public Entity addProcess(Process process) {
        addProcess(process);
        process.setSubject(new Entity(this));
        return this;
    }

    public Entity addProperty(Property property, Object value) {
        addProperty(property,value);
        property.setSubject(new Entity(this));
        return this;
    }

    public Entity setAscendant(Concept ascendant) {
        this.ascendant = ascendant;
        return this;
    }

}
