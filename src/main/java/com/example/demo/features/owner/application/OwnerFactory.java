package com.example.demo.features.owner.application;
/*
import com.example.demo.features.owner.domain.Owner;
import com.example.demo.features.owner.domain.OwnerId;
import com.example.demo.features.owner.domain.valueobject.*;

public final class OwnerFactory {

    public Draft named(String firstName) {
        return new Builder(FirstName.of(firstName));
    }

    public interface Draft {
        Draft withLastName(String lastName);
        Draft livingAt(String address);
        Draft inCity(String city);
        Owner withTelephone(String telephone);
    }

    private static final class Builder implements Draft {

        private final OwnerId id = OwnerId.newId();
        private final FirstName firstName;
        private LastName lastName;
        private Address address;
        private City city;

        private Builder(FirstName firstName) {
            this.firstName = firstName;
        }

        @Override
        public Draft withLastName(String lastName) {
            this.lastName = LastName.of(lastName);
            return this;
        }

        @Override
        public Draft livingAt(String address) {
            this.address = Address.of(address);
            return this;
        }

        @Override
        public Draft inCity(String city) {
            this.city = City.of(city);
            return this;
        }

        @Override
        public Owner withTelephone(String telephone) {
            return Owner.create(
                    id,
                    firstName,
                    lastName,
                    address,
                    city,
                    Telephone.of(telephone)
            );
        }
    }
}

*/