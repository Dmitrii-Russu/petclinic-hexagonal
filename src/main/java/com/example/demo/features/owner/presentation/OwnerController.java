package com.example.demo.features.owner.presentation;

import com.example.demo.features.owner.application.query.OwnerQueryRepository;
import com.example.demo.features.owner.application.query.OwnerView;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerQueryRepository query;

    public OwnerController(OwnerQueryRepository query) {
        this.query = query;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OwnerView> get(@PathVariable UUID id) {
        return query.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}

