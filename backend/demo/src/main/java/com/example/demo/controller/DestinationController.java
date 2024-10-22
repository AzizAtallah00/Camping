package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enums.DestinationType;
import com.example.demo.models.Destination;
import com.example.demo.service.DestinationService;


@RestController
@RequestMapping("/api/destinations")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping()
    public Page<Destination> getAllDestinations(Pageable pageable){
        return destinationService.getAllDestinations(pageable);
    }

    @GetMapping("/{destinationType}")
    public Page<Destination> getDestinationByDestinationType (@PathVariable DestinationType destinationType, Pageable pageable){
        return destinationService.getDestinationByDestinationType(destinationType, pageable);
    }

    @PostMapping()
    public Destination addDestination(@RequestBody Destination customer){
        return destinationService.addDestination(customer);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable String id){
        destinationService.delete(id);
        return "Destination deleted successfully";
    }

}