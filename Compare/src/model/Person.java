package model;

public class Person implements Comparable<Person>{

    private String nombre;
    private int edad;
    private String ciudad;

    public Person(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public int compareTo(Person o) {
        int compareName = this.getNombre().compareTo(o.getNombre());
        if(compareName==0){
            int compareAge = this.getEdad() - o.getEdad();
            if(compareAge==0){
                int compareCity = this.getCiudad().compareTo(o.getCiudad());
                return compareCity;
            }
            else return compareAge;
        } else {
            return compareName;
        }
    }
}
