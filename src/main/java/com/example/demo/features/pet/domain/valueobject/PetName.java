package com.example.demo.features.pet.domain.valueobject;

import com.example.demo.infrastructure.shared.validation.Text;
import com.example.demo.infrastructure.shared.validation.TextPolicy;

public final class PetName {
    private static final TextPolicy POLICY = TextPolicy.of(1, 30);

    private final Text text;

    private PetName(Text text) { this.text = text;}

    public static PetName of(String raw) {
        return new PetName(Text.of(raw, POLICY));
    }

    public String value() { return text.value();}

}

