package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EzabatuAnimalia {

    public static void erakutsi() {
        Stage stage = new Stage();

        Label titulua = new Label("EZABATU ANIMALIA");

        Button btnEzabatu = new Button("EZABATU");

        VBox layout = new VBox();

        layout.getChildren().addAll(titulua, btnEzabatu);

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }
}
