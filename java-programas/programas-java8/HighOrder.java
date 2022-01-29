import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighOrder {
    private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
	private Function<String, String> convertirMinusculas = x -> x.toLowerCase();

	public void imprimir(Function<String, String> funcion, String valor) {
		System.out.println(funcion.apply(valor));
	}
	
	public Function<String, String> mostrar(String mensaje) {
		return (String x) -> mensaje + x;
	}
	
	public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud, String cadena){
		//lista.stream().filter(this.establecerLogicaFiltro(longitud)).forEach(consumidor);
		lista.stream().filter(this.establecerLogicaFiltro(cadena)).forEach(consumidor);
	}
	
	public Predicate<String> establecerLogicaFiltro(int longitud){
		return texto -> texto.length() < longitud;
	}
	
	public Predicate<String> establecerLogicaFiltro(String cadena){
		return texto -> texto.contains(cadena);
	}
	static <T,R>R ifThenElse(boolean predicate,Function<T,R> onTrue,Function<T,R> onFalse,T t){
        return(predicate ? onTrue.apply(t):onFalse.apply(t));
    }	

	public static void main(String[] args) {
		HighOrder app = new HighOrder();
		app.imprimir(app.convertirMayusculas, "mitocode");
		app.imprimir(app.convertirMinusculas, "MITOCODE");
		
		String rpta = app.mostrar("Hola ").apply("MitoCode");
		System.out.println(rpta);
		
		List<String> lista = new ArrayList<>();
		lista.add("Mito");
		lista.add("Code");
		lista.add("MitoCode");
		
		//app.filtrar(lista, System.out::println, 5, null);
		app.filtrar(lista, System.out::println, 0, "Code");
		Function<Integer,Integer> f = new Function<Integer,Integer>() {

            @Override
            public Integer apply(Integer t) {
                // TODO Auto-generated method stub
                return new Integer[]{ 31,28,31,30,31,30,31,31,30,31,30,31}[t];
            }

        };
        Function<Integer,Integer> square =new Function<Integer,Integer>(){
            @Override
            public Integer apply(Integer t) {
                // TODO Auto-generated method stub
                System.out.println("In square");
                return t*t;
            }
        };
        Function<Integer,Integer> cube =new Function<Integer,Integer>(){
            @Override
            public Integer apply(Integer t) {
                // TODO Auto-generated method stub
                System.out.println("In cube");
                return t*t*t;
            }
        };
        System.out.printf("%d%n",ifThenElse(true,square,cube,4));
        System.out.printf("%d%n",ifThenElse(false,square,cube,4));
		
	}
}
