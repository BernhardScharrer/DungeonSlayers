package scharrer.bernhard.dungeonslayers.data;

import java.util.List;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 28.03.2018.
 */

public class WeaponsData {

    private List<Weapon> weapons;
    private Weapon current;
    private Weapon secondary;
    private boolean two_handed;

    public WeaponsData(List<Weapon> weapons) {
        this.weapons = weapons;
        this.current = null;
        this.secondary = null;
        this.two_handed = false;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public Weapon getCurrent() {
        return current;
    }

    public Weapon getSecondary() {
        return secondary;
    }

    public boolean isTwoHanded() {
        return two_handed;
    }

}
