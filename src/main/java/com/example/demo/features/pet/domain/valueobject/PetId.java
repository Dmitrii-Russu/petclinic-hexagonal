package com.example.demo.features.pet.domain.valueobject;

import java.util.Objects;
import java.util.UUID;

public record PetId(UUID value) {

    public PetId { Objects.requireNonNull(value, "OwnerId is required");}

    public static PetId newId() { return new PetId(UUID.randomUUID());}
}
