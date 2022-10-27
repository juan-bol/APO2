package com.example.demojavafx.control;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;

public class LoginController {

    @FXML
    private TextField userTF;

    @FXML
    private PasswordField passPF;

    @FXML
    public void loginClick(){
        String username = userTF.getText();
        String password = passPF.getText();
        if (username.equals("apo2") && password.equals("apo2")){
            JOptionPane.showMessageDialog(null, "Login", "Inicio de sesión completo",JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error in Login");
            alert.setContentText("User not found");
            alert.show();
        }
    }

}
