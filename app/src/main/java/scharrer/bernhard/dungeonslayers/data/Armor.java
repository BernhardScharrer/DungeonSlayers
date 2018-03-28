package scharrer.bernhard.dungeonslayers.data;

import java.util.List;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 28.03.2018.
 */

public class Armor {

    private String name;
    private int pa;
    private List<Effect> effects;

    public Armor(String name, int pa, List<Effect> effects) {
        this.name = name;
        this.pa = pa;
        this.effects = effects;
    }

    public String getName() {
        return name;
    }

    public int getPanzerung() {
        return pa;
    }

    public List<Effect> getEffects() {
        return effects;
    }

}
