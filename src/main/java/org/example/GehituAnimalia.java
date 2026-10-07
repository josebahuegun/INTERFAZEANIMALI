package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GehituAnimalia {

    public static void erakutsi(Babeslekua babeslekua) {

        Stage stage = new Stage();

        Label titulua = new Label("ANIMALIAK GEHITU");

        TextField txtIzena = new TextField();
        txtIzena.setPromptText("Izena");

        TextField txtEspeziea = new TextField();
        txtEspeziea.setPromptText("Espeziea");

        TextField txtAdina = new TextField();
        txtAdina.setPromptText("Adina");

        TextField txtPisua = new TextField();
        txtPisua.setPromptText("Pisua");

        Button btnGehitu = new Button("GEHITU");

        btnGehitu.setOnAction(event -> {

            String izena = txtIzena.getText();

            String espeziea = txtEspeziea.getText();

            int adina = Integer.parseInt(txtAdina.getText());

            double pisua = Double.parseDouble(txtPisua.getText());

        });

        VBox layout = new VBox(10);

        layout.getChildren().addAll(titulua, txtIzena, txtEspeziea, txtAdina, txtPisua, btnGehitu
        );

        Scene scene = new Scene(layout, 300, 300);

        stage.setTitle("Gehitu animalia");
        stage.setScene(scene);
        stage.show();
    }
}