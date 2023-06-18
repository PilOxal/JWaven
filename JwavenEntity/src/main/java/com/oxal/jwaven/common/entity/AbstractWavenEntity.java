package com.oxal.jwaven.common.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oxal.jwaven.common.entity.jsonobject.TranslateField;
import com.oxal.jwaven.common.entity.jsonobject.value.ValueWaven;

public abstract class AbstractWavenEntity {
    private Long id;
    private TypeWavenEntity typeWavenEntity;
    private Integer availability;
    private String displayName;
    private TranslateField name;
    private TranslateField description;
    private ValueWaven values;

    public AbstractWavenEntity(TypeWavenEntity type) {
        this.typeWavenEntity = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeWavenEntity getTypeWavenEntity() {
        return typeWavenEntity;
    }

    public void setTypeWavenEntity(TypeWavenEntity typeWavenEntity) {
        this.typeWavenEntity = typeWavenEntity;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TranslateField getName() {
        return name;
    }

    public void setName(TranslateField name) {
        this.name = name;
    }

    public TranslateField getDescription() {
        return description;
    }

    public void setDescription(TranslateField description) {
        this.description = description;
    }

    public ValueWaven getValues() {
        return values;
    }

    public void setValues(ValueWaven values) {
        this.values = values;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper()
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
