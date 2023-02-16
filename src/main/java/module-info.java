module com.example.lab5st200514070 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab5st200514070 to javafx.fxml;
    exports com.example.lab5st200514070;
}