import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App{

    public void ordenar(){
        List<String> lista = new ArrayList<String>();
        lista.add("MitoCode");
        lista.add("Code");
        lista.add("Mito");
        /*Collections.sort(lista,new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2);
            }    
        });*/

        Collections.sort(lista,(String p1,String p2) -> p1.compareTo(p2));
        for (String o : lista) {
            System.out.println(o);
        }

    }

    public void calcular(){
        /*Operacion operacion = new Operacion(){

            @Override
            public double calcularPromedio(double n1, double n2) {
                // TODO Auto-generated method stub
                return (n1+n2)/2;
            }  
        };
        System.out.println(operacion.calcularPromedio(2, 3));*/

        Operacion operacion = (double X,double Y) -> (X+Y)/2;
        System.out.println(operacion.calcular(2,3));
    }
    public static void main(String[] args) {
        App app = new App();
        app.ordenar();
        app.calcular();
        /*() -> System.out.println("Hello Lambda");
            x-> x+10
            (int x,int y) -> {return x+y;}
            (String x,String y) -> x.length() -> y.length()

            (String x) -> {
                listA.add(x);
                listB.remove(x);
                return listB.size;
            }
            List<String> list = getList();
            String r = process(list,(x,y)-> x.length()-y.length());
        */
    }
}