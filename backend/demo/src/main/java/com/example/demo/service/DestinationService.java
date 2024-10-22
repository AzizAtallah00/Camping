package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.enums.DestinationType;
import com.example.demo.models.Destination;

public interface DestinationService {
    public Page<Destination> getAllDestinations (Pageable pageable);
    public Page<Destination> getDestinationByDestinationType (DestinationType destinationType, Pageable pageable);
    public Destination addDestination(Destination customer);
    public void delete (String id);
    
}