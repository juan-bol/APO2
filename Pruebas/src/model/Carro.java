package model;

public class Carro {

    private String marca;
    private String color;
    private int numAsientos;

    private double valor;

    public Carro(String marca, String color, int numAsientos, double valor) {
        this.marca = marca;
        this.color = color;
        this.numAsientos = numAsientos;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
