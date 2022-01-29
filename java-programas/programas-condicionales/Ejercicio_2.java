import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double numero1,numero2;

        System.out.println("Introduce 2 numeros");
        numero1 = scanner.nextDouble();
        numero2 = scanner.nextDouble();

        if(numero1 >numero2){
            System.out.println("El numero 1 es mayor");
        }else if(numero1 < numero2){
            System.out.println("El numero 2 es mayor");
        }else{
            System.out.println("Son iguales");
        }
    }
}
