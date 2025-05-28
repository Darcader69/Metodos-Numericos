public class Biseccion {
    public static void main(String[] args) {
        double a = 1, b = 2, tol = 1e-6;
        while (b - a > tol) {
            double c = (a + b) / 2;
            if (f(a) * f(c) < 0) b = c; else a = c;
        }
        System.out.printf("Raíz ≈ %.6f%n", (a + b) / 2);
    }
    public static double f(double x) { return x * x - 2; }
}