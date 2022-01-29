import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio_12 {
    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        float ingreso, saldoActual, retiro;
        int opcion = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
                + "1)Ingresa dinero a la cuenta\n"
                + "2)Retirar el dinero\n" + "3)Salir\n"));

        switch (opcion) {
            case 1:
                ingreso = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad"));
                saldoActual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta" + saldoActual);
                break;

            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad"));
                if (retiro > saldo_inicial) {
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente");
                } else {
                    saldoActual = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta" + saldoActual);
                }
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion equivocada");
        }

    }

}
