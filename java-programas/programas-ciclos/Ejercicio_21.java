import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            boolean result = true;
            for(int i = 0; i < 5; i++) {
                numero = scanner.nextInt();
                if(numero <= 5){
                    result = false;
                }
            }
            if(!result){
                System.out.println("Hay alumnos suspendidos");
            }else{
                System.out.println("Todos los alumnos fueron aprobados");
            }
            
        }
    }
}
