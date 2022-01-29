import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio_13 {
    public static void main(String[] args) {
        System.out.println("Sistema de conversion");
        int opcion,cantidad;
        double result;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1)Kilogramos-gramos\n"
        +"2)Kilogramos-libras\n"+"3)Kilogramos-miligramo\n"+"4)Salir"));
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los kg"));
        switch(opcion) {
            case 1:
                result = cantidad * 100;
                JOptionPane.showMessageDialog(null,"La cantidad de  gramos son: "+result);
                break;
            case 2:
                result = cantidad * 2.205;
                JOptionPane.showMessageDialog(null, "La cantidad de libras son: "+result);
                break;
            case 3:
                result = cantidad * 1000000;
                JOptionPane.showMessageDialog(null,"La cantidad de miligramos son: "+result);
                break;

            case 4:
                break;

            default:
                JOptionPane.showMessageDialog(null, "Error de elección");
        }
    }
}
