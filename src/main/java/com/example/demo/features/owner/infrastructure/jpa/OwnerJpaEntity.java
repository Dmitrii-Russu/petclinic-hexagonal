package com.example.demo.features.owner.infrastructure.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "owners")
class OwnerJpaEntity {

    @Id private UUID id;

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String telephone;

    protected OwnerJpaEntity() {}

    public UUID getId() { return id;}
    public void setId(UUID id) { this.id = id;}

    public String getFirstName() { return firstName;}
    public void setFirstName(String firstName) { this.firstName = firstName;}

    public String getLastName() { return lastName;}
    public void setLastName(String lastName) { this.lastName = lastName;}

    public String getAddress() { return address;}
    public void setAddress(String address) { this.address = address;}

    public String getCity() { return city;}
    public void setCity(String city) { this.city = city;}

    public String getTelephone() { return telephone;}
    public void setTelephone(String telephone) { this.telephone = telephone;}

}

