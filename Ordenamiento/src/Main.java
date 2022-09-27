import java.sql.Timestamp;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-4);
        numbers.add(22);
        numbers.add(40);
        numbers.add(-2);
        numbers.add(-80);
        numbers.add(-100);
        numbers.add(-120);
        numbers.add(-180);

        System.out.println(numbers);
        sortIntegerArrayBubble(numbers);
        sortIntegerArraySelection(numbers);


        ArrayList<String> names = new ArrayList<>();
        names.add("Zapata");
        names.add("Arboleda");
        names.add("Arbelaez");
        names.add("Caicedo");
        names.add("Osorio");
        names.add("Martinez");
        names.add("Yustes");

        System.out.println(names);
        sortStringArrayBubble(names);


        // Check this https://www.youtube.com/watch?v=kPRA0W1kECg&ab_channel=Creel

    }

    private static void sortStringArrayBubble(ArrayList<String> array) {
        long startTime = System.nanoTime();
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
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000;
        System.out.println(duration);
        System.out.println(array);
    }

    private static void sortIntegerArrayBubble(ArrayList<Integer> array){
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
        System.out.println(array);
    }

    private static void sortIntegerArraySelection(ArrayList<Integer> array){
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
        System.out.println(array);
    }
}