import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[]numeros = new float[5];

        for(int i=0; i<numeros.length; i++){
            numeros[i] =scanner.nextFloat();
        }
        System.out.println("Imprimir los valores");
        for(float num:numeros){
            System.out.println(num);
        }
    }
}