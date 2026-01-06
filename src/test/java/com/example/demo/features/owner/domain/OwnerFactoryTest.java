package com.example.demo.features.owner.domain;

import com.example.demo.features.owner.domain.valueobject.*;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


class OwnerFactoryTest {

    private final OwnerFactory factory = new OwnerFactory();

    @Test
    void createNew_creates_owner_with_new_id_and_valid_state() {
        Owner owner = factory.createNew(
                "John",
                "Doe",
                "Main street",
                "NY",
                "123456"
        );

        assertNotNull(owner.getId());

        assertEquals(FirstName.of("John"), owner.getFirstName());
        assertEquals(LastName.of("Doe"), owner.getLastName());
        assertEquals(Address.of("Main street"), owner.getAddress());
        assertEquals(City.of("NY"), owner.getCity());
        assertEquals(Telephone.of("123456"), owner.getTelephone());
    }

    @Test
    void restore_creates_owner_with_existing_id() {
        OwnerId id = OwnerId.of(
                UUID.fromString("11111111-1111-1111-1111-111111111111")
        );

        Owner owner = factory.restore(
                id,
                FirstName.of("John"),
                LastName.of("Doe"),
                Address.of("Main street"),
                City.of("NY"),
                Telephone.of("123456")
        );

        assertEquals(id, owner.getId());
        assertEquals(FirstName.of("John"), owner.getFirstName());
        assertEquals(LastName.of("Doe"), owner.getLastName());
    }

}
