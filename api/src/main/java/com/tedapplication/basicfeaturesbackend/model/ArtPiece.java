package com.tedapplication.basicfeaturesbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "art")
public class ArtPiece {
    
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String type;
    private String artist;
    private double estimatedValue;
    private double startingPrice;

    /* defaulf contsructor */
    public ArtPiece() {
    }


    public ArtPiece(Long id, String name, String type, String artist, double estimatedValue, double startingPrice) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.artist = artist;
        this.estimatedValue = estimatedValue;
        this.startingPrice = startingPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(double estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(double startingPrice) {
        this.startingPrice = startingPrice;
    }

    
    
    

}
