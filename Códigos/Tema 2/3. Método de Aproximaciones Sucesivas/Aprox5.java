public class Aprox5 {
    public static void main(String[] args) {
        double x0 = 0.5, tol = 1e-5;
        while (Math.abs(g(x0) - x0) > tol) {
            x0 = g(x0);
        }
        System.out.printf("Raíz ≈ %.6f%n", x0);
    }
    public static double g(double x) { return Math.exp(-x); }
}
//
// Ejecución del programa
// Raíz ≈ 0.567143
//