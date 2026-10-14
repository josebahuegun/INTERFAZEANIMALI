
package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EginSoinuak {

    public static void erakutsi(Babeslekua babeslekua) {

        Stage stage = new Stage();

        Label titulua = new Label("EGIN SOINUAK");

        Label lblSoinuak = new Label("");

        Button btnSoinuak = new Button("EGIN SOINUAK");

        btnSoinuak.setOnAction(event -> {
            lblSoinuak.setText(
                    "Txakurra: Guau!\n" +
                            "Katua: Miau!\n" +
                            "Untxia: Grrr!"
            );
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(titulua, btnSoinuak, lblSoinuak);

        Scene scene = new Scene(layout, 350, 300);

        stage.setTitle("Egin soinuak");
        stage.setScene(scene);
        stage.show();
    }
}
