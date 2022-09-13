package model;

public class Carro {

    private String marca;
    private String color;
    private int numAsientos;

    public Carro(String marca, String color, int numAsientos) {
        this.marca = marca;
        this.color = color;
        this.numAsientos = numAsientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }
}
