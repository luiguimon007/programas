import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        int arreglo[] = new int[10];
        int pos;
        try (Scanner scanner = new Scanner(System.in)) {
            for(int i=0; i<9; i++) {
                arreglo[i] = scanner.nextInt();
            }
            System.out.println("Introduce la posicion");
            pos = scanner.nextInt();

            for(int i=pos;i<9;i++){
                arreglo[i] = arreglo[i+1];
            }
            System.out.println("El arreglo queda");
            for(int i=0;i<9;i++){
                System.out.println(arreglo[i]);
            }
        }
    }
}
