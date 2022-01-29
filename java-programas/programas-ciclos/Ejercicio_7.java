import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double numero = scanner.nextDouble();
            double total = 0;
            int contador = 0;
            while(numero >0){
                total += numero;
                contador++;
                numero = scanner.nextDouble();
            }
            System.out.println("Promedio "+total/contador);
        }
    }
}
