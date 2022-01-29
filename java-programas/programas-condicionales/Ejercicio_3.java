import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char letra;
            letra = scanner.next().charAt(0);
            if(Character.isUpperCase(letra)){
                System.out.println("Es una letra mayuscula");
            }else{
                System.out.println("Es una letra minuscula");
            }
        }
        
    }
}
