public class Ejercicio_6 {
    public static void main(String[] args) {
        double num = (Math.random()*10), num2 = (Math.random()*10);
        int exponente = 2;
        
        double a = Math.pow(num, exponente);
        double b = Math.pow(num2, exponente);
        
        double sumaCuadrados = a + b + (2*(a*b)); 
        
    
        System.out.println("La suma cuadratica es: " + sumaCuadrados);
    }    
}
