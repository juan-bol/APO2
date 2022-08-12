import java.util.Arrays;
import java.util.ArrayList;


public class EjemplosRecursividad {
    public static void main(String[] args) throws Exception {

        // System.out.println(factorialIterativo(4));

        // System.out.println(factorialRecursivo(4));
        
        // int[] array={2,4,6,8,10};

        // int elementoBuscar=8;
        // System.out.println(posicionElementoRecursivo(array, elementoBuscar,0));

        // System.out.println(sumarArreglo(array));

        // int posicion = 3;
        // System.out.println(fibonacciRecursivo(posicion));

        // String palabra = "Hola";
        // System.out.println(invertirPalabra(palabra, palabra.length()-1));
        
        int[] objetos = new int[]{70,20,50,50};

        ArrayList<Integer> res = fun(objetos, new ArrayList<>(), 100);

        if (res == null) {
            System.out.println("No hay solución");
        } else {
            System.out.println("--->");
            for (int num : res) {
                System.out.println(num);
            }
            System.out.println("<---");
        }

    }

    public static ArrayList<Integer> fun(int[] objetos, ArrayList<Integer> selectedObjects, int pesoRestante) {
        //Condiciones base

        //Si ya se acabaron los objeto
        if (objetos.length == 0) {
            return null;
        }

        //Si el peso de la maleta es cero exactamente
        if (pesoRestante == 0) {
            return selectedObjects;
        }

        //Si los objetos que se metieron en la maleta pesan más que la capacidad de la maleta
        if (pesoRestante < 0) {
            return null;
        }

        //Operación + llamado recursivo
        int nuevoPeso = pesoRestante - objetos[0];
        selectedObjects.add(objetos[0]);
        //Arrays.copyOfRange, permite crear un nuevo arreglo seleccionando un rango
        //Específicamente, lo que se está haciendo es eliminar el primer elemento del arreglo


        if(nuevoPeso == 0){
            return selectedObjects;
        }else{
            ArrayList<Integer> res = fun(Arrays.copyOfRange(objetos, 1, objetos.length), selectedObjects, nuevoPeso);
            //Si lo que retorna el algorimo recursivo es diferente de nulo, es porque se encontró una solución posible
            if (res != null) {
                return res;
            }
            //Si lo que retorna el algoritmo recursivo es nulo, es porque no encontró una solición posible
            //entonces se remueve el último objeto insertado a la maleta y se prueba con el siguiente.
            else {
                selectedObjects.remove(selectedObjects.size() - 1);
                return fun(Arrays.copyOfRange(objetos, 1, objetos.length), selectedObjects, pesoRestante );
            }
        }

    }

    // In progress
    public static int maleta(ArrayList<Integer> objetos, int pesoRestante){

        //Si el peso de la maleta es cero exactamente
        if (pesoRestante == 0) {
            return 1;
        }

        //Si los objetos que se metieron en la maleta pesan más que la capacidad de la maleta o se acabaron los objetos
        if (pesoRestante <= 0) {
            return 0;
        }

        else {
            int sum = 0;
            for (int i = 0; i < objetos.size(); i++) {
                int objeto = objetos.get(i);
                int nuevoPeso = pesoRestante-objeto;
                objetos.remove(i);
                sum+= maleta(objetos, nuevoPeso);
            }
            return sum;
        }

    }

    public static double factorialIterativo(int n){
        double fact=1;
        if (n>0){
            for(int i=1;i<=n;i++){                                                                                        
                fact=fact*i;
            }
        }
        return fact;
    }

    public static double factorialRecursivo(int n){
        if (n==0){
            return 1;
        }else{
            return n*(factorialRecursivo(n-1));                                                                                
        }
    }

    public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
 
        if(indice==array.length){
            return -1; 
        }else if(array[indice]==elementoBuscar){
            return indice;
        }
        else{
             return posicionElementoRecursivo(array, elementoBuscar, indice+1);
         }
    }

    public static int sumarArreglo(int[] array){
        if (array.length == 1) {
            return array[0];
        }
        return array[0] + sumarArreglo(Arrays.copyOfRange(array, 1, array.length));
    }

    public static int fibonacciRecursivo(int n) {
 
        //CASO BASE, si es cero devuelve un cero
        //Puedes poner n&lt;=0 tamvien para incluir negativos
        if (n == 0) {
            return 0;
        //CASO BASE, si es 1 devuelve un 1    
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

    public static String invertirPalabra(String palabra, int longitud){
         
        if(longitud==0){
            return palabra.charAt(longitud)+"";
        }else{
            return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
        }
         
    }


}
