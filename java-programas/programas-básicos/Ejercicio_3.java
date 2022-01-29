import java.util.Scanner;

public class Ejercicio_3{

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            float guillermo,luis,juan,total;
            System.out.println("Introduzca el dinero que tiene Guillermo");
            guillermo = scanner.nextFloat();
            luis = guillermo / 2;
            juan = (guillermo + luis) / 2;
            total = guillermo+luis+juan;

            System.out.println(total);
        }
        
        
    }
}