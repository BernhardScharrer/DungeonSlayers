package scharrer.bernhard.dungeonslayers.data;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 28.03.2018.
 */

public class MoneyData {

    private int gold;
    private int silber;
    private int kupfer;

    public MoneyData(int gold, int silber, int kupfer) {
        this.gold = gold;
        this.silber = silber;
        this.kupfer = kupfer;
    }

    public int getGold() {
        return gold;
    }

    public int getSilber() {
        return silber;
    }

    public int getKupfer() {
        return kupfer;
    }

}
