package com.example.tennisarena;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class ControllerTenis {

    // Formulario de inicio de sesión
    @FXML private AnchorPane loginPane;
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;

    // Formulario de registro
    @FXML private AnchorPane registerPane;
    @FXML private TextField registerEmailField;
    @FXML private PasswordField registerPasswordField;
    @FXML private PasswordField confirmPasswordField;

    // Método para manejar el clic en "Iniciar sesión"
    @FXML
    protected void onIniciarSesionButtonClick() {
        loginPane.setVisible(true);  // Muestra el formulario de login
        registerPane.setVisible(false);  // Oculta el formulario de registro
    }

    // Método para manejar el clic en "Registrarse"
    @FXML
    protected void onRegistrarseButtonClick() {
        registerPane.setVisible(true);  // Muestra el formulario de registro
        loginPane.setVisible(false);  // Oculta el formulario de login
    }

    // Método para manejar el inicio de sesión
    @FXML
    protected void onLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();
        System.out.println("Inicio de sesión con el email: " + email);
        // Aquí puedes agregar la lógica de validación y autenticación
    }

    // Método para manejar el registro
    @FXML
    protected void onRegister() {
        String email = registerEmailField.getText();
        String password = registerPasswordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if(password.equals(confirmPassword)) {
            System.out.println("Registro exitoso con el email: " + email);
            // Aquí puedes agregar la lógica para guardar el nuevo usuario
        } else {
            System.out.println("Las contraseñas no coinciden.");
        }
    }

    // Métodos de eventos para el estilo de los botones (opcional)
    public void handleMousePress(MouseEvent event) {
        Button button = (Button) event.getSource();
        button.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10 20; -fx-background-radius: 5; -fx-scale-x: 1.2; -fx-scale-y: 1.2;");
    }

    public void handleMouseRelease(MouseEvent event) {
        Button button = (Button) event.getSource();
        button.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10 20; -fx-background-radius: 5;");
    }
}
