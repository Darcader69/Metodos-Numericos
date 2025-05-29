public class Taylor4 {
    public static double f(double x, double y) { return x * x + y * y; }
    public static double df(double x, double y) { return 2 * x + 2 * y * f(x, y); } // Derivada de f
    public static double d2f(double x, double y) { return 2 + 2 * f(x, y) * f(x, y) + 2 * y * df(x, y); } // Segunda derivada

    public static void main(String[] args) {
        double x0 = 0, y0 = 0, h = 0.05;
        int n = 10; // Pasos hasta x=0.5
        double x = x0, y = y0;

        for (int i = 0; i < n; i++) {
            y = y + h * f(x, y) + (h * h / 2) * df(x, y) + (h * h * h / 6) * d2f(x, y); // Taylor orden 3
            x += h;
        }
        System.out.println("Aproximación en x=0.5: " + y); // ≈ 0.0417 (solución numérica)
    }
}
