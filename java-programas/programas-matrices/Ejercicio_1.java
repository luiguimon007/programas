import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[] args) {
        int[][] matriz1 = {
            {10, 5, 12},
            {98, 5, 6},
            {8, 4, 6},
        };
        int[][] matriz2 = {
            {8, 7, 5},
            {19, 56, 4},
            {8, 76, 90},
        };
        int [][]a = new int [3][3];
        sumarMatrices(matriz1, matriz2);
        
    }

    static void sumarMatrices(int[][] matriz1, int[][] matriz2) {
        // Primero hacer la suma
        int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];
        for (int y = 0; y < matriz1.length; y++) {
            for (int x = 0; x < matriz1[y].length; x++) {
                int numeroMatriz1 = matriz1[y][x];
                int numeroMatriz2 = matriz2[y][x];
                int suma = numeroMatriz1 + numeroMatriz2;
                matrizSuma[y][x] = suma;
            }
        }
        
        for (int y = 0; y < matriz1.length; y++) {
            for (int x = 0; x < matriz1[y].length; x++) {
                System.out.printf("%5d ", matriz1[y][x]);
            }
            System.out.print(" | ");

            for (int x = 0; x < matriz2[y].length; x++) {
                System.out.printf("%5d ", matriz2[y][x]);
            }
            System.out.print(" | ");

            for (int x = 0; x < matrizSuma[y].length; x++) {
                System.out.printf("%5d ", matrizSuma[y][x]);
            }
            System.out.print(" | ");
            System.out.println();
        }
    }
}