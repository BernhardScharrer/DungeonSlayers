package scharrer.bernhard.dungeonslayers.data;

import java.util.List;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 28.03.2018.
 */

public class ArmorData {

    private List<Armor> armorList;
    private List<Armor> current;

    public ArmorData(List<Armor> armorList) {
        this.armorList = armorList;
        this.current = current;
    }

    public List<Armor> getArmorList() {
        return armorList;
    }

    public List<Armor> getCurrent() {
        return current;
    }

    public int getPanzerung() {
        int pa = 0;
        for (Armor armor : current) {
            pa += armor.getPanzerung();
        }
        return pa;
    }

}
