package scharrer.bernhard.dungeonslayers.data;

import java.util.List;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 28.03.2018.
 */

public class SpellData {

    private List<Spell> spells;
    private Spell current;

    public SpellData(List<Spell> spells, Spell current) {
        this.spells = spells;
        this.current = current;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public Spell getCurrent() {
        return current;
    }

}
