package com.example.lab5st200514070;
import javafx.fxml.FXML;
import javafx.scene.image.Image;

public class MobilePhone {

    private String name;
    private String image;

    public MobilePhone(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

}