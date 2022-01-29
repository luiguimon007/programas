import java.util.Scanner;
import java.util.stream.LongStream;

public class Ejercicio_12 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = scanner.nextInt();
            long total = factorial(numero);

            System.out.println("Factorial "+total);
        }
    }
    public static long factorial(int n) {
        return LongStream.rangeClosed(1, n)
            .reduce(1, (long x, long y) -> x * y);
    }
}
