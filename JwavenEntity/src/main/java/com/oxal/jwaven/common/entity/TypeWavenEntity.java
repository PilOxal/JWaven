package com.oxal.jwaven.common.entity;

public enum TypeWavenEntity {
    ACHIEVEMENT("Achievements"),
    SKILL("Skills"),
    SPELL("Spells"),
    WEAPON("Weapons"),
    GOD("Gods"),
    SUMMONING("Summonings"),
    RESOURCE("Resources");

    String folder;

    TypeWavenEntity(String folder) {
        this.folder = folder;
    }

    public String getFolder() {
        return folder;
    }
}
