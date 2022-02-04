package Decorator;

public class CuentaCorriente  implements ICuentaBancaria{

    @Override
    public void abrirCuenta(Cuenta c) {
        // TODO Auto-generated method stub
        System.out.println("Se abrio una cuenta corriente");
        System.out.println("Cliente: " + c.getCliente());
    }
    
}
