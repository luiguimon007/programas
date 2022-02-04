package Proxy;

public class AppProxy {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "mitocode", 100);
		
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
    }
}
