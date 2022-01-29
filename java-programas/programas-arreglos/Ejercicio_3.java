import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] numeros = new float[5];
        int p = 0, n = 0, z = 0;
        float media_p = 0, media_n = 0;
        System.out.println("Ingreso de números");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Ingrese un número: ");
            numeros[i] = scan.nextFloat();
            if (numeros[i] < 0) {
                n++;
                media_n += numeros[i];
            } else if (numeros[i] > 0) {
                p++;
                media_p += numeros[i];
            } else {
                z++;
            }
        }
        System.out.println("Impresión");
        if (p == 0) {
            System.out.println("No hay positivos");
        } else {
            media_p /= p;
            System.out.println("La media de los N° positivos es: " + media_p);
        }
        if (n == 0) {
            System.out.println("No hay negativos");
        } else {
            media_n /= n;
            System.out.println("La media de los N° negativos es: " + media_n);
        }
        System.out.println("La cantidad de ceros es: " + z);
    }

}
