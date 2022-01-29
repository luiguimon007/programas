import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int matriz1[][], matriz2[][];

            matriz1 = new int[5][9];
            matriz2 = new int[9][5];

            System.out.println("Digite la matriz: ");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print("Matriz[" + i + "][" + j + "]");
                    matriz1[i][j] = entrada.nextInt();
                }
            }

            System.out.println("La matriz origina es: ");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(matriz1[i][j] + "");
                }
                System.out.println("");
            }
        }
    }
}
