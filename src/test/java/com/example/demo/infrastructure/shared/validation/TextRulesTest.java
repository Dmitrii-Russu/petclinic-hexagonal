package com.example.demo.infrastructure.shared.validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TextRulesTest {

    @Test
    void normalize_trimsAndCollapsesSpaces() {
        assertEquals("John Doe", TextRules.normalize("  John   Doe "));
    }

    @Test
    void validateLength_throwsWhenTooShort() {
        assertThrows(IllegalArgumentException.class,
                () -> TextRules.validateLength("A", 2, 10));
    }

    @Test
    void validateCharacters_rejectsInvalidSymbols() {
        assertThrows(IllegalArgumentException.class,
                () -> TextRules.validateCharacters("Jo@n"));
    }

    @Test
    void canonical_isLowercaseAndTrimmed() {
        assertEquals("ivan", TextRules.canonical(" Ivan "));
    }

}

