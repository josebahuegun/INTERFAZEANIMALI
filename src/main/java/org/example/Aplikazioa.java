package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Aplikazioa extends Application {

    private Babeslekua babeslekua;

    @Override
    public void start(Stage stage) {

        babeslekua = new Babeslekua();

        babeslekua.kargatuAnimaliak();

        Label titulo = new Label("ANIMALIEN BABESLEKUA");

        Button btnGehitu = new Button("Gehitu animaliak");
        Button btnAdoptatu = new Button("Adoptatu animaliak");
        Button btnEzabatu = new Button("Ezabatu animaliak");
        Button btnBilatu = new Button("Bilatu animalia");
        Button btnErakutsi = new Button("Erakutsi animaliak");
        Button btnSoinuak = new Button("Egin soinuak");
        Button btnIrten = new Button("Irten");

        btnGehitu.setOnAction(event ->
                GehituAnimalia.erakutsi(babeslekua));

        btnAdoptatu.setOnAction(event ->
                AdoptatuAnimalia.erakutsi(babeslekua));

        btnEzabatu.setOnAction(event ->
                EzabatuAnimalia.erakutsi(babeslekua));

        btnBilatu.setOnAction(event ->
                BilatuAnimalia.erakutsi(babeslekua));

        btnErakutsi.setOnAction(event ->
                ErakutsiAnimaliak.erakutsi(babeslekua));

        btnSoinuak.setOnAction(event ->
                EginSoinuak.erakutsi(babeslekua));

        btnIrten.setOnAction(event -> stage.close());

        GridPane grid = new GridPane();
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setAlignment(Pos.CENTER);

        grid.add(btnGehitu, 0, 0);
        grid.add(btnAdoptatu, 1, 0);
        grid.add(btnEzabatu, 0, 1);
        grid.add(btnBilatu, 1, 1);
        grid.add(btnErakutsi, 0, 2);
        grid.add(btnSoinuak, 1, 2);

        btnGehitu.setMaxWidth(Double.MAX_VALUE);
        btnAdoptatu.setMaxWidth(Double.MAX_VALUE);
        btnEzabatu.setMaxWidth(Double.MAX_VALUE);
        btnBilatu.setMaxWidth(Double.MAX_VALUE);
        btnErakutsi.setMaxWidth(Double.MAX_VALUE);
        btnSoinuak.setMaxWidth(Double.MAX_VALUE);

        VBox layout = new VBox(25);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(25));
        layout.getChildren().addAll(titulo, grid, btnIrten);

        Scene scene = new Scene(layout, 500, 350);

        stage.setTitle("Animalien Babeslekua");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}