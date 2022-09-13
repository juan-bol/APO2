package model;

import java.util.HashMap;

public class Consecionario {

    private HashMap<String, Carro> carros;

    public Consecionario() {
        this.carros = new HashMap<String, Carro>();
    }

    public Carro agregarCarro (String placa, String marca, String color, int numAsientos){
        Carro carro = new Carro(marca, color, numAsientos);
        return carros.put(placa, carro);
    }

    public int contarCarros(){
        return carros.size();
    }

    public Carro eliminarCarro(String placa){
        return carros.remove(placa);
    }

    public HashMap<String, Carro> getCarros() {
        return carros;
    }

    public void setCarros(HashMap<String, Carro> carros) {
        this.carros = carros;
    }
}
