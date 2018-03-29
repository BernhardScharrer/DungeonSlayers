package scharrer.bernhard.dungeonslayers.data;

import java.util.List;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 28.03.2018.
 */

public class InventoryData {

    private List<Item> items;

    public InventoryData(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

}
