package com.example.canvas;

import com.example.canvas.model.Tank;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Canvas canvas;

    private GraphicsContext gc;

    private Tank tank;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();

        setCanvasEvents();
        paint();
    }

    public void setCanvasEvents(){
        canvas.setFocusTraversable(true);
        canvas.setOnKeyPressed(e -> {
            if(e.getCode().equals(KeyCode.UP)){
                tank.toUp=true;
            }
            else if(e.getCode().equals(KeyCode.DOWN)){
                tank.toDown=true;
            }
            else if(e.getCode().equals(KeyCode.RIGHT)){
                tank.toRight=true;
            }
            else if(e.getCode().equals(KeyCode.LEFT)){
                tank.toLeft=true;
            }
        });
        canvas.setOnKeyReleased(e2 -> {
            if(e2.getCode().equals(KeyCode.UP)){
                tank.toUp=false;
            }
            else if(e2.getCode().equals(KeyCode.DOWN)){
                tank.toDown=false;
            }
            else if(e2.getCode().equals(KeyCode.RIGHT)){
                tank.toRight=false;
            }
            else if(e2.getCode().equals(KeyCode.LEFT)){
                tank.toLeft=false;
            }
        });
    }

    public void paint(){

        Rectangle another_shape = new Rectangle(300,300,50,50);

        tank = new Tank(200,200,50,2, gc, another_shape);
        tank.setDaemon(true);
        tank.start();
    }
}