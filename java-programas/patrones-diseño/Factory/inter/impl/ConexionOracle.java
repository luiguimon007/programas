package Factory.inter.impl;

import Factory.inter.IConexion;

public class ConexionOracle implements IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;

    public ConexionOracle(){
        this.host = "localhost";
        this.puerto = "1526";
        this.usuario = "admin";
        this.contraseña = "123";
    }

    @Override
    public void conectar() {
        // TODO Auto-generated method stub
        System.out.println("Se conectó a Oracle");
    }

    @Override
    public void desconectar() {
        // TODO Auto-generated method stub
        System.out.println("Se desconecto de Oracle");
    }

    @Override
    public String toString() {
        return "ConexionMySQL [host=" + host + ",puerto=" + puerto + ",usuario=" + usuario + ",contraseña="+ contraseña + "]";
    }
}
