package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EzabatuAnimalia {

    public static void erakutsi(Babeslekua babeslekua) {

        Stage stage = new Stage();

        Label titulua = new Label("EZABATU ANIMALIA");

        TextField txtIzena = new TextField();
        txtIzena.setPromptText("Animaliaren izena");

        Button btnEzabatu = new Button("EZABATU");

        btnEzabatu.setOnAction(event -> {
            String izena = txtIzena.getText();
            babeslekua.ezabatuAnimalia(izena);
            stage.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(titulua, txtIzena, btnEzabatu);

        Scene scene = new Scene(layout, 300, 200);

        stage.setTitle("Ezabatu animalia");
        stage.setScene(scene);
        stage.show();
    }
}