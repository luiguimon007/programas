import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n,sueldo,sueldo_maximo=0;
      
        System.out.println("Teclea la cantidad de Sueldos : ");
        n = entrada.nextFloat();
        
        for(int i=1;i<=n;i++){
            
            System.out.println("n:"+i+"\n Teclea tu Sueldo : ");
            sueldo = entrada.nextFloat();
            
            if(sueldo>sueldo_maximo){
                
                sueldo_maximo = sueldo;
                
            }
            
        }
        
        System.out.println("El Sueldo Maximo es : "+sueldo_maximo);
    }
    
}
