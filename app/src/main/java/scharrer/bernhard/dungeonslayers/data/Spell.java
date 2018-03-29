package scharrer.bernhard.dungeonslayers.data;

import java.util.List;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 29.03.2018.
 */

public class Spell {

    private String name;
    private int zb;
    private boolean ranged;
    private int distance;
    private int abklingZeit;
    private List<Effect> effects;

    public Spell(String name, int zb, boolean ranged, int distance, int abklingZeit, List<Effect> effects) {
        this.name = name;
        this.zb = zb;
        this.ranged = ranged;
        this.distance = distance;
        this.abklingZeit = abklingZeit;
        this.effects = effects;
    }

    public String getName() {
        return name;
    }

    public int getZb() {
        return zb;
    }

    public boolean isRanged() {
        return ranged;
    }

    public int getDistance() {
        return distance;
    }

    public int getAbklingZeit() {
        return abklingZeit;
    }

    public List<Effect> getEffects() {
        return effects;
    }

}
