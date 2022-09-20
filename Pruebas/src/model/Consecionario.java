package model;

import java.util.HashMap;

public class Consecionario {

    private HashMap<String, Carro> carros;

    public Consecionario() {
        this.carros = new HashMap<String, Carro>();
    }

    public Carro agregarCarro (String placa, String marca, String color, int numAsientos, double valor) throws CarroException {
        Carro carro = new Carro(marca, color, numAsientos, valor);
        if(placa.isBlank()){
            throw new CarroException("La placa no puede ser vacía");
        }
        return carros.put(placa, carro);
    }

    public int contarCarros(){
        return carros.size();
    }

    public void eliminarTodos(){
        carros.clear();
    }

    public Carro eliminarCarro(String placa){
        return carros.remove(placa);
    }

    public int calcularValorPromedio(){
        return 0;
    }

    public boolean algunaPlacaEmpiezaConLetra(char letra){
        return false;
    }

    public HashMap<String, Carro> getCarros() {
        return carros;
    }

    public void setCarros(HashMap<String, Carro> carros) {
        this.carros = carros;
    }
}
