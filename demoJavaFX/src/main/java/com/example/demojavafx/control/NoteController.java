package com.example.demojavafx.control;

import com.example.demojavafx.HelloApplication;
import com.example.demojavafx.model.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.print.attribute.UnmodifiableSetException;
import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class NoteController implements Initializable {

    @FXML
    private Label userLBL;

    @FXML
    private TextArea noteArea;

    public NoteController(){
        // Los FXML están nulos
        System.out.println("Hello from Controller");
    }

    @FXML
    public void logoutClick(){
        User.getInstance().setNote(noteArea.getText());
        HelloApplication.showWindow("hello-view");
        HelloApplication.hideWindow((Stage) userLBL.getScene().getWindow());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Los FXML ya no están nulos
        System.out.println(userLBL);
        userLBL.setText("Notas de "+User.getInstance().getUsername());
        noteArea.setText(User.getInstance().getNote());
    }
}
