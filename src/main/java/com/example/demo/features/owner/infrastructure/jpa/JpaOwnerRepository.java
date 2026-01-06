package com.example.demo.features.owner.infrastructure.jpa;

import com.example.demo.features.owner.domain.Owner;
import com.example.demo.features.owner.domain.repository.OwnerRepository;
import com.example.demo.features.owner.domain.OwnerId;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
/*
@Repository
public class JpaOwnerRepository implements OwnerRepository {

    private final OwnerJpaRepository jpaRepository;
    private final OwnerMapper mapper;

    JpaOwnerRepository(
            OwnerJpaRepository jpaRepository,
            OwnerMapper mapper
    ) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Owner save(Owner owner) {
        OwnerJpaEntity saved = jpaRepository.save(mapper.toJpa(owner));
        return mapper.toDomain(saved);
    }

    @Override
    public Optional<Owner> findById(OwnerId id) {
        return jpaRepository.findById(id.value()).map(mapper::toDomain);
    }

    @Override
    public List<Owner> findByLastNameStartingWith(String lastName) {
        return jpaRepository.findByLastNameStartingWith(lastName)
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public List<Owner> findAll() {
        return jpaRepository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public void deleteById(OwnerId id) {
        jpaRepository.deleteById(id.value());
    }

}*/

