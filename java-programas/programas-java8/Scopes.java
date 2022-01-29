public class Scopes {
    private static double atributo1;
    private double atributo2;
    public double probarLocalVariable(){
        final double n3=3;
        Operacion operacion = new Operacion(){

            @Override
            public double calcular(double n1, double n2) {
                // TODO Auto-generated method stub
                //n3 = n1 +n2;
                return n1+n2+n3;
            } 
        };
        Operacion operacion2 = (x,y) -> {return x+y;};
        return operacion2.calcular(1,1);
    }
}
