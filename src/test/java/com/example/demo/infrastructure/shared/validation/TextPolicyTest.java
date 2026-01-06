package com.example.demo.infrastructure.shared.validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextPolicyTest {

    @Test
    void of_createsLettersOnlyNonEmptyPolicy() {
        TextPolicy p = TextPolicy.of(2, 20);

        assertTrue(p.notEmpty());
        assertTrue(p.lettersOnly());
        assertEquals(2, p.min());
        assertEquals(20, p.max());
    }

}
