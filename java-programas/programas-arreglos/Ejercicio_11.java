import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int arreglo[] = new int[10];
            boolean creciente = true;
            int sitio_num=0,j=0;
            System.out.println("Llenar el arreglo");
            do{
                for(int i=0;i<5;i++){
                    System.out.println("Digite un numero");
                    arreglo[i] = scanner.nextInt();
                }
                for(int i=0;i<4;i++){
                    if(arreglo[i] < arreglo[i+1]){
                        creciente =true;
                    }if(arreglo[i] > arreglo[i+1]){
                        creciente =false;
                    }
                }
                if(creciente == false){
                    System.out.println("El arreglo no esta ordenado");
                }
            }while(creciente == false);
            System.out.println("Digite un eleento a insertar");
            int numero = scanner.nextInt();

            while(arreglo[j] < numero && j<5){
                sitio_num++;
                j++;
            }
            for(int i=4;i>=sitio_num;i--){
                arreglo[i+1] = arreglo[i];
            }
            arreglo[sitio_num] = numero;
            for(int i=0;i<6;i++){
                System.out.println(arreglo[i]+" ");
            }
        }
    }
}
