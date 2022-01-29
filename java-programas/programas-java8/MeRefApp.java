import java.util.Arrays;
import java.util.Comparator;

public class MeRefApp {
    public static void main(String[] args) {
        MeRefApp app = new MeRefApp();
       // app.operar();
        //app.referenciaMetodoInstanciaObjetoArbitrario();
        //Operacion op = app::referenciaMetodoInstanciaObjetoParticular;
        app.refenciarConstructor();
    }
    public static void referenciarMetodoStatic(){
        System.out.println("Método referido static");
    }
    public void referenciaMetodoInstanciaObjetoArbitrario(){
        String[] nombres = {"Mito","Code","Jaime"};
        /*Arrays.sort(nombres,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2);
            }
        });*/
        //Arrays.sort(nombres,(s1,s2) -> s1.compareTo(s2));
        //System.out.println(Arrays.toString(nombres));
        Arrays.sort(nombres,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));
    }
    public void referenciarMetodoInstanciaObjetoParticular(){
        System.out.println("Método Referido Instancia de Objeto  en particular");
    }
    public void refenciarConstructor(){
        /*IPersona iper = new IPersona(){
            @Override
            public Persona crear(int id, String nombre) {
                // TODO Auto-generated method stub
                return new Persona(id, nombre);
            }
        };
        iper.crear(1,"Mitocode");*/
        /*IPersona iper = (x,y) ->(new Persona(x,y));
        Persona per  = iper.crear(1,"Mitocode");
        System.out.println(per.getId()+ " - "+per.getNombre()); */

        IPersona iper  = Persona::new;
        Persona per = iper.crear(1,"Mitocode");
        System.out.println(per.getId()+" - "+per.getNombre());
        
    }

    public void operar(){
        /*Operacion operacion = () -> MeRefApp.referenciarMetodoStatic();
        operacion.saludar();*/
        OperacionB operacion = MeRefApp::referenciarMetodoStatic;
        operacion.saludar();
    }
}
