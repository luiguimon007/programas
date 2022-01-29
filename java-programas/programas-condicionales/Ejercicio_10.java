import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int dia,mes,año;
            dia= scanner.nextInt();
            mes= scanner.nextInt();
            año= scanner.nextInt();

            if (dia>=1 && dia<=31){
                if (dia > 29 && mes==2){
                    System.out.println("Incorrecto el mes");
                }else if(mes >=1 && mes <=12){
                    if(año != 0){
                        System.out.println("Fecha correcta");
                    }else{
                        System.out.println("Fecha incorrecta");
                    }
                }else{
                    System.out.println("Mes incorrecto");
                }
            }else{
                System.out.println("Dia incorrecto");
            }
        }
        
        
    }
}
