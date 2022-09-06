import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System .in );
        System.out.print("Introduzca el numerador: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduzca el denominador: ");
        int den = Integer.parseInt(scanner.nextLine());
        System.out.print("Resultado: ");
        System.out.println(dividirNoException(num,den));


//
//        boolean continuar = true;
//        while (continuar){
//            try{
//                System.out.print("Introduzca el numerador: ");
//                int num = Integer.parseInt(scanner.nextLine());
//                System.out.print("Introduzca el denominador: ");
//                int den = Integer.parseInt(scanner.nextLine());
//                System.out.print("Resultado: ");
//                System.out.println(dividir(num,den));
//                continuar=false;
//            }
//            catch (NumberFormatException exception){
//                System.out.println(exception);
//                System.out.println("Ingrese enteros");
//            }
//            catch (ArithmeticException exception){
//                System.out.println(exception);
//                System.out.println("Imposible dividir por cero");
//            }
//            catch (Exception exception){
//                System.out.println(exception);
//                System.out.println("Ingrese numeros validos");
//            }
//        }

//        try {
//            metodo1();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    public static double dividir(int num, int dem) throws Exception{
        return num/dem;
    }

    public static double dividirNoException(int num, int dem) {
        return num/dem;
    }

    public static void metodo1() throws Exception{
        try{
            metodo2();
        } catch (Exception e){
            throw new Exception("La excepcion se lanzo en metodo 1", e);
        }
    }
    public static void metodo2() throws Exception{
        try{
            metodo3();
        } catch (Exception e){
            throw new Exception("La excepcion se lanzo en metodo 2", e);
        }
    }
    public static void metodo3() throws Exception{
        throw new Exception("La excepcion se lanzo en metodo 3");
    }
}
