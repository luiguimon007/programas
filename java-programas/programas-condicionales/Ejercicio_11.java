import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce una nota");
            int nota ;
            nota = scanner.nextInt();

            if(nota < 5){
                System.out.println("Insuficiente");
            }else if(nota == 6){
                System.out.println("Suficiente");
            }else if(nota ==7 || nota == 8){
                System.out.println("Bien");
            }else if(nota ==9){
                System.out.println("Notable");
            }else{
                System.out.println("Sobresaliente");
            }
        }
        
    }
}
