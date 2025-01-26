package com.example.tennisarena;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
public class ControllerTenis {
    // Métodos de eventos para el estilo de los botones (opcional)
    public void handleMousePress(MouseEvent event) {
        Button button = (Button) event.getSource();
        button.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10 20; -fx-background-radius: 5; -fx-scale-x: 1.2; -fx-scale-y: 1.2;");
    }
    public void handleMouseRelease(MouseEvent event) {
        Button button = (Button) event.getSource();
        button.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10 20; -fx-background-radius: 5;");
    }

    public void onIniciarSesionButtonClick() {

    }

    public void onRegistrarseButtonClick() {

    }
}