import javax.swing.JOptionPane;

public class Ejercicio_1 {
    public static void main(String[] args) {
        double numero,cuadrado;
        numero =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while(numero >=0){
            cuadrado = (int)Math.pow(numero,2);
            JOptionPane.showMessageDialog(null, "El numero "+numero+" y su cuadrado "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
    }
}
