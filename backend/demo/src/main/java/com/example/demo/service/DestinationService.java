package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.dto.DestinationDTO;
import com.example.demo.enums.DestinationType;
import com.example.demo.models.Destination;

public interface DestinationService {
    public Page<Destination> getAllDestinations (Pageable pageable);
    public Page<Destination> getDestinationByDestinationType (DestinationType destinationType, Pageable pageable);
    public Destination addDestination(DestinationDTO destinationDto);
    public void delete (String id);
    
}