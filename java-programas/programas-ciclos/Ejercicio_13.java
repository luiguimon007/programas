import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sueldo=0,total =0,contador =0;
            for(int i=0; i<10; i++){
                sueldo = scanner.nextInt();
                total += sueldo;
                if(sueldo >1000){
                    contador++;
                }
            }
            System.out.println("Total "+total+" "+contador );
        }
    }
}
