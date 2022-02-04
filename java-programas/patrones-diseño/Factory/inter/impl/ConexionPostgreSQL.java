package Factory.inter.impl;

import Factory.inter.IConexion;

public class ConexionPostgreSQL implements IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;

    public ConexionPostgreSQL(){
        this.host = "localhost";
        this.puerto = "5433";
        this.usuario = "postgres";
        this.contraseña = "123";
    }

    @Override
    public void conectar() {
        // TODO Auto-generated method stub
        System.out.println("Se conectó a PostgreSQL");
    }

    @Override
    public void desconectar() {
        // TODO Auto-generated method stub
        System.out.println("Se desconecto de PostgreSQL");
    }

    @Override
    public String toString() {
        return "ConexionMySQL [host=" + host + ",puerto=" + puerto + ",usuario=" + usuario + ",contraseña="+ contraseña + "]";
    }
}
