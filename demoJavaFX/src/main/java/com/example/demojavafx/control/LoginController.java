package com.example.demojavafx.control;

import com.example.demojavafx.HelloApplication;
import com.example.demojavafx.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class LoginController {

    @FXML
    private TextField userTF;

    @FXML
    private PasswordField passPF;

    @FXML
    public void loginClick(){
        String user = userTF.getText();
        String pass = passPF.getText();
        if (user.equals(User.getInstance().getUsername()) && pass.equals(User.getInstance().getPassword())){
            int res = JOptionPane.showOptionDialog(null, "El usuario "+ user+" ha iniciado sesión", "Sign In", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if(res==0){
                HelloApplication.showWindow("note");
                HelloApplication.hideWindow((Stage) userTF.getScene().getWindow());
            }

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
