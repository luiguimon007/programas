package Prototype;
//clonar
public class AppPrototype {
    public static void main(String[] args) {
        CuentaImpl cuenta = new CuentaImpl();
        cuenta.setMonto(200);
        CuentaImpl cuentaClonada = (CuentaImpl) cuenta.clonar();
        if(cuentaClonada != null) {
            System.out.println(cuentaClonada);
        }
        System.out.println(cuentaClonada == cuenta);
    }
    
}
