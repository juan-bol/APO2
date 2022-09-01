public class Main {

    public static void main(String[] args) {
        ABB arbol = new ABB();
        arbol.insertar(6);
        arbol.insertar(10);
        arbol.insertar(8);
        arbol.insertar(7);
        arbol.insertar(9);
        arbol.insertar(20);
        arbol.insertar(25);
        arbol.insertar(15);
        arbol.insertar(12);
        arbol.insertar(16);


        arbol.delete(10);
        arbol.inorden();
    }
}