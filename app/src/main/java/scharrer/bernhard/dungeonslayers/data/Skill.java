package scharrer.bernhard.dungeonslayers.data;

import java.util.List;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 29.03.2018.
 */

public class Skill {

    private String name;
    private int rang;
    private List<Effect> effects;

    public Skill(String name, int rang, List<Effect> effects) {
        this.name = name;
        this.rang = rang;
        this.effects = effects;
    }

    public String getName() {
        return name;
    }

    public int getRang() {
        return rang;
    }

    public List<Effect> getEffects() {
        return effects;
    }

}
