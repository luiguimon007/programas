package Factory.inter.impl;

import Factory.inter.IConexion;

public class ConexionSQLServer implements IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;

    public ConexionSQLServer(){
        this.host = "localhost";
        this.puerto = "1433";
        this.usuario = "server";
        this.contraseña = "123";
    }

    @Override
    public void conectar() {
        // TODO Auto-generated method stub
        System.out.println("Se conectó a SQLServer");
    }

    @Override
    public void desconectar() {
        // TODO Auto-generated method stub
        System.out.println("Se desconecto de SQLServer");
    }

    @Override
    public String toString() {
        return "ConexionMySQL [host=" + host + ",puerto=" + puerto + ",usuario=" + usuario + ",contraseña="+ contraseña + "]";
    }
}
