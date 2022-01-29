import javax.swing.JOptionPane;

public class Ejercicio_14 {
    public static void main(String[] args) {
        int edad, suma_edad = 0;
        int contador_mayores18 = 0, contador_altura = 0;
        float suma_altura = 0, altura, media_edad, media_altura;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno " + i + " :"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del alumno" + i + " :"));
            suma_edad += edad;
            suma_altura += altura;
            if (edad > 18) {
                contador_mayores18++;
            }
            if (altura > 1.75) {
                contador_altura++;
            }

        }

        media_edad = (float) suma_edad / 5;
        media_altura = suma_altura / 5;

        System.out.println("La media de edad es: " + suma_edad);
        System.out.println("La media de altura es: " + suma_altura);
        System.out.println("La cantidad de alumnos mayores a 18 años es: " + contador_mayores18);
        System.out.println("La cantidad de alumnos que miden mas de 1.75 es: " + contador_altura);
    }
}
