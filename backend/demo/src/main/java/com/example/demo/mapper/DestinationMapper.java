package com.example.demo.mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dto.DestinationDTO;
import com.example.demo.models.Destination;

@Component
public class DestinationMapper {
    private static final ModelMapper modelMapper= new ModelMapper();

	public static DestinationDTO convertToDto(Destination destination) {
        return modelMapper.map(destination, DestinationDTO.class);
    }

    public Destination convertToEntity(DestinationDTO destinationDTO) {
        Destination destination = modelMapper.map(destinationDTO, Destination.class);
        return destination;
    }
	
}
