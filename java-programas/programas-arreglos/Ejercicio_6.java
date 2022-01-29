import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner (System.in)) {
            int numero1[], numero2[], contador1, contador2; 
            numero1 = new int [12];
            numero2 = new int [12];
            contador1 = 0;
            contador2 = 0;
            boolean verdad = false;
            
            
            System.out.println("Tabla 1");
            for(int i=0; i<12; i++){
                System.out.println((i+1)+" digite un numero");
                numero1[i] = leer.nextInt();
            } 
            System.out.println("SEGUNDA TABLA");
            for(int i=0; i<12; i++){
                System.out.println((i+1)+" DIGITE UN NUMERO");
                numero2[i] = leer.nextInt();
            }
      
            while(verdad == false){
                do{
                    System.out.print(numero1[contador1]+",");
                    contador1++;
                }while(contador1%3!=0);
                    System.out.print(" ");
                do{
                    System.out.print(numero2[contador2]+",");
                    contador2++;
                }while(contador2%3!=0);
                    System.out.print(" ");
                if(contador2==12){
                verdad=true;
                }
            }
        }

    }    
}
