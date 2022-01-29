import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int arreglo[] = new int[10];
            boolean creciente = false;
            boolean decreciente = false;
    
            System.out.println("Llenar arreglo");
            for(int i=0; i<arreglo.length; i++) {
                System.out.println("Digite un numero");
                arreglo[i] = scanner.nextInt();
            }
            for(int i=0; i<arreglo.length; i++) {
                if(arreglo[i] < arreglo[i+1]){
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]){
                    decreciente = true;
                }
            }
            if(creciente == true && decreciente == false){
                System.out.println("El arreglo esta en forma crecicente");
        
            }else if(creciente == false && decreciente == true){
                System.out.println("El arreglo esta en forma decreciente");
            }else if(creciente == true && decreciente == true){
                System.out.println("El arreglo esta desordenado");
            }else{
                System.out.println("El arreglo tiene valores iguales");
            }
        }
    }

}
