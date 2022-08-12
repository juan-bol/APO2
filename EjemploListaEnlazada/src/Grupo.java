public class Grupo {

    private String nombre;
    private Estudiante primero;

    public Grupo(String nombre){
        this.nombre = nombre;
    };

    // Agrega un estudiante al final iterativamente
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

    // Agrega un estudiante al final recursivamente
    public Estudiante addR(Estudiante pointer, String codigo, String nombre){
        if (pointer == null){
            Estudiante estudiante = new Estudiante(codigo, nombre);
            if(primero==null) primero = estudiante;
            return estudiante;
        }
        else
            pointer.setSiguiente(addR(pointer.getSiguiente(), codigo, nombre));
        return pointer;
    }

    // Agrega un estudiante luego del estudiante con código afterWho iterativamente
    public String addRAfterCode(Estudiante pointer, String codigo, String nombre, String afterWho){
        Estudiante estudiante = new Estudiante(codigo, nombre);
        if(pointer == null){
            return "No se pude agregar por el estudiante con codigo "+afterWho+" no existe";
        }
        else if(pointer.getCodigo().equals(afterWho)){
            estudiante.setSiguiente(pointer.getSiguiente());
            pointer.setSiguiente(estudiante);
            return "Se agregó "+ codigo;
        }
        else {
            return addRAfterCode(pointer.getSiguiente(), codigo, nombre, afterWho);
        }
    }


    // Retorna el nombre de un estudiante de acuerdo a su codigo recursivamente
    public String getNombreR(Estudiante pointer, String codigo) {
        if (pointer == null) {
            return "No se encontró";
        }
        else if (pointer.getCodigo() == codigo){
            return pointer.getNombre();
        }
        else
            return getNombreR(pointer.getSiguiente(), codigo);
    }

    // Imprime el codigo de los estudiantes iterativamente
    public void print(){
        Estudiante pointer = primero;
        while(pointer!=null){
            System.out.println(pointer.getNombre());
            pointer = pointer.getSiguiente();
        };
    }

    // Imprime el codigo de los estudiantes recursivamente
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
