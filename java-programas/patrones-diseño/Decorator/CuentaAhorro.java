package Decorator;

public class CuentaAhorro implements ICuentaBancaria{

    @Override
    public void abrirCuenta(Cuenta c) {
        // TODO Auto-generated method stub
        System.out.println("Se abrio una cuenta");
        System.out.println("Cliente: " + c.getCliente());
    }
    
}
