package com.example.demo.features.owner.domain.valueobject;

import com.example.demo.infrastructure.shared.validation.SingleValueObject;
import com.example.demo.infrastructure.shared.validation.Text;
import com.example.demo.infrastructure.shared.validation.TextPolicy;

public final class Address extends SingleValueObject<Text> {

    private static final TextPolicy POLICY = TextPolicy.of(2, 20);

    private Address(Text value) { super(value);}

    public static Address of(String raw) {return new Address(Text.of(raw, POLICY));}

    public String asString() { return value.value();}

}


