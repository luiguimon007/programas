import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][],filas,columnas,sumaFilas,sumaCol;
        filas =scanner.nextInt();
        columnas = scanner.nextInt();
        matriz = new int[filas][columnas];
        System.out.println("Digite la matriz");

        for(int i=0; i< filas; i++) {
            for(int j=0;j<columnas; j++) {
                System.out.println(i +" "+j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("La matriz es");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<filas;i++){
            sumaFilas =0;
            for(int j=0;j<columnas; j++) {
                sumaFilas+=matriz[i][j];
            }
            System.out.print("La suma de las filas"+sumaFilas);
        }
        System.out.println();

        for(int i=0;i<filas;i++){
            sumaCol =0;
            for(int j=0;j<columnas; j++) {
                sumaCol+=matriz[i][j];
            }
            System.out.print("La suma de las columnas "+sumaCol);
        }
    }

}
