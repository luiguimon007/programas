import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = scanner.nextInt();
            System.out.println("Tabla del "+numero);
            for(int i=1; i<=10;i++){
                System.out.println(numero+" x "+i+" = " +numero *i);
            }
        }
    }
}
