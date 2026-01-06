package com.example.demo.features.owner.domain.valueobject;

import com.example.demo.infrastructure.shared.validation.SingleValueObject;
import com.example.demo.infrastructure.shared.validation.Text;
import com.example.demo.infrastructure.shared.validation.TextPolicy;

public final class FirstName extends SingleValueObject<Text> {

    private static final TextPolicy POLICY = TextPolicy.of(2, 20);

    private FirstName(Text value) { super(value);}

    public static FirstName of(String raw) {
        return new FirstName(Text.of(raw, POLICY));
    }

    public String asString() { return value.value();}

}

