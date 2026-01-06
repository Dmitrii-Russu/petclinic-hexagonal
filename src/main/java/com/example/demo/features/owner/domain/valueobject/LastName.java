package com.example.demo.features.owner.domain.valueobject;

import com.example.demo.infrastructure.shared.validation.SingleValueObject;
import com.example.demo.infrastructure.shared.validation.Text;
import com.example.demo.infrastructure.shared.validation.TextPolicy;

public final class LastName extends SingleValueObject<Text> {

    private static final TextPolicy POLICY = TextPolicy.of(1, 50);

    private LastName(Text value) { super(value);}

    public static LastName of(String raw) {
        return new LastName(Text.of(raw, POLICY));
    }

    public String asString() { return value.value();}

}

