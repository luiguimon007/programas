package Factory.inter.impl;

import Factory.inter.IConexion;

public class ConexionVacia implements IConexion{

    @Override
    public void conectar() {
        // TODO Auto-generated method stub
        System.out.println("No se especifico proveedor");
    }

    @Override
    public void desconectar() {
        // TODO Auto-generated method stub
        System.out.println("No se especifico proveedor");
    }
    
}
