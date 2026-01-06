package com.example.demo.features.owner.application.query;

import java.util.UUID;

public record OwnerView(
        UUID id,
        String firstName,
        String lastName,
        String city
) {}
