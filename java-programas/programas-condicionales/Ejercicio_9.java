import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int dia,mes,año;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el dia el mes y el año");
        dia =scanner.nextInt();
        mes =scanner.nextInt();
        año =scanner.nextInt();

        if((dia>=1) && (dia<=30)){
            if((mes>=1) && (mes<=30)){
                if(año !=0){
                    System.out.println("Fecha correcta");
                }else{
                    System.out.println("año incorrecto");
                }
            }else{
                System.out.println("Fecha incorrecta,mes incorrecto");
            }
        }else{
            System.out.println("Fecha incorrecta,dia incorrecto");
        }
    }
}
