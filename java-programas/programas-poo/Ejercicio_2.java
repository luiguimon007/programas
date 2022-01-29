import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int id, cuantos, indice = 0;
        double tiempo;
        String nombre;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuantos atletas son?: ");
        cuantos = entrada.nextInt();

        Atleta[] corredores = new Atleta[cuantos];

        //Guardar en un array los datos de los corredores
        System.out.println("\nIngrese los datos de los atletas");
        for (int i = 0; i < corredores.length; i++) {
            System.out.print("Ingrese el numero del atleta ");
            id = entrada.nextInt();
            System.out.print("Ingrese el nombre del atleta ");
            nombre = entrada.next();
            System.out.print("Ingrese el tiempo del atleta ");
            tiempo = entrada.nextDouble();

            corredores[i] = new Atleta(id, nombre, tiempo);
            System.out.println();
        }
        tiempo = corredores[0].getTiempo();
        for (int i = 1; i < corredores.length; i++) {
            if (corredores[i].getTiempo()<tiempo)
            {
                tiempo = corredores[i].getTiempo();
                indice = i;
            }
        }

        //Mostrar el mas rapido
        System.out.println("El corredor mas rapido es: ");
        System.out.println(corredores[indice].mostrardatos());

    }

    static class Atleta {
        private int numero;
        private String nombre;
        private double tiempo;
    
        //Constructor
        public Atleta(int numero, String nombre, double tiempo) {
            this.numero = numero;
            this.nombre = nombre;
            this.tiempo = tiempo;
        }
    
        //Getter de tiempo
        public double getTiempo() {
            return tiempo;
        }
        public void setTiempo(double tiempo) {
            this.tiempo = tiempo;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getNumero() {
            return numero;
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }
        //Mostrar datos
        public String mostrardatos(){
            return "Numero: "+numero+"\nNombre: "+nombre+"\nTiempo: "+tiempo;
        }
    }

}