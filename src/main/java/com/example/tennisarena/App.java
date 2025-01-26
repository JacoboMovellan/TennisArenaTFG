package com.example.tennisarena;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Cargar el archivo FXML con VBox como contenedor raíz
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Tennis.fxml"));
        VBox root = fxmlLoader.load(); // Cargar el VBox del FXML

        // Configurar el fondo con una imagen
        String imagePath = "/com/example/tennisarena/images/FotoInicio.png"; //Ruta de la imagen en tu carpeta resources
        Image fondoImage = new Image(getClass().getResourceAsStream(imagePath)); // Cargar la imagen
        BackgroundImage backgroundImage = new BackgroundImage(fondoImage,
                javafx.scene.layout.BackgroundRepeat.NO_REPEAT,
                javafx.scene.layout.BackgroundRepeat.NO_REPEAT,
                javafx.scene.layout.BackgroundPosition.CENTER, // Cambié de javafx.geometry.Pos.CENTER a BackgroundPosition.CENTER
                BackgroundSize.DEFAULT);
        root.setBackground(new Background(backgroundImage)); // Establecer la imagen como fondo

        // Configurar la escena
        Scene scene = new Scene(root, 920, 730);
        stage.setTitle("TennisArena");

        // Configurar el icono de la aplicación
        Image icono = new Image(getClass().getResourceAsStream("/com/example/tennisarena/images/IconoApp.png"));
        stage.getIcons().add(icono);

        // Mostrar la ventana
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

