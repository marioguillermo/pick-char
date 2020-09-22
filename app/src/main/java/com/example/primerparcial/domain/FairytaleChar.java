package com.example.primerparcial.domain;

public class FairytaleChar {

    int name;
    int shortDescription;
    int imageResource;

    public FairytaleChar(int name, int shortDescription, int imageResource) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.imageResource = imageResource;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(int shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
