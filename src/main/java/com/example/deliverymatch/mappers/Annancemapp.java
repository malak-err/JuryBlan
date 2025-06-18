package com.example.deliverymatch.mappers;

import com.example.deliverymatch.dtos.AnnanceDto;
import com.example.deliverymatch.models.Annance;
import org.mapstruct.Mapper;

import java.util.List;





@Mapper(componentModel = "spring")
public interface Annancemapp {

    Annance toEntity(AnnanceDto annanceDto);
    AnnanceDto toDTO(Annance annance);
    List<AnnanceDto> toDTOs (List<Annance> clients);


}
