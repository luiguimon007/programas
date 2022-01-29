import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int arreglo[] = new int[10];
            int ultimo;

            System.out.println("Llenar arreglo");
            for(int i=0; i<10; i++) {
                System.out.println(i+"Digite un numero");
                arreglo[i] = scanner.nextInt();
            }
            ultimo = arreglo[9];
            for(int i=8;i>=0;i--){
                arreglo[i+1] = arreglo[i];
            }
            arreglo[0] = ultimo;
            System.out.println("El nuevo arreglo es");
            for(int i=0;i<=10;i++){
                System.out.println(i+"Numero: "+arreglo[i]);
            }
        }
    }
}
