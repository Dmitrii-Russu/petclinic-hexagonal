package com.example.demo.features.owner.domain;
/*
import com.example.demo.features.owner.domain.valueobject.*;
import com.example.demo.owner.domain.valueobject.*;
import com.example.demo.features.owner.domain.OwnerId;

import java.util.Objects;

public final class Owner$ {
    private final OwnerId id;
    private final FirstName firstName;
    private final LastName lastName;
    private final Address address;
    private final City city;
    private final Telephone telephone;

    private Owner$(
            OwnerId id,
            FirstName firstName,
            LastName lastName,
            Address address,
            City city,
            Telephone telephone
    ) {
        this.id = id;
        this.firstName = Objects.requireNonNull(firstName);
        this.lastName = Objects.requireNonNull(lastName);
        this.address = Objects.requireNonNull(address);
        this.city = Objects.requireNonNull(city);
        this.telephone = Objects.requireNonNull(telephone);
    }

    // Старт fluent interface
    public static OwnerDraft named(String firstName) {
        return new Builder(FirstName.of(firstName));
    }

    public interface OwnerDraft {
        OwnerDraft withLastName(String lastName);
        OwnerDraft livingAt(String address);
        OwnerDraft inCity(String city);
        Owner$ withTelephone(String telephone);
    }


    public static final class Builder implements OwnerDraft {

        private final OwnerId id;
        private final FirstName firstName;
        private LastName lastName;
        private Address address;
        private City city;

        private Builder(FirstName firstName) {
            this.id = OwnerId.newId();
            this.firstName = firstName;
        }

        @Override
        public OwnerDraft withLastName(String lastName) {
            this.lastName = LastName.of(lastName);
            return this;
        }

        @Override
        public OwnerDraft livingAt(String address) {
            this.address = Address.of(address);
            return this;
        }

        @Override
        public OwnerDraft inCity(String city) {
            this.city = City.of(city);
            return this;
        }

        @Override
        public Owner$ withTelephone(String telephone) {
            Objects.requireNonNull(telephone, "telephone must not be null");
            if (lastName == null) {
                throw new IllegalStateException("Last name is required");
            }
            if (address == null) {
                throw new IllegalStateException("Address is required");
            }
            if (city == null) {
                throw new IllegalStateException("City is required");
            }
            return new Owner$(
                    id,
                    firstName,
                    lastName,
                    address,
                    city,
                    Telephone.of(telephone)
            );
        }
    }

    public OwnerId getId() { return id;}
    public FirstName getFirstName() { return firstName;}
    public LastName getLastName() { return lastName;}
    public Address getAddress() { return address;}
    public City getCity() { return city;}
    public Telephone getTelephone() { return telephone;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Owner$ other)) return false;
        return id.equals(other.id);
    }

    @Override
    public int hashCode() { return id.hashCode();}

}*/