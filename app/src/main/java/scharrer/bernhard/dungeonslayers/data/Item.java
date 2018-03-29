package scharrer.bernhard.dungeonslayers.data;

import java.util.List;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 29.03.2018.
 */

public class Item {

    private String name;
    private InventoryType inventoryType;
    private List<Effect> effects;

    public Item(String name, InventoryType inventoryType, List<Effect> effects) {
        this.name = name;
        this.inventoryType = inventoryType;
        this.effects = effects;
    }

    public String getName() {
        return name;
    }

    public InventoryType getInventoryType() {
        return inventoryType;
    }

    public List<Effect> getEffects() {
        return effects;
    }

}
