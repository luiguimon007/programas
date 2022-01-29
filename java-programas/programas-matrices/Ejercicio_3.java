import java.util.Arrays;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        int f;
        
        for (f=0 ; f < matriz.length ; f++){
            matriz[f][f]=1;                           
        }
        
        for (f=0 ; f < matriz.length ; f++){
            System.out.println(Arrays.toString(matriz[f]));
        }
    }    
}
