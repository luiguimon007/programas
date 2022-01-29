import java.util.Scanner;


public class Ejercicio_8 {
    private static double a;
    private static double b;
    private static double c;
    public static void main(String[] args) {
        System.out.println("Ingrese los valores a, b y c de la ecuacion: ");
        try (Scanner reader = new Scanner(System.in)) {
            a = reader.nextDouble();
            b = reader.nextDouble();
            c = reader.nextDouble();
        }
        calcularEcuacionesSegundoGrado(a,b,c);
    }

    public static void calcularEcuacionesSegundoGrado(double a, double b, double c){
        
        if (a == 0) {
            System.out.println("El valor de a no puede ser igual a cero%n");
        } else {
            double discriminante = Math.pow(b, 2) - 4 * a * c;
            if (discriminante >= 0) {
                if (discriminante == 0) {
                    double x = -b / (2 * a);
                    System.out.printf("La raiz unica es %.3f%n", x);
                } else {
                    double x1, x2;
                    x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                    System.out.printf("La raiz real x1 es %.3f%n", x1);
                    System.out.printf("La raiz real x2 es %.3f%n", x2);
                }
            } else {
                double parteReal, parteImaginaria;
                discriminante = Math.abs(discriminante);
                parteReal = -b / (2 * a);
                parteImaginaria = Math.sqrt(discriminante) / (2 * a);
                System.out.printf("La raiz compleja x1 es %.3f + %.3fi%n", parteReal, parteImaginaria);
                System.out.printf("La raiz compleja x2 es %.3f - %.3fi%n", parteReal, parteImaginaria);
            }
        }
    }
}
