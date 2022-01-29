import java.util.Scanner;

public class Ejercicio_4{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int i,j;
            int numeros[] = new int[10];
            System.out.println("Ingreso de numeros");
            for (int x=0; x<10;x++){
                System.out.print((x+1)+". Ingrese un numero: ");
                numeros[x]=scn.nextInt();
            }
            System.out.println("\nImprimiendo numeros del array");
            for (i=0,j=9;i<j;i++,j--){
                if (i<j){
                    System.out.println((i+1)+". Numero: "+numeros[i]);
                    System.out.println((j+1)+". Numero: "+numeros[j]);
                }
            }
        }

    }
}