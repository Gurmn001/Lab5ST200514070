package com.example.lab5st200514070;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Mobile-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("My Phone");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {

        launch();
    }
}