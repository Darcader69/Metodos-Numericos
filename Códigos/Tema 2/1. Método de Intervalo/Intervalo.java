public class Intervalo {
    public static void main(String[] args) {
        double a = -2, b = 2, paso = 0.5;
        for (double x = a; x <= b; x += paso) {
            if (f(x) * f(x + paso) <= 0) {
                System.out.printf("Raíz en [%.2f, %.2f]%n", x, x + paso);
            }
        }
    }
    public static double f(double x) { return x * x - 2; }
}
//
// Ejecución del programa
// Raíz en [-1.50, -1.00]
// Raíz en [-0.50, 0.00]
// Raíz en [0.00, 0.50]
// Raíz en [1.00, 1.50]
// Raíz en [1.50, 2.00]
//