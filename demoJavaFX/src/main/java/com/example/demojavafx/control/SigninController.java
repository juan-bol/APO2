package com.example.demojavafx.control;

import com.example.demojavafx.HelloApplication;
import com.example.demojavafx.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class SigninController {

    @FXML
    private TextField userTF;

    @FXML
    private PasswordField passPF;

    @FXML
    private PasswordField passPFRepeat;


    @FXML
    public void signinClick(){
        String user = userTF.getText();
        String pass = passPF.getText();
        if (!user.isBlank() && pass.equals(passPFRepeat.getText())){
            User.getInstance().setUsername(user);
            User.getInstance().setPassword(pass);
            User.getInstance().setNote("Agrega tus notas...");
            int res = JOptionPane.showOptionDialog(null, "Registro completo del usuario "+ user, "Sign In", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if(res==0){
                HelloApplication.showWindow("hello-view");
                HelloApplication.hideWindow((Stage) userTF.getScene().getWindow());
            }
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Sign in error");
            alert.setContentText("Las contraseñas deben coincidir");
            alert.show();
        }
    }

}
