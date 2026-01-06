package com.example.demo.features.owner.infrastructure.jpa;

import com.example.demo.features.owner.domain.Owner;
import com.example.demo.features.owner.domain.OwnerFactory;
import com.example.demo.features.owner.domain.OwnerId;
import com.example.demo.features.owner.domain.valueobject.*;
import org.springframework.stereotype.Component;
/*
@Component
class OwnerMapper {

    private final OwnerFactory factory;

    OwnerMapper(OwnerFactory factory) { this.factory = factory;}

    OwnerJpaEntity toJpa(Owner owner) {
        OwnerJpaEntity e = new OwnerJpaEntity();
        e.setId(owner.getId().value());
        e.setFirstName(owner.getFirstName().asString());
        e.setLastName(owner.getLastName().asString());
        e.setAddress(owner.getAddress().asString());
        e.setCity(owner.getCity().asString());
        e.setTelephone(owner.getTelephone().asString());
        return e;
    }

    Owner toDomain(OwnerJpaEntity e) {
        return factory.restore(
                OwnerId.of(e.getId()),
                FirstName.of(e.getFirstName()),
                LastName.of(e.getLastName()),
                Address.of(e.getAddress()),
                City.of(e.getCity()),
                Telephone.of(e.getTelephone())
        );
    }

}

*/