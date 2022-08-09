import java.util.Arrays;

public class EjemplosRecursividad {
    public static void main(String[] args) throws Exception {

        System.out.println(factorialIterativo(4));

        System.out.println(factorialRecursivo(4));
        
        // int[] array={2,4,6,8,10};

        // int elementoBuscar=8;
        // System.out.println(posicionElementoRecursivo(array, elementoBuscar,0));

        // System.out.println(sumarArreglo(array));

        // int posicion = 3;
        // System.out.println(fibonacciRecursivo(posicion));

        // String palabra = "Hola";
        // System.out.println(invertirPalabra(palabra, palabra.length()-1));

    }

    public static double factorialIterativo(int n){
        double fact=1;
        int i;
        if (n==0){
            fact=1;
        }else{
            for(i=1;i<=n;i++){                                                                                        
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
