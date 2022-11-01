package com.example.demojavafx.control;

import com.example.demojavafx.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label sampleText;

    @FXML
    private CheckBox check;

    @FXML
    protected void loginClick() {
        HelloApplication.showWindow("login");
        HelloApplication.hideWindow((Stage) welcomeText.getScene().getWindow());
    }

    @FXML
    protected void siginClick(){
        HelloApplication.showWindow("signin");
        HelloApplication.hideWindow((Stage) welcomeText.getScene().getWindow());
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        sampleText.setText("apo2: "+ check.isSelected());
    }
}