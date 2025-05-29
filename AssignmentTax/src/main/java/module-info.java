module com.example.assignmenttax {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignmenttax to javafx.fxml;
    exports com.example.assignmenttax;
}