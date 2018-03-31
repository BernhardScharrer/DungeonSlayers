package scharrer.bernhard.dungeonslayers.data;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 28.03.2018.
 */

public class ClassData {

    private String name;
    private String nickname;

    private RaceType race;

    private ClassType type;
    private HeroClassType hero_type;

    private int lp;
    private int tp;
    private int ep;

    public ClassData(String name, String nickname, RaceType race, ClassType type, HeroClassType hero_type, int lp, int tp, int ep) {
        this.name = name;
        this.nickname = nickname;
        this.race = race;
        this.type = type;
        this.hero_type = hero_type;
        this.lp = lp;
        this.tp = tp;
        this.ep = ep;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public RaceType getRace() {
        return race;
    }

    public ClassType getType() {
        return type;
    }

    public HeroClassType getHero_type() {
        return hero_type;
    }

    public int getLevel() {
        return level;
    }

    public int getLp() {
        return lp;
    }

    public int getTp() {
        return tp;
    }

    public int getEp() {
        return ep;
    }

}
