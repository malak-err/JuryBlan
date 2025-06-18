package com.example.deliverymatch.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Demmande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long idDemmande;
    String dimensions;
    String pois;
    String type;

    public Long getIdDemmande() {
        return idDemmande;
    }

    public void setIdDemmande(Long idDemmande) {
        this.idDemmande = idDemmande;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getPois() {
        return pois;
    }

    public void setPois(String pois) {
        this.pois = pois;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
