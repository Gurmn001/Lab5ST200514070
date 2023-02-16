package com.example.mobilephone;
import javafx.scene.image.Image;

public class MobilePhone {

    private String name;
    private Image image;

    public MobilePhone(String name, Image image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public Image getImage() {
        return image;
    }
}