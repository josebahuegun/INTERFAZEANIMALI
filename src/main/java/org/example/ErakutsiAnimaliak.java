package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ErakutsiAnimaliak {

    public static void erakutsi() {
        Stage stage = new Stage();

        Label titulua = new Label("ERAKUTSI ANIMALIAK");


        VBox layout = new VBox();

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }
}
