package com.example.deliverymatch.mappers;
import com.example.deliverymatch.dtos.DemmanDto;
import com.example.deliverymatch.models.Demmande;
import org.mapstruct.Mapper;

import java.util.List;



@Mapper(componentModel = "spring")

public interface Demmandemapp {

    Demmande toEntity(DemmanDto demmanDto);
    DemmanDto toDTO(Demmande demmande);
    List<DemmanDto> toDTOs (List<Demmande> demmandes);

}
