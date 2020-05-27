package org.bibleetsciencediffusion.chronology.ontology;

import java.util.ArrayList;
import java.util.List;

public class Entity extends Concept {



    private List<Process> process = new ArrayList<Process>();

    public Entity() {

    }

    public Entity(Entity model) {
        new Entity().setAscendant(model.getAscendant()).setName(model.getName());
    }


    public Entity(Language language, String localizedName) {
        super(language, localizedName);
    }

    public Entity addName(Language language, String localizedName) {
        this.name.put(language, localizedName);
        return this;
    }


    public Entity addProcess(Process process) {
        this.process.add(process);
        return this;
    }

    public Entity addProperty(Property property) {
        this.property.add(new Property(property));
        property.setTarget(this);
        return this;
    }

    public Entity setAscendant(Concept ascendant) {
        this.ascendant = ascendant;
        return this;
    }

}
