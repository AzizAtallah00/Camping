package com.example.demo.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.enums.DestinationType;
import com.example.demo.models.Destination;
import com.example.demo.repository.DestinationRepository;
import com.example.demo.service.DestinationService;

@Service
public class DestinationServiceImpl implements DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;


    @Override
    public Page<Destination> getAllDestinations(Pageable pageable) {
        return destinationRepository.findAll(pageable);
    }

    @Override
    public Page<Destination>  getDestinationByDestinationType(DestinationType destinationType, Pageable pageable) {
        return destinationRepository.findByDestinationType(destinationType, pageable);
    }

    @Override
    public Destination addDestination(Destination destination) {
        return destinationRepository.save(destination);
    }

    @Override
    public void delete(String id) {
        destinationRepository.deleteById(id); 
    }
    
}
