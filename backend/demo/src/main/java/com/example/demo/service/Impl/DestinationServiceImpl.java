package com.example.demo.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DestinationDTO;
import com.example.demo.enums.DestinationType;
import com.example.demo.mapper.DestinationMapper;
import com.example.demo.models.Destination;
import com.example.demo.repository.DestinationRepository;
import com.example.demo.service.DestinationService;

@Service
public class DestinationServiceImpl implements DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;
    // @Autowired
    // private EquipementRepository equipementRepository;


    @Override
    public Page<Destination> getAllDestinations(Pageable pageable) {
        return destinationRepository.findAll(pageable);
    }

    @Override
    public Page<Destination>  getDestinationByDestinationType(DestinationType destinationType, Pageable pageable) {
        return destinationRepository.findByDestinationType(destinationType, pageable);
    }

    @Override
    public Destination addDestination(DestinationDTO destinationDto) {
        DestinationMapper destinationMapper = new DestinationMapper();
        Destination destination = destinationMapper.convertToEntity(destinationDto);
        // List<Equipement> savedBObjects = destination.getEquipements().stream()
        //         .map(equipementRepository::save) 
        //         .collect(Collectors.toList());

        // a.setRelatedBObjects(savedBObjects);

        // Save entity A with the list of saved B objects
        return destinationRepository.save(destination);


    }

    @Override
    public void delete(String id) {
        destinationRepository.deleteById(id); 
    }
    
}
