import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[],b[],c[];
        a = new int[10];
        b = new int[10];
        c = new int[20];

        System.out.println("Digite el primer arreglo");
        for(int i=0; i<10; i++){
            System.out.println("Digite un numero");
            a[i] = scanner.nextInt();
        }
        System.out.println("Digite el segundo arreglo");
        for(int i=0; i<10; i++){
            System.out.println("Digite un numero");
            b[i] = scanner.nextInt();
        }
        int j=0;
        for(int i=0; i<10; i++){
            c[j++] = a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        System.out.println("El tercer arreglo es");

        for(int i=0; i<20; i++){
            System.out.print(c[i]+" ");
        }

        System.out.println(""); 
    }
}
