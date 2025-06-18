package com.example.deliverymatch.controllers;


import com.example.deliverymatch.Services.AnnanceService;
import com.example.deliverymatch.dtos.AnnanceDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnnanceController {
    private final AnnanceService annanceService;

    public AnnanceController(AnnanceService annanceService) {
        this.annanceService = annanceService;
    }


    @GetMapping("/annances")
    public ResponseEntity<List<AnnanceDto>> getallannace(){
        List<AnnanceDto> annances = annanceService.getAllannances();
        return new ResponseEntity<>(annances, HttpStatus.OK);
    }

    @PostMapping("/annances")
    public ResponseEntity<AnnanceDto> addAnnance(@RequestBody AnnanceDto annanceDto) {
        AnnanceDto savedann = annanceService.addAnnance(annanceDto);
        return new ResponseEntity<>(savedann, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AnnanceDto> getAnnById(@PathVariable Long id) {
        AnnanceDto annanceDto = annanceService.getAnnanceById(id);
        return annanceDto != null
                ? new ResponseEntity<>(annanceDto, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping("/{id}")
    public ResponseEntity<AnnanceDto> updateannence(
            @PathVariable Long id,
            @RequestBody AnnanceDto annanceDto) {
        AnnanceDto updatedAnn= annanceService.EditAnnance(id, annanceDto);
        return updatedAnn != null
                ? new ResponseEntity<>(updatedAnn, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteannance(@PathVariable Long id) {
        annanceService.deletannance(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
