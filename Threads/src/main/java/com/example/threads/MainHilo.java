package com.example.threads;

public class MainHilo {

    public static void tarea(String nombreTarea){
        try {
            System.out.println("Inicio tarea "+nombreTarea);
            Thread.sleep(2000);
            System.out.println("Fin tarea"+ nombreTarea);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//        tarea("1");
//        tarea("2");
//        tarea("3");
        Hilo hilo1 = new Hilo("1");
        hilo1.start();
        Hilo hilo2 = new Hilo("2");
        hilo2.start();
        Hilo hilo3 = new Hilo("3");
        hilo3.start();
    }
}
