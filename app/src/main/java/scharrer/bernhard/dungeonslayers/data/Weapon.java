package scharrer.bernhard.dungeonslayers.data;

import java.util.List;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 28.03.2018.
 */

public class Weapon {

    private String name;
    private int wb;
    private boolean ranged;
    private List<Effect> effects;

    public Weapon(String name, int wb, boolean ranged, List<Effect> effects) {
        this.name = name;
        this.wb = wb;
        this.ranged = ranged;
        this.effects = effects;
    }

    public String getName() {
        return name;
    }

    public int getWb() {
        return wb;
    }

    public boolean isRanged() {
        return ranged;
    }

    public List<Effect> getEffects() {
        return effects;
    }

}
