package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

public class BilatuAnimalia {

    public static void erakutsi(Babeslekua babeslekua) {

        Stage stage = new Stage();

        Label titulua = new Label("BILATU ANIMALIAK");

        TextField txtIzena = new TextField();
        txtIzena.setPromptText("Sartu animaliaren izena");

        Button btnBilatu = new Button("BILATU");

        btnBilatu.setOnAction(event -> {

            String izena = txtIzena.getText();

            Animalia animalia = babeslekua.bilatuAnimalia(izena);

            if (animalia != null) {
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Animalia aurkituta");
                alerta.setHeaderText("Animalia aurkitu da!");
                alerta.setContentText(animalia.toString());
                alerta.showAndWait();
            } else {
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Bilaketaren emaitza");
                alerta.setHeaderText("Ez da animalia aurkitu");
                alerta.setContentText("Ez dago izen hori duen animaliarik.");
                alerta.showAndWait();
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(titulua, txtIzena, btnBilatu);

        Scene scene = new Scene(layout, 300, 200);

        stage.setTitle("Bilatu animalia");
        stage.setScene(scene);
        stage.show();
    }
}