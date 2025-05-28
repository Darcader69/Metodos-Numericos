public class Intervalo2 {
    public static void main(String[] args) {
        double a = 0, b = 3;
        int n = 6; // Subintervalos
        double paso = (b - a) / n;
        for (int i = 0; i < n; i++) {
            double x1 = a + i * paso, x2 = x1 + paso;
            if (f(x1) * f(x2) <= 0) {
                System.out.printf("Raíz en [%.2f, %.2f]%n", x1, x2);
            }
        }
    }
    public static double f(double x) { return Math.sin(x); }
}