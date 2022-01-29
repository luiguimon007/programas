import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int numero,contador =0;
        int aleatorio =0;
        aleatorio =(int)Math.random()*100;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Digite un numero");
            numero = scanner.nextInt();
            if(aleatorio > numero){
                System.out.println("Digite un numero mayor");
            }else{
                System.out.println("Digite un numero menor");
            }
            contador++;
        }while(numero!=aleatorio);
        
        System.out.println("Adivinaste el numero "+aleatorio+" "+contador);
    }
}
