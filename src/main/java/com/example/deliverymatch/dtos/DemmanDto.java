package com.example.deliverymatch.dtos;


import java.io.Serializable;

public class DemmanDto implements Serializable {

    String dimensions;
    String pois;
    String type;

    public DemmanDto(String dimensions, String pois, String type) {
        this.dimensions = dimensions;
        this.pois = pois;
        this.type = type;
    }

    public DemmanDto() {
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
