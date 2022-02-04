package Factory;

import Factory.inter.IConexion;

public class App {
    public static void main(String[] args) {
        ConexionFabrica fact_i = new ConexionFabrica();
        IConexion cx1 = fact_i.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconectar();

        IConexion cx2 = fact_i.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconectar();
    }
}
