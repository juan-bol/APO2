package com.example.canvas;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Canvas canvas;

    private GraphicsContext gc;

    private int count;

    private boolean flag;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
        count=0;
        flag=true;
        canvasEvents();
        paint();
    }

    public void canvasEvents(){
        canvas.setFocusTraversable(true);
        canvas.setOnKeyPressed(e -> {
            if(e.getCode().equals(KeyCode.SPACE)){
                flag=!flag;
            }
        });
    }

    public void paint(){
        Thread hiloPintar = new Thread(() -> {
            int x = 0;
            boolean toRight = true;
            while (true)
            {
                // Canvas background
                gc.setFill(Color.rgb(0,0,0));
                gc.fillRect(0,0,canvas.getWidth(), canvas.getHeight());
                // Rect
                gc.setFill(Color.rgb(255,0,0));
                gc.fillRect(x,20, 50,50);
                if(flag){
                    if (toRight) x++;
                    else x--;
                }
                if ((x+50>=canvas.getWidth()  && toRight) || x<=0 && !toRight) {
                    toRight=!toRight;
                    count++;
                }
                System.out.println(count);
                System.out.println(flag);

                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        hiloPintar.setDaemon(true);
        hiloPintar.start();
    }
}