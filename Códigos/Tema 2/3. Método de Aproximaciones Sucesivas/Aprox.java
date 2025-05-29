public class Aprox {
    public static void main(String[] args) {
        double x0 = 1.5, tol = 1e-6;
        while (Math.abs(f(x0) - x0) > tol) {
            x0 = f(x0);
        }
        System.out.printf("Raíz ≈ %.6f%n", x0);
    }
    public static double f(double x) { return Math.sqrt(2 * x + 3); }
}
//
// Ejecución del programa
// Raíz ≈ 2.999999
//  