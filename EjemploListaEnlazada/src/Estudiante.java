public class Estudiante {

    private String codigo;
    private String nombre;

    private Estudiante siguiente;

    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Estudiante siguiente) {
        this.siguiente = siguiente;
    }
}
