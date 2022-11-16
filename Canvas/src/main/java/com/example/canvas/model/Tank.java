package com.example.canvas.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Tank extends Thread{

    public boolean toRight;

    public boolean toUp;

    public boolean toLeft;

    public boolean toDown;

    public Rectangle shape;

    public int x;

    public int y;

    public int size;

    public int movement;

    private GraphicsContext gc;

    private Image image;

    private Rectangle another_shape;

    public Tank(int x, int y, int size, int movement, GraphicsContext gc, Rectangle another_shape){
        toRight=false;
        toUp=false;
        toLeft=false;
        toDown=false;

        this.x=x;
        this.y=y;
        this.size=size;
        this.movement=movement;
        this.gc=gc;
        this.another_shape=another_shape;

        try {
            image = new Image(new FileInputStream("data/tank.png"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        shape = new Rectangle(x,y, size,size);

    }

    public void run(){
        while(true){

            if(shape.intersects(another_shape.getBoundsInParent())){
                System.out.println("collision");
            }

            if(toRight && x+size+movement<gc.getCanvas().getWidth()) {
                gc.clearRect(x,y,size,size);
                x+=movement;
                shape.setX(x);
            }
            if(toLeft && x-movement>0) {
                gc.clearRect(x,y,size,size);
                x-=movement;
                shape.setX(x);
            }
            if(toUp && y-movement>0) {
                gc.clearRect(x,y,size,size);
                y-=movement;
                shape.setY(y);
            }
            if(toDown && y+size+movement<gc.getCanvas().getHeight()) {
                gc.clearRect(x,y,size,size);
                y+=movement;
                shape.setY(y);
            }

            gc.drawImage(image,x,y,size,size);

            gc.setFill(Color.BLACK);
            gc.fillRect(another_shape.getX(), another_shape.getY(),another_shape.getWidth(),another_shape.getHeight());

            System.out.println(x+","+y+" --- "+(int)shape.getX()+","+(int)shape.getY());

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
