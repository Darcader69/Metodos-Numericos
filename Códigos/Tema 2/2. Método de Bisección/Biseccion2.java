public class Biseccion2 {
    public static void main(String[] args) {
        double a = 0, b = 1; int maxIter = 20;
        for (int i = 0; i < maxIter; i++) {
            double c = (a + b) / 2;
            if (f(c) == 0 || (b - a) < 1e-6) break;
            if (f(a) * f(c) < 0) b = c; else a = c;
        }
        System.out.printf("Raíz ≈ %.6f%n", (a + b) / 2);
    }
    public static double f(double x) { return Math.cos(x) - x; }
}