package com.example.demo.features.pet.domain;

import com.example.demo.features.owner.domain.OwnerId;
import com.example.demo.features.pet.domain.valueobject.PetId;

import java.time.LocalDate;
import java.util.Objects;

public final class Pet {

    private final PetId petId;
    private final OwnerId ownerId;
    private final String name;
    private PetType type;
    private LocalDate birthDate;

    private Pet(PetId petId, String name, OwnerId ownerId) {
        this.petId = petId;
        this.name = validateName(name);
        this.ownerId = ownerId;
    }

    public static Pet named(String name, OwnerId ownerId) {
        return new Pet(PetId.newId(), name, ownerId);
    }

    private static void validate(boolean condition, String message) {
        if (!condition) throw new IllegalArgumentException(message);
    }

    private static String validateName(String name) {
        String trimmed = Objects.requireNonNull(name, "Name required").trim();
        validate(!trimmed.isEmpty(), "Name cannot be empty");
        validate(trimmed.length() >= 2 && trimmed.length() <= 20, "Name must be 2-20 chars");
        validate(trimmed.matches("^[\\p{L}\\s\\-'.,]+$"), "Invalid characters in name");
        return trimmed;
    }

    @Override
    public String toString() {
        return "Pet id:" + petId + ", pet name:" + name + ", ownerId: " + ownerId + ".";
    }

}
