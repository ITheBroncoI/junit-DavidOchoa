public class DrazilAndDate {

    // Método que contiene la lógica para determinar si es posible llegar en s pasos
    public static String isPossible(int a, int b, int s) {
        int manhattanDistance = Math.abs(a) + Math.abs(b);
        if (s >= manhattanDistance && (s - manhattanDistance) % 2 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        // Leer los valores de entrada
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int s = Integer.parseInt(args[2]);

        // Imprimir el resultado de la función isPossible
        System.out.println(isPossible(a, b, s));
    }
}

