package com.oxal.jwaven.common.entity.jsonobject;

public class MerchantCostWaven {
    private Long amount;
    private Long resourceId;
    private String type;

    public MerchantCostWaven() {
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
