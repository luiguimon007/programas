public class Sintaxis {
    
    public double probarSintaxis(){
        //Operacion operacion = (double x , double y) -> (x+y)/2;
        //Operacion operacion = (double x , double y) -> {return (x+y)/2;};
        Operacion operacion = ( x , y) -> (x+y)/2;
        return operacion.calcular(2, 3);
    }

    public static void main(String[] args) {
        Sintaxis s = new Sintaxis();
        System.out.println(s.probarSintaxis());
    }
}
