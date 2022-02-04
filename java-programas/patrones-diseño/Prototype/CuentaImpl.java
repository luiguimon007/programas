package Prototype;

public class CuentaImpl implements ICuenta{

    private String tipo;
    private double monto;

    public CuentaImpl(){
        tipo = "AHORRO";
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
    
    @Override
    public ICuenta clonar() {
        // TODO Auto-generated method stub
        CuentaImpl cuenta = null;
        try{
            cuenta = (CuentaImpl) clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return cuenta;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "CuentaImpl [tipo=" + tipo + ", monto=" + monto +"]";
    }
    
    
}
