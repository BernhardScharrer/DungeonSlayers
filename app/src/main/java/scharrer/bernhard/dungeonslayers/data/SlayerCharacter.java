package scharrer.bernhard.dungeonslayers.data;

/**
 * Project FFOrganizer
 * Created by Bernhard Scharrer on 28.03.2018.
 */

public class SlayerCharacter {

    private ClassData classData;
    private StatsData statsData;
    private WeaponsData weaponsData;
    private ArmorData armorData;
    private SpellData spellData;
    private MoneyData moneyData;
    private InventoryData inventoryData;
    private SkillsData skillsData;

    public SlayerCharacter(ClassData classData, StatsData statsData, WeaponsData weaponsData, ArmorData armorData, SpellData spellData, MoneyData moneyData, InventoryData inventoryData, SkillsData skillsData) {
        this.classData = classData;
        this.statsData = statsData;
        this.weaponsData = weaponsData;
        this.armorData = armorData;
        this.spellData = spellData;
        this.moneyData = moneyData;
        this.inventoryData = inventoryData;
        this.skillsData = skillsData;
    }

    public ClassData getClassData() {
        return classData;
    }

    public StatsData getStatsData() {
        return statsData;
    }

    public WeaponsData getWeaponsData() {
        return weaponsData;
    }

    public ArmorData getArmorData() {
        return armorData;
    }

    public SpellData getSpellData() {
        return spellData;
    }

    public MoneyData getMoneyData() {
        return moneyData;
    }

    public InventoryData getInventoryData() {
        return inventoryData;
    }

    public SkillsData getSkillsData() {
        return skillsData;
    }
}
