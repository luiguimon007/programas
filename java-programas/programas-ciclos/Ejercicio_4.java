import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = scanner.nextInt();
            int contador = 0;
            while(numero>0){
                System.out.println("Introduce otro numero");
                numero = scanner.nextInt();
                contador++;
            }
            System.out.println("La cantidad de numeros introducidos son "+contador);
        }
    
    }
}
