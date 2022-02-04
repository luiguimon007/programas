package Decorator;

public class BlindajeDecorador extends CuentaDecorador{

    public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        cuentaDecorada.abrirCuenta(c);
        
    }
    public void agregarBlindaje(Cuenta c) {
        System.out.println("Se agrego blindaje a la cuenta del cliente");
    }
    
}
