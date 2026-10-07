package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdoptatuAnimalia {

    public static void erakutsi() {
        Stage stage = new Stage();

        Label titulua = new Label("ANIMALIAK ADOPTATU");

        Button btnAdoptatu = new Button("ADOPTATU");

        VBox layout = new VBox();

        layout.getChildren().addAll(titulua, btnAdoptatu);

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }
}
