package com.example.demo.features.owner.domain.valueobject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FirstNameTest {

    @Test
    void equalObjectsWithSameCanonicalValue() {

        FirstName a = FirstName.of("Ivan");
        FirstName b = FirstName.of("ivan");

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void differentValuesAreNotEqual() {

        FirstName a = FirstName.of("Ivan");
        FirstName b = FirstName.of("Petr");

        assertNotEquals(a, b);
    }

    @Test
    void differentValueObjectTypesAreNotEqual() {

        FirstName firstName = FirstName.of("Ivan");
        LastName lastName = LastName.of("Ivan");

        assertNotEquals(firstName, lastName);
    }

}
