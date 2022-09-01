public class ABB {
    private Nodo raiz;

    public ABB() {

    }

    public boolean existe(int busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(Nodo n, int busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDato() == busqueda) {
            return true;
        } else if (busqueda < n.getDato()) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }

    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }

    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    private Nodo delete(int dato, Nodo current){
        if(current == null){
            return null;
        }
        // encontramos el dato
        if(current.getDato() == dato){
            //1. Nodo Hoja
            if(current.getIzquierda() == null && current.getDerecha() == null){
                if(current == raiz){
                    raiz = null;
                }
                return null;
            }
            //2. Nodo solo hijo izquierdo
            else if (current.getDerecha() == null){
                return current.getIzquierda();
            }
            //3. Nodo solo hijo derecho
            else if(current.getIzquierda() == null){
                return current.getDerecha();
            }
            //4. Nodo con dos hijos
            else{
                Nodo sucesor = getSucesor(current.getDerecha());
                //Transferencia de valores, NUNCA de conexiones
                current.setDato(sucesor.getDato());
                //Hacer eliminación a partir de la derecha
                Nodo subarbolDER = delete(sucesor.getDato(), current.getDerecha());
                current.setDerecha( subarbolDER );
                return current;
            }

        // avanzamos en el arbol buscando el dato
        }else if(dato < current.getDato()){
            Nodo subArbolIzquierdo = delete(dato, current.getIzquierda());
            current.setIzquierda(subArbolIzquierdo);
            return current;
        }else{
            Nodo subArbolDerecho = delete(dato, current.getDerecha());
            current.setDerecha(subArbolDerecho);
            return current;
        }
    }

    public Nodo getSucesor(Nodo current){
        if(current.getIzquierda() == null){
            return current;
        }
        return getSucesor(current.getIzquierda());
    }

    public Nodo delete(int goal){
        return delete(goal, raiz);
    }


    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }



}
