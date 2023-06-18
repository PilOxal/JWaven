package com.oxal.jwaven.common.entity.jsonobject.value;

import java.util.List;

public class DetailValueWaven {
    private String type;
    private boolean equipableByPlayers;
    private Integer element;
    private Long specificToWeapon;
    private List<Integer> families;
    private Integer heroSkillPointsCost;
    private boolean bannedInPvp;

    public DetailValueWaven() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEquipableByPlayers() {
        return equipableByPlayers;
    }

    public void setEquipableByPlayers(boolean equipableByPlayers) {
        this.equipableByPlayers = equipableByPlayers;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public Long getSpecificToWeapon() {
        return specificToWeapon;
    }

    public void setSpecificToWeapon(Long specificToWeapon) {
        this.specificToWeapon = specificToWeapon;
    }

    public List<Integer> getFamilies() {
        return families;
    }

    public void setFamilies(List<Integer> families) {
        this.families = families;
    }

    public Integer getHeroSkillPointsCost() {
        return heroSkillPointsCost;
    }

    public void setHeroSkillPointsCost(Integer heroSkillPointsCost) {
        this.heroSkillPointsCost = heroSkillPointsCost;
    }

    public boolean isBannedInPvp() {
        return bannedInPvp;
    }

    public void setBannedInPvp(boolean bannedInPvp) {
        this.bannedInPvp = bannedInPvp;
    }
}
