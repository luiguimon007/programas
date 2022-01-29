import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            boolean result = true;
            for(int i = 0; i < 10; i++) {
                numero = scanner.nextInt();
                if(numero < 0){
                    result = false;
                }
            }
            if(!result){
                System.out.println("Hay numeros negativos");
            }else{
                System.out.println("Todos los numeros son positivos");
            }
            
        }
        
    }
}
