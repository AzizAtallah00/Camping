package com.example.demo.repository;

import com.example.demo.enums.DestinationType;
import com.example.demo.models.Destination;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DestinationRepository extends MongoRepository<Destination, String> {
    Page<Destination> findByDestinationType(DestinationType destinationType, Pageable pageable);

}
