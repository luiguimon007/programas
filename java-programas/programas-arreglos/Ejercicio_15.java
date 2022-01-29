import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float primer[] = new float[5];
        float segundo[] = new float [5];
        float tercer[] = new float [5];
        
        
        for(int j=0;j<3;j++){
            if(j==0){
               System.out.print("NOTAS PRIMER PARCIAL\n"); 
            }else{
                if(j==1){
                  System.out.print("NOTAS SEGUNDO PARCIAL\n");   
                }else{
                   System.out.print("NOTAS TERCER PARCIAL\n");    
                }
            }
            for(int i=0;i<5;i++){
            System.out.print("Alumno["+(i+1)+"]: ");
            if(j==0){
               primer[i]=entrada.nextFloat();
            }else{
                if(j==1){
                  segundo[i]=entrada.nextFloat();  
                }else{
                   tercer[i]=entrada.nextFloat();   
                }
            }
            
           }
        }
        float mediaPrimer=0,mediaSegundo=0,mediaTercer=0;
        for(int i=0;i<5;i++){
              mediaPrimer+=primer[i];
              mediaSegundo+=segundo[i];
              mediaTercer+=tercer[i];
        }
        int posi;
        do{
           System.out.print("Ingrese la posicion del alumno[1-5]: ");
           posi=entrada.nextInt(); 
        }while(posi<1 || posi>6);
        
        float media=(primer[posi-1]+segundo[posi-1]+tercer[posi-1])/3;
        
        System.out.println("La media del Primer parcial es: "+mediaPrimer/5);
        System.out.println("La media del Segundo parcial es: "+mediaSegundo/5);
        System.out.println("La media del Tecer parcial es: "+mediaTercer/5);
        System.out.println("La media del Alumno es: "+media);
            
       

    }
}
