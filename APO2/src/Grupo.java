public class Grupo {

    private String nombre;
    private Estudiante primero;

    public Grupo(String nombre){
        this.nombre = nombre;
    };

    public Estudiante add(String codigo, String nombre){
        Estudiante estudiante = new Estudiante(codigo, nombre);
        if (primero==null) primero = estudiante;
        else {
            Estudiante pointer = primero;
            while(pointer.getSiguiente()!=null){
                pointer = pointer.getSiguiente();
            };
            pointer.setSiguiente(estudiante);
        }
        return estudiante;
    }

    public String getNombre(Estudiante pointer, String codigo) {
        if (pointer == null) {
            return "No se encontró";
        }
        else if (pointer.getCodigo() == codigo){
            return pointer.getNombre();
        }
        else
            return getNombre(pointer.getSiguiente(), codigo);
    }

    public void print(){
        Estudiante pointer = primero;
        while(pointer!=null){
            System.out.println(pointer.getNombre());
            pointer = pointer.getSiguiente();
        };
    }
    public void printR(Estudiante pointer){
        if (pointer != null) {
            System.out.println(pointer.getNombre());
            printR(pointer.getSiguiente());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante getPrimero() {
        return primero;
    }

    public void setPrimero(Estudiante primero) {
        this.primero = primero;
    }
}
