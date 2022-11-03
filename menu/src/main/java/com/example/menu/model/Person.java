package com.example.menu.model;

public class Person {

    private String nombres;

    private String apellidos;

    private int sexo;

    public Person(String nombres, String apellidos, int sexo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
}
