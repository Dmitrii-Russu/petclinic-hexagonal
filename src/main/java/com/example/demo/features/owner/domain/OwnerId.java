package com.example.demo.features.owner.domain;

import java.util.Objects;
import java.util.UUID;

public record OwnerId(UUID value) {

    public OwnerId { Objects.requireNonNull(value, "OwnerId is required");}

    public static OwnerId newId() { return new OwnerId(UUID.randomUUID());}

    public static OwnerId of(UUID value) { return new OwnerId(value);}

}

