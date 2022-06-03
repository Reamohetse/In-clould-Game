module com.example.reamohetse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reamohetse to javafx.fxml;
    exports com.example.reamohetse;
}