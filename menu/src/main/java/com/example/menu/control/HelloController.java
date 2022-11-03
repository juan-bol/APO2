package com.example.menu.control;

import com.example.menu.model.Person;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.*;

public class HelloController implements Initializable {

    @FXML
    private TextField nombresTF;

    @FXML
    private TextField apellidosTF;

    @FXML
    private DatePicker datePicker;

    @FXML
    private RadioButton masculinoRB;

    @FXML
    private RadioButton femeninoRB;

    @FXML
    private TableView<Person> tableView;

    @FXML
    private TableColumn colNombres;

    @FXML
    private TableColumn colApellidos;

    @FXML
    private TableColumn colDate;

    @FXML
    private TableColumn colSexo;

    private ObservableList<Person> personas;



    @FXML
    public void agregarClick(){
        System.out.println("click");
        String nombres = nombresTF.getText();
        String apellidos = apellidosTF.getText();
        int sexo = masculinoRB.isSelected() ? 0:1;
        Person person = new Person(nombres,apellidos,sexo);
        personas.add(person);
        tableView.setItems(personas);

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        personas = FXCollections.observableArrayList();

        colNombres.setCellValueFactory(new PropertyValueFactory<Person,String>("Nombres"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<Person,String>("Apellidos"));
        colSexo.setCellValueFactory(new PropertyValueFactory<Person,String>("Sexo"));
    }
}