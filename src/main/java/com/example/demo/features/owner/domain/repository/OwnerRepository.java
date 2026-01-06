package com.example.demo.features.owner.domain.repository;

import java.util.List;
import java.util.Optional;
import com.example.demo.features.owner.domain.Owner;
import com.example.demo.features.owner.domain.OwnerId;

public interface OwnerRepository {

    Owner save(Owner owner);

    Optional<Owner> findById(OwnerId id);

    void deleteById(OwnerId id);

}


