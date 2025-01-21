module com.example.tennisarena {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tennisarena to javafx.fxml;
    exports com.example.tennisarena;
}