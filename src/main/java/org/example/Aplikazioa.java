package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button  ;

public class Aplikazioa extends Application {

    @Override
    public void start(Stage stage) {

        Label titulo = new Label("ANIMALIEN BABESLEKUA");

        Button btnGehitu = new Button("Animaliak gehitu");

        btnGehitu.setOnAction(event -> {
            GehituAnimalia.erakutsi();
            titulo.setText("ANIMALIEN BABESLEKUA");
        });

        VBox layout = new VBox(20);
        layout.getChildren().addAll(titulo, btnGehitu);

        Scene scene = new Scene(layout, 600, 400);

        stage.setTitle("Animalien Babeslekua");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}