import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int horasTrabajadas = 0;
        float salarioTotal;
        Scanner scanner = new Scanner(System.in);
        horasTrabajadas = scanner.nextInt();

        if(horasTrabajadas <=40){
            salarioTotal =horasTrabajadas*16;
        }else{
            salarioTotal =(40*16)+((horasTrabajadas-40)*20);
        }
        System.out.println("Salario total es: "+salarioTotal);
    }
}
