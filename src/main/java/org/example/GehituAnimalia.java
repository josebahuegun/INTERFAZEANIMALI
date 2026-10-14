package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert;

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

        ComboBox<String> cmbMota = new ComboBox<>();
        cmbMota.setPromptText("Aukeratu mota");
        cmbMota.getItems().addAll("Katua", "Txakurra", "Untxia");

        Button btnGehitu = new Button("GEHITU");

        btnGehitu.setOnAction(event -> {

            try {
                String izena = txtIzena.getText();
                String espeziea = txtEspeziea.getText();
                String mota = cmbMota.getValue();

                int adina = Integer.parseInt(txtAdina.getText());
                double pisua = Double.parseDouble(txtPisua.getText());

                if (izena.isEmpty() || espeziea.isEmpty() || mota == null) {
                    Alert alerta = new Alert(Alert.AlertType.WARNING);
                    alerta.setContentText("Bete eremu guztiak.");
                    alerta.showAndWait();
                    return;
                }

                Animalia animalia = null;

                if (mota.equals("Katua")) {
                    animalia = new Katua(espeziea, false, adina, pisua, izena);
                } else if (mota.equals("Txakurra")) {
                    animalia = new Txakurra(espeziea, false, adina, pisua, izena);
                } else if (mota.equals("Untxia")) {
                    animalia = new Untxia(espeziea, false, adina, pisua, izena);
                }

                babeslekua.gehituAnimalia(animalia);

                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setContentText("Animalia ondo gehitu da!");
                alerta.showAndWait();

                stage.close();

            } catch (NumberFormatException e) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setContentText("Adina zenbaki oso bat izan behar da eta pisua zenbaki bat.");
                alerta.showAndWait();
            }
        });

        VBox layout = new VBox(10);

        layout.getChildren().addAll(
                titulua,
                txtIzena,
                cmbMota,
                txtEspeziea,
                txtAdina,
                txtPisua,
                btnGehitu
        );

        Scene scene = new Scene(layout, 300, 350);

        stage.setTitle("Gehitu animalia");
        stage.setScene(scene);
        stage.show();
    }
}