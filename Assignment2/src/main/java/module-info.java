module com.example.assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment2 to javafx.fxml;
    exports com.example.assignment2;
}