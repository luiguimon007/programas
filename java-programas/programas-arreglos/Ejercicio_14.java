import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int arreglo[] = new int[3];
            int arreglo1[] = new int[3];
            int arreglo2[] = new int[6];
            int indice =0;
            System.out.println("Introduce el arreglo ");
            for (int i = 0; i < arreglo.length; i++){
                arreglo[i] = scanner.nextInt();
            }
            System.out.println("Introduce el arreglo ");
            for (int i = 0; i < arreglo1.length; i++){
                arreglo1[i] = scanner.nextInt();
            }
            for(int num:arreglo){
                arreglo2[indice] = num;
                ++indice;
            }
            for(int num:arreglo1){
                arreglo2[indice] =num;
                ++indice;
            }
            Arrays.sort(arreglo2);

            for(int i=arreglo2.length-1;i>=0;--i){
                System.out.println("Resultado "+arreglo2[i]);
            }
        }
    }
}
