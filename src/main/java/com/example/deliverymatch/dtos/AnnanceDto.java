package com.example.deliverymatch.dtos;

import java.io.Serializable;

public class AnnanceDto  implements Serializable {

    String depart;
    String etapes;
    String arret;
    String capacite;
    String type;
    Double poid;

    public AnnanceDto(String depart, String etapes, String arret, String capacite, String type, Double poid) {
        this.depart = depart;
        this.etapes = etapes;
        this.arret = arret;
        this.capacite = capacite;
        this.type = type;
        this.poid = poid;
    }

    public AnnanceDto() {

    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getEtapes() {
        return etapes;
    }

    public void setEtapes(String etapes) {
        this.etapes = etapes;
    }

    public String getArret() {
        return arret;
    }

    public void setArret(String arret) {
        this.arret = arret;
    }

    public String getCapacite() {
        return capacite;
    }

    public void setCapacite(String capacite) {
        this.capacite = capacite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPoid() {
        return poid;
    }

    public void setPoid(Double poid) {
        this.poid = poid;
    }
}
