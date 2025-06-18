package com.example.deliverymatch.controllers;


import com.example.deliverymatch.Services.DemmandeService;
import com.example.deliverymatch.dtos.DemmanDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DemmandeController {

private  final DemmandeService demmandeService;

    public DemmandeController(DemmandeService demmandeService) {
        this.demmandeService = demmandeService;
    }
    @PostMapping("/demmandes")
    public ResponseEntity<DemmanDto> adddemmande(@RequestBody DemmanDto demmanDto) {
        DemmanDto savedem = demmandeService.addDemmande(demmanDto);
        return new ResponseEntity<>(savedem, HttpStatus.CREATED);
    }
    @GetMapping("/demmandes")
    public ResponseEntity<List<DemmanDto>> getalldemmande(){
        List<DemmanDto> demmandes = demmandeService.getAllDemmandes();
        return new ResponseEntity<>(demmandes, HttpStatus.OK);
    }
    @GetMapping("/demmande/{id}")
    public ResponseEntity<DemmanDto> getdemById(@PathVariable Long id) {
        DemmanDto demmanDto = demmandeService.getDemmandeById(id);
        return demmanDto != null
                ? new ResponseEntity<>(demmanDto, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping("/demmande/{id}")
    public ResponseEntity<DemmanDto> updatedemmande(
            @PathVariable Long id,
            @RequestBody DemmanDto demmanDto) {
        DemmanDto updatedDem= demmandeService.EditDemmande(id, demmanDto);
        return updatedDem != null
                ? new ResponseEntity<>(updatedDem, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/demmande/{id}")
    public ResponseEntity<Void> deletedemmande(@PathVariable Long id) {
        demmandeService.deletedemmande(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
