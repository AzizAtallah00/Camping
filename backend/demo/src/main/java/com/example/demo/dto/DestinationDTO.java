package com.example.demo.dto;

import java.util.List;


import com.example.demo.enums.DestinationType;
import com.example.demo.enums.SafetyLevel;
import com.example.demo.models.Equipement;

import lombok.Data;

@Data
public class DestinationDTO {
    private String location;
    private String description;
    private String imageUrl;
    private String seasonToVisit;
    private DestinationType destinationType;
    private SafetyLevel safetyLevel;
    private int popularity;
    
    private List<Equipement> equipements;
}
