import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_5 {
    static Scanner entrada = new Scanner(System.in);
    static String nomEquipo;
    static int opc;
    static ArrayList<Persona> personas = new ArrayList<Persona>();

    public static void main(String[] args) {

        System.out.print("Digite el nombre del equipo:");
        nomEquipo = entrada.next();
        //menu();

    }
    
    public static abstract class Persona {
        protected String nombre;
        protected String apellido;
        protected Integer edad;

        Persona(String nombre, String apellido, Integer edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        Persona() {

        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public Integer getEdad() {
            return edad;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Persona" + nombre + " " + apellido + " " + edad;
        }
    }

    public static class Futbolista extends Persona {
        private Integer dorsal;
        private Integer posicion;

        Futbolista(Integer dorsal, Integer posicion) {
            super("Luis","López" , 27);
            this.dorsal = dorsal;
            this.posicion = posicion;
        }

        public Integer getDorsal() {
            return dorsal;
        }

        public Integer getPosicion() {
            return posicion;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Futbolista" + super.toString() + "tiene " + dorsal + "y su " + posicion;
        }
    }

    public static class Entrenador extends Persona {
        private String estrategia;

        Entrenador(String estrategia) {
            super("Luis", "López", 27);
            this.estrategia = estrategia;
        }

        Entrenador() {

        }

        public String getEstrategia() {
            return estrategia;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Entrenador" + super.toString() + " su estrategia " + estrategia;
        }

    }

    public static class Doctor extends Persona {
        private Integer añosExperiencia;
        private String titulacion;

        Doctor(String titulacion, Integer añosExperiencia) {
            this.titulacion = titulacion;
            this.añosExperiencia = añosExperiencia;
        }

        Doctor() {
        }

        public Integer getAñosExperiencia() {
            return añosExperiencia;
        }

        public String getTitulacion() {
            return titulacion;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Doctor" + super.toString() + "sus años de experiencia son: " + añosExperiencia + " y su "
                    + titulacion;
        }
    }

}
