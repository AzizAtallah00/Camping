package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import com.example.demo.enums.DestinationType;
import com.example.demo.enums.SafetyLevel;


@Data
@Document(collection = "destinations")
public class Destination {
    @Id
    private String id;
    private String location;
    private String description;
    private String imageUrl;
    private String seasonToVisit;

    @Field("destinatonType")
    private DestinationType destinationType;

    @Field("safetyLevel")
    private SafetyLevel safetyLevel;
    private int popularity;

}
