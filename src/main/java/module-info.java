module com.example.todofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.todofx to javafx.fxml;
    exports com.example.todofx;
}