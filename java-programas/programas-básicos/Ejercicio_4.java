import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Ejercicio_4{
    private static final Integer salario = 1000;
    private static final Double comisionCarro = 150D;
    private static final Double valorCarro = 0.05;
    private static List<Carro> coches = new ArrayList<Carro>();

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("App de salarios");
        Empleado empleado = new Empleado();
        Carro coche = new Carro();
        System.out.println("Introduce el nombre del Empleado");
        empleado.setNombre(scanner.nextLine());
        System.out.println("Introduce el numero de Coches");
        empleado.setCantidadAutosVendidos(scanner.nextInt());
        //System.out.println("Llenado de coches: "+empleado.getNombre()+" "+empleado.getCantidadAutosVendidos());
        coche.llenarCoches(empleado.getCantidadAutosVendidos());
        empleado.SalarioTotal(coches); 
        System.out.println("El empleado "+empleado.toString());
    }

    static class Empleado{
        private String nombre ="";
        private Integer cantidadAutosVendidos;
        private Double SalarioTotalMes;
        Carro coche = new Carro();
        Empleado(String nombre,Integer cantidadAutosVendidos){
            this.nombre = nombre;
            this.cantidadAutosVendidos = cantidadAutosVendidos;
        }
        Empleado(){

        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setCantidadAutosVendidos(Integer cantidadAutosVendidos) {
            this.cantidadAutosVendidos = cantidadAutosVendidos;
        }
        public void setSalarioTotalMes(Double salarioTotalMes) {
            SalarioTotalMes = salarioTotalMes;
        }
        public String getNombre() {
            return nombre;
        }
        public Integer getCantidadAutosVendidos() {
            return cantidadAutosVendidos;
        }
        public Double getSalarioTotalMes() {
            return SalarioTotalMes;
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return nombre+" vendio una cantidad de "+cantidadAutosVendidos+" carros este mes y su salario mensual de este mes es: "+SalarioTotalMes;
        }

        public void SalarioTotal(List<Carro>listCoche){
            Double dineroCoche= 0.0;
            Double dineroComision= 0.0;
            Double salarioT= 0.0;
            for(Carro coche:listCoche){
                dineroCoche+= coche.getPrecio()*valorCarro;
            }
            dineroComision= comisionCarro * getCantidadAutosVendidos();
            salarioT=dineroComision+dineroCoche+salario;
            //System.out.println(salarioT);
            
            setSalarioTotalMes(salarioT);
        }
    }

    static class Carro{
        private Double precio;
        private String nombre;

        public Double getPrecio() {
            return precio;
        }
        public void setPrecio(Double precio) {
            this.precio = precio;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        Carro(String nombre ,Double precio){
            this.nombre = nombre;
            this.precio = precio;
        }
        Carro(){

        }
        
        public void llenarCoches(Integer cantidad){
            
            try{ 
                for(int index = 0; index < cantidad; index++){ 
                    Carro carro = new Carro();
                    System.out.println("Introduce el precio del coche");
                    precio = scanner.nextDouble();
                    carro.setPrecio(precio);
                    System.out.println("Introduce el nombre del coche");
                    nombre =  scanner.next();
                    carro.setNombre(nombre);
                    coches.add(carro);
                    
                }
                
            }catch(Exception e){
                System.err.println("Error "+e.getStackTrace());
            }
            
        }

         
    }
}