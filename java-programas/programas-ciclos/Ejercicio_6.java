import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int total = 0;

        while(numero!=0){
            total+=numero;
            numero = scanner.nextInt();
        }
        System.out.println("Suma total "+total);
    }
}
