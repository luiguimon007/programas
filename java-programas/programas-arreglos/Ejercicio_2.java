import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer[]numeros = new Integer[5];

            for(int i=0; i<numeros.length; i++){
                numeros[i] =scanner.nextInt();
            }
            System.out.println("Arreglo original"+Arrays.asList(numeros));
            System.out.println("Imprimir los valores");
            reverso(numeros);
        }
    }
    static void reverso(Integer myArray[]) { 
        Collections.reverse(Arrays.asList(myArray)); 
        System.out.println("Arreglo invertido:" + Arrays.asList(myArray)); 
    } 
 
}
