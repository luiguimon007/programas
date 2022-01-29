import java.util.Scanner;

public class Ejercicio_5{
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            float participacion,examen1,examen2,examenFinal,nota;

            System.out.println("Digite la nota de participacion");
            participacion = entrada.nextFloat();
            System.out.println("Digite la nota del primer examen");
            examen1 = entrada.nextFloat();
            System.out.println("Digite la nota del segundo examen");
            examen2=entrada.nextFloat();
            System.out.println("Digite la nota del examen final");
            examenFinal = entrada.nextFloat();

            participacion*=0.10f;
            examen1*=0.25f;
            examen2*=0.25f;
            examenFinal*=0.40f;

            nota = participacion+examen1+examen2+examenFinal;

            System.out.println("La nota final es: "+nota);
        }
        
    }
}