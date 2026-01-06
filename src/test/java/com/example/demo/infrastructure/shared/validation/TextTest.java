package com.example.demo.infrastructure.shared.validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TextTest {

    @Test
    void equalsBasedOnCanonicalForm() {
        Text a = Text.of("Ivan", TextPolicy.of(2, 20));
        Text b = Text.of(" ivan ", TextPolicy.of(2, 20));

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void valuePreservesOriginalNormalizedForm() {
        Text t = Text.of("  Ivan  ", TextPolicy.of(2, 20));
        assertEquals("Ivan", t.value());
    }

    @Test
    void rejectsEmptyText() {
        assertThrows(IllegalArgumentException.class,
                () -> Text.of("   ", TextPolicy.of(2, 20)));
    }

}

