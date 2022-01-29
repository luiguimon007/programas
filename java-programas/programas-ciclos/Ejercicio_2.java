import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        while(numero!=0){

            if(numero >0 ){
                System.out.println("Numero positivo");
            }else if(numero < 0){
                System.out.println("Numero negativo");
            }
            System.out.println("Introduce otro numero");
            numero = scanner.nextInt();
        }
    }
}
