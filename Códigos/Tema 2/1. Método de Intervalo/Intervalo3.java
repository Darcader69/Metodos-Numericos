public class Intervalo3 {
    public static void main(String[] args) {
        double a = 1, b = 4, paso = 0.1;
        for (double x = a; x <= b; x += paso) {
            if (f(x) * f(x + paso) <= 0) {
                System.out.printf("Raíz en [%.2f, %.2f]%n", x, x + paso);
            }
        }
    }
    public static double f(double x) { return Math.log(x) - 1; }
}
//
// Ejecución del programa
// Raíz en [1.00, 1.10]
//
