package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class GehituAnimalia{


    public static void erakutsi(Babeslekua babeslekua) {
        Stage stage = new Stage();

        Label titulua = new Label("ANIMALIAK GEHITU");

        TextField txtIzena = new TextField();
        txtIzena.setPromptText("Izena");

        Button btnGehitu = new Button("GEHITU");

        VBox layout = new VBox();

        layout.getChildren().addAll(titulua, txtIzena, btnGehitu);

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }
}
