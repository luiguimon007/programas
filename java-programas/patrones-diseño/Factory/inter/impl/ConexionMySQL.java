package Factory.inter.impl;

import Factory.inter.IConexion;

public class ConexionMySQL implements IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;

    public ConexionMySQL(){
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contraseña = "123";
    }

    @Override
    public void conectar() {
        // TODO Auto-generated method stub
        System.out.println("Se conectó a Mysql");
    }

    @Override
    public void desconectar() {
        // TODO Auto-generated method stub
        System.out.println("Se desconecto de Mysql");
    }

    @Override
    public String toString() {
        return "ConexionMySQL [host=" + host + ",puerto=" + puerto + ",usuario=" + usuario + ",contraseña="+ contraseña + "]";
    }
    
}
