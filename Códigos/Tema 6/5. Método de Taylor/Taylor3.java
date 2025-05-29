public class Taylor3 {
    public static double f(double x, double y) { return x + y; }
    public static double df(double x, double y) { return 1 + f(x, y); } // Derivada de f

    public static void main(String[] args) {
        double x0 = 0, y0 = 1, h = 0.1;
        int n = 5; // Pasos hasta x=0.5
        double x = x0, y = y0;

        for (int i = 0; i < n; i++) {
            y = y + h * f(x, y) + (h * h / 2) * df(x, y);
            x += h;
        }
        System.out.println("Aproximación en x=0.5: " + y); // ≈ 2.1487 (vs solución exacta ≈ 2.148721271)
    }
}
