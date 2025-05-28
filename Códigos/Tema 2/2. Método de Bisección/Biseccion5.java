public class Biseccion5 {
    public static void main(String[] args) {
        double a = 1, b = 2, tol = 1e-5;
        while (b - a > tol) {
            double c = (a + b) / 2;
            if (f(a) * f(c) < 0) b = c; else a = c;
        }
        System.out.printf("Raíz ≈ %.6f%n", (a + b) / 2);
    }
    public static double f(double x) { return x * x * x - 2 * x - 5; }
}