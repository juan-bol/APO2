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

    public HelloController (){
        System.out.println("Hello from Controller");
    }

    @FXML
    protected void loginClick() {
        HelloApplication.showWindow("login.fxml");
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        sampleText.setText("apo2: "+ check.isSelected());
    }
}