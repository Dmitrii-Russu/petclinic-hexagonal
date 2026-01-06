package com.example.demo.features.owner.infrastructure.jpa;

import com.example.demo.features.owner.application.query.OwnerQueryRepository;
import com.example.demo.features.owner.application.query.OwnerView;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class JpaOwnerQueryRepository implements OwnerQueryRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Optional<OwnerView> findById(UUID id) {
        return em.createQuery(
                        """
                        select new com.example.demo.features.owner.application.query.OwnerView(
                            o.id, o.firstName, o.lastName, o.city
                        )
                        from OwnerJpaEntity o
                        where o.id = :id
                        """,
                        OwnerView.class
                )
                .setParameter("id", id)
                .getResultStream()
                .findFirst();
    }

    @Override
    public List<OwnerView> findByLastNameStartingWith(String lastName) {
        return em.createQuery(
                        """
                        select new com.example.demo.features.owner.application.query.OwnerView(
                            o.id, o.firstName, o.lastName, o.city
                        )
                        from OwnerJpaEntity o
                        where o.lastName like :lastName
                        """,
                        OwnerView.class
                )
                .setParameter("lastName", lastName + "%")
                .getResultList();
    }

}

