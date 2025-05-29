public class Aprox2 {
    public static void main(String[] args) {
        double x0 = 1.0; int maxIter = 20;
        for (int i = 0; i < maxIter; i++) {
            x0 = g(x0);
        }
        System.out.printf("Raíz ≈ %.6f%n", x0);
    }
    public static double g(double x) { return Math.pow(x + 1, 1.0 / 3); }
}
//
// Ejecución del programa
// Raíz ≈ 1.324718
//