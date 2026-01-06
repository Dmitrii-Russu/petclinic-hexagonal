package com.example.demo.features.owner.application;

import com.example.demo.features.owner.domain.Owner;
import com.example.demo.features.owner.domain.OwnerFactory;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.features.owner.domain.repository.OwnerRepository;
import com.example.demo.features.owner.domain.OwnerId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
/*
@Service
@Transactional
public class OwnerApplicationService {

    private final OwnerRepository ownerRepository;
    private final OwnerFactory ownerFactory;

    public OwnerApplicationService(
            OwnerRepository ownerRepository,
            OwnerFactory ownerFactory
    ) {
        this.ownerRepository = ownerRepository;
        this.ownerFactory = ownerFactory;
    }

    public OwnerId createOwner(
            String firstName,
            String lastName,
            String address,
            String city,
            String telephone
    ) {
        Owner owner = ownerFactory.createNew(
                firstName, lastName, address, city, telephone
        );

        Owner saved = ownerRepository.save(owner);
        return saved.getId();
    }

    public Owner getById(OwnerId id) {
        return ownerRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Owner not found"));
    }

    public List<Owner> searchByLastName(String lastName) {
        return ownerRepository.findByLastNameStartingWith(lastName);
    }

}*/

