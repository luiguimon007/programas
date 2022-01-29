import java.util.Scanner;

public class Ejercicio_7 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int horasTotales,semanas,dias,horas;
            System.out.println("Introduzca el numero de horas");
            horasTotales = scanner.nextInt();
            semanas = horasTotales/168;
            dias = horasTotales%168 /24;
            horas = horasTotales %24;

            System.out.println("El equivalente es: ");
            System.out.println("Semanas "+semanas);
            System.out.println("Dias "+dias);
            System.out.println("Horas: "+horas);
        } 
    }
}
