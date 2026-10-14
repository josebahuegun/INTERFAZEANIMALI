
package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ErakutsiAnimaliak {

    public static void erakutsi(Babeslekua babeslekua) {

        Stage stage = new Stage();

        Label titulua = new Label("ERAKUTSI ANIMALIAK");

        ListView<String> lista = new ListView<>();

        for (Animalia animalia : babeslekua.getAnimaliak()) {
            lista.getItems().add(animalia.toString());
        }

        VBox layout = new VBox(10);
        layout.getChildren().addAll(titulua, lista);

        Scene scene = new Scene(layout, 400, 300);

        stage.setTitle("Erakutsi animaliak");
        stage.setScene(scene);
        stage.show();
    }
}
