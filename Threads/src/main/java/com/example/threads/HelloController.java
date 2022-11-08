package com.example.threads;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class HelloController {
    @FXML
    private ProgressBar progressBar;

    @FXML
    private ProgressIndicator progressIndicator;

    @FXML
    public void iniciar(){
        Thread hilo1 = new Thread(){
            public void run(){
                for (double i = 0; i < 1; i+=0.1) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    progressIndicator.setProgress(i);
                }
            }
        };
        hilo1.setDaemon(true);
        hilo1.start();

        Thread hilo2 = new Thread(() -> {
            for (double i = 0; i < 1; i+=0.1) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                progressBar.setProgress(i);
            }
        });
        hilo2.setDaemon(true);
        hilo2.start();
    }
}