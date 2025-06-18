package com.example.deliverymatch.Services;

import com.example.deliverymatch.dtos.AnnanceDto;
import com.example.deliverymatch.mappers.Annancemapp;
import com.example.deliverymatch.models.Annance;
import com.example.deliverymatch.repository.Annancerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AnnanceService {

    private final Annancerepo annancerepo;

    private final Annancemapp annancemapp;

    @Autowired


    public AnnanceService(Annancerepo annancerepo, Annancemapp annancemapp) {
        this.annancerepo = annancerepo;
        this.annancemapp = annancemapp;
    }


    public AnnanceDto addAnnance (AnnanceDto annanceDto) {
        Annance annance = annancemapp.toEntity(annanceDto);
        Annance savedAnnace = annancerepo.save(annance);
        return annancemapp.toDTO(savedAnnace);
    }

    public List<AnnanceDto> getAllannances() {
        List<Annance> annances = annancerepo.findAll();
        return annancemapp.toDTOs(annances);
    }

    public AnnanceDto getAnnanceById(Long id) {
        return annancerepo.findById(id)
                .map(annancemapp::toDTO)
                .orElse(null);
    }
    public AnnanceDto EditAnnance(Long id, AnnanceDto annanceDto) {
        return annancerepo.findById(id)
                .map(existingann -> {

                    existingann.setDepart(annanceDto.getDepart());
                    existingann.setEtapes(annanceDto.getEtapes());
                    existingann.setArret(annanceDto.getArret());
                    existingann.setCapacite(annanceDto.getCapacite());
                    existingann.setType(annanceDto.getType());
                    existingann.setPoid(annanceDto.getPoid());




                    Annance updatedannance = annancerepo.save(existingann);
                    return annancemapp.toDTO(updatedannance);
                })
                .orElse(null);
    }
    public void deletannance(Long id) {
        annancerepo.deleteById(id);
    }


}
