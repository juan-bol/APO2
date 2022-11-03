module com.example.menu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.menu to javafx.fxml;
    exports com.example.menu;
    exports com.example.menu.control;
    exports com.example.menu.model;
    opens com.example.menu.model to javafx.fxml;
    opens com.example.menu.control to javafx.fxml;
}