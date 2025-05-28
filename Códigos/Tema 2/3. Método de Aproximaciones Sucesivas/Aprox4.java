public class Aprox4 {
    public static void main(String[] args) {
        double x0 = 2.0, tol = 1e-4;
        do { x0 = g(x0); } while (Math.abs(g(x0) - x0) > tol);
        System.out.printf("Raíz ≈ %.6f%n", x0);
    }
    public static double g(double x) { return (x + 2 / x) / 2; } // Raíz cuadrada de 2
}