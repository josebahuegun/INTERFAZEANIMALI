package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button  ;

public class Aplikazioa extends Application {

    private Babeslekua babeslekua;

    @Override
    public void start(Stage stage) {

        babeslekua = new Babeslekua();

        Label titulo = new Label("ANIMALIEN BABESLEKUA");

        Button btnGehitu = new Button("Animaliak gehitu");

        Button btnAdoptatu = new Button("Animaliak adoptatu");

        Button btnEzabatu = new Button("Animaliak ezabatu");

        Button btnErakutsi = new Button("Animaliak erakutsi");

        Button btnBilatu = new Button("Bilatu");

        Button btnSoinuak = new Button("Egin soinuak");

        Button btnIrten = new Button("Irten");

        btnGehitu.setOnAction(event -> {
            GehituAnimalia.erakutsi(babeslekua);
        });

        btnAdoptatu.setOnAction(event -> {
            AdoptatuAnimalia.erakutsi(babeslekua);
        });

        btnEzabatu.setOnAction(event -> {
            EzabatuAnimalia.erakutsi(babeslekua);
        });

        btnBilatu.setOnAction(event -> {
            BilatuAnimalia.erakutsi(babeslekua);
        });

        btnErakutsi.setOnAction(event -> {
            ErakutsiAnimaliak.erakutsi(babeslekua);
        });

        btnSoinuak.setOnAction(event -> {
            EginSoinuak.erakutsi(babeslekua);
        });

        btnIrten.setOnAction(event -> {
            stage.close();
        });


        VBox layout = new VBox(20);
        layout.getChildren().addAll(titulo, btnGehitu, btnAdoptatu, btnEzabatu, btnErakutsi, btnBilatu, btnSoinuak, btnIrten);


        Scene scene = new Scene(layout, 600, 400);

        stage.setTitle("Animalien Babeslekua");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}