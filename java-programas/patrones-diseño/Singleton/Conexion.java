package Singleton;
//una sola instancia

public class Conexion {
    private static Conexion instancia;

    private Conexion(){

    }
    public static Conexion getInstancia(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    public void conectar(){
        System.out.println("Me conecte a la BD");
    }
    public void desconectar(){
        System.out.println("Me desconecte ");
    }
    public static void main(String[] args) {
        Conexion instancia = new Conexion();
        instancia.conectar();
        instancia.desconectar();

        boolean res = instancia instanceof Conexion;
        System.out.println(res);
    }
}
