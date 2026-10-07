package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BilatuAnimalia {

    public static void erakutsi() {
        Stage stage = new Stage();

        Label titulua = new Label("BILATU ANIMALIAK");

        Button btnBilatu = new Button("BILATU");

        VBox layout = new VBox();

        layout.getChildren().addAll(titulua, btnBilatu);

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }
}
