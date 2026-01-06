package com.example.demo.features.owner.application.query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OwnerQueryRepository {

    Optional<OwnerView> findById(UUID id);

    List<OwnerView> findByLastNameStartingWith(String lastName);

}

