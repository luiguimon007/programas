import javax.swing.JOptionPane;

public class Ejercicio_18 {
    public static void main(String[] args) {
        int nota, aprob = 0, cond = 0, susp = 0, alum;
        alum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos"));
        for (int i = 1; i <= alum; i++) {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del alumno N° " + i));
            if (nota < 4&& nota>=0) {
                susp++;
            } else if (nota > 4 && nota<=10) {
                aprob++;
            } else if (nota==4){
                cond++;
            } else{
                JOptionPane.showMessageDialog(null, "Nota errónea, ingresar nota nuevamente.");
                i--;
            }
        }
        JOptionPane.showMessageDialog(null, "De los " + alum + " alumnos ingresados:\n"
                + "N° aprobados: " + aprob + "\nN° condicionales: " + cond + "\nN° suspensos: " + susp);
    }
}
