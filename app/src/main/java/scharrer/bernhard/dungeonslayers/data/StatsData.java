package scharrer.bernhard.dungeonslayers.data;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 28.03.2018.
 */

public class StatsData {

    private int koerper;
    private int agilitaet;
    private int geist;

    private int staerke;
    private int bewegung;
    private int verstand;
    private int haerte;
    private int geschick;
    private int aura;

    private int current_health;

    public StatsData(int koerper, int agilitaet, int geist, int staerke, int bewegung, int verstand, int haerte, int geschick, int aura) {
        this.koerper = koerper;
        this.agilitaet = agilitaet;
        this.geist = geist;
        this.staerke = staerke;
        this.bewegung = bewegung;
        this.verstand = verstand;
        this.haerte = haerte;
        this.geschick = geschick;
        this.aura = aura;
    }

    public int getKoerper() {
        return koerper;
    }

    public int getAgilitaet() {
        return agilitaet;
    }

    public int getGeist() {
        return geist;
    }

    public int getStaerke() {
        return staerke;
    }

    public int getBewegung() {
        return bewegung;
    }

    public int getVerstand() {
        return verstand;
    }

    public int getHaerte() {
        return haerte;
    }

    public int getGeschick() {
        return geschick;
    }

    public int getAura() {
        return aura;
    }

    public int getAktuelleLebenskraft() {
        return current_health;
    }

    public int getLebenkraft() {
        return koerper+haerte+10;
    }

    public int getAbwehr(ArmorData armor) {
        return koerper+haerte+armor.getPanzerung();
    }

    public int getInitiative() {
        return agilitaet+bewegung;
    }

    public float getLaufen() {
        return (agilitaet/2.0f)+1;
    }

    public int getSchlagen() {
        return koerper+staerke;
    }

    public int getSchiessen() {
        return agilitaet+geschick;
    }

    public int getZaubern(ArmorData armor) {
        return geist+aura-armor.getPanzerung();
    }

    public int getZielzauber(ArmorData armor) {
        return geist+geschick-armor.getPanzerung();
    }

}
