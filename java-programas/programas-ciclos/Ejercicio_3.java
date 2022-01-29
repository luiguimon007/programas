import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = scanner.nextInt();
            while(numero!=0){

                if(numero %2 ==0 ){
                    System.out.println("Numero par");
                }else if(numero%2 !=0){
                    System.out.println("Numero impar");
                }
                System.out.println("Introduce otro numero");
                numero = scanner.nextInt();
            }
        }
    }
}
