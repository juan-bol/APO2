package com.example.threads;

public class Hilo extends  Thread{

    private String nombreTarea;

    public Hilo(String nombreTarea){
        this.nombreTarea = nombreTarea;
    }

    public void run(){
        tarea(nombreTarea);
    }

    public void tarea(String nombreTarea){
        try {
            System.out.println("Inicio tarea "+nombreTarea);
            Thread.sleep(2000);
            System.out.println("Fin tarea"+ nombreTarea);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
