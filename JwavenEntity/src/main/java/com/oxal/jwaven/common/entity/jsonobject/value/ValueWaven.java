package com.oxal.jwaven.common.entity.jsonobject.value;

import com.oxal.jwaven.common.entity.jsonobject.MerchantCostWaven;

import java.util.List;

public class ValueWaven {
    private String type;
    private Long id;
    private boolean premiumItem;
    private Integer rarity;
    private List<Long> unlockableSkillIds;
    private Long upgradeRuleId;
    private boolean canCrit;
    private boolean isEphemeral;
    private List<MerchantCostWaven> merchantCosts;

    private List<Integer> tags;
    private DetailValueWaven details;

    public ValueWaven() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPremiumItem() {
        return premiumItem;
    }

    public void setPremiumItem(boolean premiumItem) {
        this.premiumItem = premiumItem;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public List<Long> getUnlockableSkillIds() {
        return unlockableSkillIds;
    }

    public void setUnlockableSkillIds(List<Long> unlockableSkillIds) {
        this.unlockableSkillIds = unlockableSkillIds;
    }

    public Long getUpgradeRuleId() {
        return upgradeRuleId;
    }

    public void setUpgradeRuleId(Long upgradeRuleId) {
        this.upgradeRuleId = upgradeRuleId;
    }

    public boolean isCanCrit() {
        return canCrit;
    }

    public void setCanCrit(boolean canCrit) {
        this.canCrit = canCrit;
    }

    public boolean isEphemeral() {
        return isEphemeral;
    }

    public void setEphemeral(boolean ephemeral) {
        isEphemeral = ephemeral;
    }

    public List<MerchantCostWaven> getMerchantCosts() {
        return merchantCosts;
    }

    public void setMerchantCosts(List<MerchantCostWaven> merchantCosts) {
        this.merchantCosts = merchantCosts;
    }

    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }
}
