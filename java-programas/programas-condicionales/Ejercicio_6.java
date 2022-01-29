import java.util.Scanner;

public class Ejercicio_6 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce 2 numeros");
            int numero = scanner.nextInt();
            int numero2 = scanner.nextInt();

            if(numero %2 == 0 & numero2 %2 == 0) {
                System.out.println("Son pares");
            }else if(numero %2 != 0 & numero2 %2 != 0) { 
                System.out.println("Son impares");
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
}
