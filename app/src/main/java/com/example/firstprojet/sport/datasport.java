package com.example.firstprojet.sport;

public class datasport {
    private String titlesport;
    private int imagesport;
    private int dessport;

    public datasport(String titlesport, int imagesport, int dessport) {
        this.titlesport = titlesport;
        this.imagesport = imagesport;
        this.dessport = dessport;
    }

    public String getTitlesport() {
        return titlesport;
    }

    public void setTitlesport(String titlesport) {
        this.titlesport = titlesport;
    }

    public int getImagesport() {
        return imagesport;
    }

    public void setImagesport(int imagesport) {
        this.imagesport = imagesport;
    }

    public int getDessport() {
        return dessport;
    }

    public void setDessport(int dessport) {
        this.dessport = dessport;
    }
}