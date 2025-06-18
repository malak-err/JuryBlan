package com.example.deliverymatch.Services;


import com.example.deliverymatch.dtos.DemmanDto;
import com.example.deliverymatch.mappers.Demmandemapp;
import com.example.deliverymatch.models.Demmande;
import com.example.deliverymatch.repository.DemmandeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemmandeService {

private final DemmandeRepo demmandeRepo;

private final Demmandemapp demmandemapp;

    @Autowired
    public DemmandeService(DemmandeRepo demmandeRepo, Demmandemapp demmandemapp) {
        this.demmandeRepo = demmandeRepo;
        this.demmandemapp = demmandemapp;
    }

    public DemmanDto addDemmande (DemmanDto demmanDto) {
        Demmande demmande = demmandemapp.toEntity(demmanDto);
        Demmande savedDemmande = demmandeRepo.save(demmande);
        return demmandemapp.toDTO(savedDemmande);
    }
    public List<DemmanDto> getAllDemmandes() {
        List<Demmande> demmandes = demmandeRepo.findAll();
        return demmandemapp.toDTOs(demmandes);
    }
    public DemmanDto getDemmandeById(Long id) {
        return demmandeRepo.findById(id)
                .map(demmandemapp::toDTO)
                .orElse(null);
    }

    public DemmanDto EditDemmande(Long id, DemmanDto demmanDto) {
        return demmandeRepo.findById(id)
                .map(existindemm -> {

                    existindemm.setDimensions(demmanDto.getDimensions());
                    existindemm.setType(demmanDto.getType());
                    existindemm.setType(demmanDto.getType());
                    existindemm.setPois(demmanDto.getPois());


                    Demmande updatedemmande = demmandeRepo.save(existindemm);
                    return demmandemapp.toDTO(updatedemmande);
                })
                .orElse(null);
    }
    public void deletedemmande(Long id) {
        demmandeRepo.deleteById(id);
    }


}
