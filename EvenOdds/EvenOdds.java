import java.util.Scanner;

public class EvenOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        scanner.close();

        // Llamamos al método que contiene la lógica y mostramos el resultado
        System.out.println(findNumberAtPosition(n, k));
    }

    // Método separado para la lógica principal, para facilitar las pruebas
    public static long findNumberAtPosition(long n, long k) {
        long oddCount = (n + 1) / 2;
        if (k <= oddCount) {
            return 2 * k - 1;
        } else {
            return 2 * (k - oddCount);
        }
    }
}

