import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numero = new int[10];
            int val, pos;
            for (int i = 0; i < 8; i++) {
                numero[i] = scanner.nextInt();
            }
            System.out.print("\nInserta un numero: ");
            val = scanner.nextInt();
            System.out.print("Inserta posición: ");
            pos = scanner.nextInt();
            pos = pos - 1;
            for (int i = 8; i >= pos; i--) {
                numero[i + 1] = numero[i];
            }
            numero[pos] = val;

            for (int i : numero) {
                System.out.println(i);
            }

        }
    }
}
