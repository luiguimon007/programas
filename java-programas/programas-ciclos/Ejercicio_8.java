import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero =scanner.nextInt();

            for(int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        }
    }
}
