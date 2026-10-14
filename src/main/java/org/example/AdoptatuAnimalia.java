package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdoptatuAnimalia {

    public static void erakutsi(Babeslekua babeslekua) {

        Stage stage = new Stage();

        Label titulua = new Label("ANIMALIAK ADOPTATU");

        TextField txtIzena = new TextField();
        txtIzena.setPromptText("Sartu animaliaren izena");

        Button btnAdoptatu = new Button("ADOPTATU");

        btnAdoptatu.setOnAction(event -> {

            String izena = txtIzena.getText();

            Animalia animalia = babeslekua.bilatuAnimalia(izena);

            if (animalia != null) {

                babeslekua.adoptatuAnimalia(izena);

                stage.close();

            } else {
                    System.out.println("Ez da animalia aurikitu");
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(titulua, txtIzena, btnAdoptatu);

        Scene scene = new Scene(layout, 300, 200);

        stage.setTitle("Adoptatu animalia");
        stage.setScene(scene);
        stage.show();
    }
}