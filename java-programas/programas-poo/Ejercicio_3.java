import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Complejo numero = new Complejo(1.0,1.0);
            Complejo numero2 = new Complejo(2.0,2.0);
            Complejo numero3;

            numero3 =numero.suma(numero, numero2);
            System.out.println("La suma es"+numero3);

            numero3=numero.producto(numero, numero2);
            System.out.println("La multiplicacion es"+numero3);
            if (numero.equals(numero2)) {
                System.out.println(numero + " igual que " + numero2);
            } else {
                System.out.println(numero+ " distinto que " + numero2);
            }
        }
        
    }

    static class Complejo{
        private Double real;
        private Double imaginario;

        Complejo(Double real, Double imaginario){
            this.real = real;
            this.imaginario = imaginario;
        }
        Complejo(){
            real = 0.0;
            imaginario = 0.0;
        }
        public Complejo suma(Complejo complejo1,Complejo complejo2){
            double x = complejo1.real + complejo2.real;
            double y = complejo1.imaginario + complejo2.imaginario;
            return new Complejo(x, y);
        }
        public  Complejo producto(Complejo complejo1,Complejo complejo2){
            double x = complejo1.real * complejo2.real- complejo1.imaginario * complejo2.imaginario;
            double y = complejo1.real * complejo2.imaginario + complejo1.imaginario * complejo2.real;
            return new Complejo(x, y);
        }
        public Complejo producto(Complejo complejo,double numero){
            double x = complejo.real * numero;
            double y = complejo.imaginario *  numero;
            return new Complejo(x, y);
        }
        @Override
        public boolean equals(Object objeto){
            if(objeto==null){
                
                return false;
            }
            if(getClass() != objeto.getClass()){
                
                return false;
            }
            final Complejo otro = (Complejo) objeto;
            if(Double.compare(this.real,otro.real) !=0){
                return false;
            }
            if(Double.compare(this.imaginario,otro.imaginario) !=0){
                return false;
            }
            return true;
        }
        @Override
        public String toString() {
            return "(" + real + ", " + imaginario + ")";
        }
         
    }
    
}
