import java.sql.Timestamp;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-4);
        numbers.add(22);
        numbers.add(-32);
        numbers.add(-2);
        numbers.add(-72);

        System.out.println("Unsorted array:");
        System.out.println(numbers);
        System.out.println("Bubble sort:");
        sortIntegerArrayBubble((ArrayList<Integer>) numbers.clone());
        System.out.println("Selection sort:");
        sortIntegerArraySelection((ArrayList<Integer>) numbers.clone());
        System.out.println("Insertion sort:");
        sortIntegerArrayInsertion((ArrayList<Integer>) numbers.clone());


        ArrayList<String> names = new ArrayList<>();
        names.add("Zapata");
        names.add("Arboleda");
        names.add("Arbelaez");
        names.add("Caicedo");
        names.add("Osorio");
        names.add("Martinez");
        names.add("Yustes");

        System.out.println("Unsorted names:");
        System.out.println(names);
        System.out.println("Bubble sort:");
        sortStringArrayBubble(names);


        // Check this https://www.youtube.com/watch?v=kPRA0W1kECg&ab_channel=Creel

    }

    private static void sortStringArrayBubble(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = 1; j < array.size()-i; j++) {
                if(array.get(j).compareTo(array.get(j-1))<0){
                    // get values to swap
                    String anterior = array.get(j-1);
                    String actual = array.get(j);
                    // swap
                    array.set(j,anterior);
                    array.set(j-1,actual);
                }
            }

        }
        System.out.println(array);
    }

    private static void sortIntegerArrayBubble(ArrayList<Integer> array){
        long startTime = System.nanoTime();
        for(int i = 0 ; i < array.size() ; i++) {
            for (int j = 1; j < array.size()-i; j++) {
                if(array.get(j) < array.get(j-1)){
                    // get values to swap
                    int anterior = array.get(j-1);
                    int actual = array.get(j);
                    // swap
                    array.set(j,anterior);
                    array.set(j-1,actual);
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000;
        System.out.println(duration+" ms");
        System.out.println(array);
    }

    private static void sortIntegerArraySelection(ArrayList<Integer> array){
        long startTime = System.nanoTime();
        for(int rojo = 0 ; rojo < array.size()-1 ; rojo++) {
            for (int azul = rojo+1; azul < array.size(); azul++) {
                if(array.get(rojo) > array.get(azul)){
                    // get values to swap
                    int valorRojo = array.get(rojo);
                    int valorAzul = array.get(azul);
                    // swap
                    array.set(rojo, valorAzul);
                    array.set(azul, valorRojo);
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000;
        System.out.println(duration+" ms");
        System.out.println(array);
    }

    private static void sortIntegerArrayInsertion(ArrayList<Integer> array) {
        long startTime = System.nanoTime();
        for (int rojo = 1; rojo < array.size(); rojo++) {
            int valorRojo = array.get(rojo);
            int verde = rojo-1;
            int valorVerde = array.get(verde);
            while ( verde > -1 && valorVerde > valorRojo ) {
                valorVerde = array.get(verde);
                array.set(verde+1,valorVerde);
                verde--;
            }
            array.set(verde+1,valorRojo);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000;
        System.out.println(duration+" ms");
        System.out.println(array);
    }

}