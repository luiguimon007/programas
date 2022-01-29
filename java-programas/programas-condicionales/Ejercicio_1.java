import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = scanner.nextInt();

        if(numero %10 ==0){
            System.out.println("El numero es multiplo de 10");
        }else{
            System.out.println("El numero no es multiplo");
        }
    }

}