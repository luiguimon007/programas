import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_4 {
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        llenarPoligono();
        mostrarResultados();
    }
    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do{
            do{
                System.out.println("Digite el poligono que desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                opcion = scanner.nextInt();

            }while(opcion < 1 ||opcion > 2);
            switch(opcion){
                case 1:
                    llenarTriangulo();
                    break;
                case  2:
                    llenarRectangulo();
                    break;
                    
            }
            System.out.println("Desea introducir otro poligono");
            respuesta = scanner.next().charAt(0);
            System.out.println();
        }while(respuesta == 's' || respuesta == 'S');
    }
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.println("Introduzca los valores del triangulo");
        lado1 = scanner.nextDouble();
        lado2 = scanner.nextDouble();
        lado3 = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        poligonos.add(triangulo);
    }
    public static void llenarRectangulo(){
        double lado1,lado2;
        System.out.println("Introduzca los valores del triangulo");
        lado1 = scanner.nextDouble();
        lado2 = scanner.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        poligonos.add(rectangulo);
    }
    public static void mostrarResultados(){
        for(Poligono poligono :poligonos){
            System.out.println(poligono.toString());
            System.out.println("El area del poligono es: "+poligono.area());
        }
    }

    public static abstract class Poligono{
        protected int numeroLados;

        Poligono(){

        }
        public Poligono(int numeroLados){
            this.numeroLados = numeroLados;
        }
        public int getNumeroLados() {
            return numeroLados;
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Poligono("+" lados: "+numeroLados+")";
        }
        public abstract double area();
    }
    public static class Rectangulo extends Poligono{
        private double lado1;
        private double lado2;

        Rectangulo(double lado1, double lado2){
            super(2);
            this.lado1 = lado1;
            this.lado2 = lado2;
        }

        public double getLado1() {
            return lado1;
        }
        public double getLado2() {
            return lado2;
        }

        @Override
        public double area() {
            
            return lado1*lado2;
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Rectangulo: \n"+super.toString()+ "\nlado1 "+lado1+" lado2 "+lado2;
        }
        
    }
    public static class Triangulo extends Poligono{
        private double lado1;
        private double lado2;
        private double lado3;

        Triangulo(double lado1, double lado2,double lado3){
            super(3);
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
       

        public double getLado1() {
            return lado1;
        }
        public double getLado2() {
            return lado2;
        }
        public double getLado3() {
            return lado3;
        }

        @Override
        public double area() {
            double p =(lado1+lado2+lado3)/2;
            return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Triangulo: \n"+super.toString()+ "\nlado1 "+lado1+" lado2 "+lado2+" lado3 "+lado3;
        }
        
    }
}
