import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int total =0;
            for (int i = 0; i < 10; i++) {
                int numero =scanner.nextInt();
                total += numero;
            }  
            System.out.println(total);
        }      
    }
}
