import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int [] tabla1 = new int[10];
            int [] tabla2 = new int[10];
            int  ConP=0,  j=0;

            for (int i=0;i<10;i++){
            	System.out.println((i+1)+". Digite un numero para la tabla 1: ");
            	tabla1[i] = scanner.nextInt();
            	
            	if(tabla1[i]%2==0){
            		ConP++;
            	}		
            }
            
            for (int i=0;i<10;i++){
            	if(tabla1[i]%2==0){
            	    tabla2[j] = tabla1[i];
            	    j++;
            	}
            	else if(tabla1[i]%2!=0){	
            	    tabla2[ConP] = tabla1[i];
            	    ConP++;
            	}
            }

            for (int l=0;l<10;l++){
            	System.out.println(tabla2[l]);	
            }
        }
    }
}
