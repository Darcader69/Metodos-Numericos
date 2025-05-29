public class Aprox3 {
    public static void main(String[] args) {
        double x0 = 0.5, tol = 1e-6;
        while (Math.abs(g(x0) - x0) > tol) {
            x0 = g(x0);
        }
        System.out.printf("Raíz ≈ %.6f%n", x0);
    }
    public static double g(double x) { return Math.cos(x); }
}
//
// Ejecución del programa
// Raíz ≈ 0.739085
//