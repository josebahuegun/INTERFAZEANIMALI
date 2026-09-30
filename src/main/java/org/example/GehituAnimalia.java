package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.*;

public class GehituAnimalia extends Application{

    @Override
    public void start(Stage stage) {

        Label titulua = new Label("ANIMALIAK GEHITU");

        Button btnGehitu = new Button("GEHITU");

        VBox layout = new VBox();

        layout.getChildren().addAll(titulua, btnGehitu);
    }


    public static void main(String[] args) {
        launch();
    }
}
