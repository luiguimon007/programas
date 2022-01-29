import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Digite la matriz");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(" "+i+" "+j);
                matriz[i][j] = scanner.nextInt();
            }
            
        }
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] =aux;
            }
        }
        System.out.println("La matriz traspuesta es: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
        }
        System.out.println();

    }
}
