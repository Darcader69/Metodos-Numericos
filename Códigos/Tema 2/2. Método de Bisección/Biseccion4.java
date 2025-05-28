public class Biseccion4 {
    public static void main(String[] args) {
        double a = 1, b = 3, tol = 1e-4;
        for (int i = 1; i <= 10; i++) {
            double c = (a + b) / 2;
            System.out.printf("Iter %d: c = %.6f, f(c) = %.6f%n", i, c, f(c));
            if (f(a) * f(c) < 0) b = c; else a = c;
        }
    }
    public static double f(double x) { return Math.log(x) - 1; }
}