import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero de 0 a 99 999");
        int num = scanner.nextInt();
        int cifras = String.valueOf(num).length();


        System.out.println("La cantidad de digitos es "+cifras);
    }
}
