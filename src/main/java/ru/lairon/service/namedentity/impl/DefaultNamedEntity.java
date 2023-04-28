package ru.lairon.service.namedentity.impl;

import ru.lairon.service.namedentity.NamedEntity;

import java.util.Objects;
import java.util.UUID;

public class DefaultNamedEntity implements NamedEntity {

    private final UUID uuid;
    private final String name;

    public DefaultNamedEntity(UUID uuid, String name) {
        Objects.requireNonNull(uuid, "uuid can not be null");
        Objects.requireNonNull(name, "name can not be null");
        if(name.isBlank()) throw new IllegalArgumentException("name can not be blank");
        this.uuid = uuid;
        this.name = name;
    }

    @Override
    public UUID getUUID() {
        return uuid;
    }

    @Override
    public String getName() {
        return name;
    }
}
