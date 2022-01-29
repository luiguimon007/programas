
import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int  arreglo[] = new int[10];
        
            int numero;
            for(int i = 0; i < arreglo.length; i++) {
                arreglo[i] = scanner.nextInt();
            }
            System.out.println("Introduce un numero ");
            numero = scanner.nextInt();
            rotate(arreglo,numero);
            for(int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i]+ " ");
            }
        }
        
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums , 0 , nums.length - k - 1);
        reverse(nums , nums.length - k , nums.length - 1);
        reverse(nums , 0 , nums.length - 1);
    }
    public static void reverse(int[] a , int start , int end) {
        while(start <= end) {
           int temp = a[start];
           a[start] = a[end];
           a[end] = temp;
           start++;
           end--;
        }
    }
}
