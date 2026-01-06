package com.example.demo.features.owner.domain;

import com.example.demo.features.owner.domain.valueobject.*;


public final class OwnerFactory {

    public Owner createNew(
            String firstName,
            String lastName,
            String address,
            String city,
            String telephone
    ) {
        return Owner.internalCreate(
                OwnerId.newId(),
                FirstName.of(firstName),
                LastName.of(lastName),
                Address.of(address),
                City.of(city),
                Telephone.of(telephone)
        );
    }

    public Owner restore(
            OwnerId id,
            FirstName firstName,
            LastName lastName,
            Address address,
            City city,
            Telephone telephone
    ) {
        return Owner.internalCreate(
                id,
                firstName,
                lastName,
                address,
                city,
                telephone
        );
    }
}


