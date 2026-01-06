package com.example.demo.features.owner.domain;

import com.example.demo.features.owner.domain.valueobject.*;

public final class Owner {
    private final OwnerId id;
    private final FirstName firstName;
    private final LastName lastName;
    private final Address address;
    private final City city;
    private final Telephone telephone;

    private Owner(
            OwnerId id,
            FirstName firstName,
            LastName lastName,
            Address address,
            City city,
            Telephone telephone
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }

    /* package */ static Owner internalCreate(
            OwnerId id,
            FirstName firstName,
            LastName lastName,
            Address address,
            City city,
            Telephone telephone
    ) {
        return new Owner(id, firstName, lastName, address, city, telephone);
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
        if (!(o instanceof Owner other)) return false;
        return id.equals(other.getId());
    }

    @Override
    public int hashCode() { return id.hashCode();}

}