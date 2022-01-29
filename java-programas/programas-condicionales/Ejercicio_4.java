import java.util.Scanner;

public class Ejercicio_4 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Double compra;
            System.out.println("Cuál es el valor de su compra");
            compra = scanner.nextDouble();
            if(compra > 300){
                compra = compra - compra * .20;
            }
            System.out.println("El valor de su compra es "+compra);
        }
    }
}
