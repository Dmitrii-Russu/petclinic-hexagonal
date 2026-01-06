package com.example.demo.features.owner.domain;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OwnerIdTest {

    @Test
    void shouldRejectNullUuid() {

        assertThrows(NullPointerException.class, () -> OwnerId.of(null));
    }

    @Test
    void sameUuidMeansSameOwnerId() {

        UUID uuid = UUID.randomUUID();

        OwnerId a = OwnerId.of(uuid);
        OwnerId b = OwnerId.of(uuid);

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }


}
