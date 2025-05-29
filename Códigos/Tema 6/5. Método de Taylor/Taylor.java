public class Taylor {
    public static double f(double x, double y) { return y; }
    public static double df(double x, double y) { return y; } // Derivada de f

    public static void main(String[] args) {
        double x0 = 0, y0 = 1, h = 0.1;
        int n = 10; // Pasos hasta x=1
        double x = x0, y = y0;

        for (int i = 0; i < n; i++) {
            y = y + h * f(x, y) + (h * h / 2) * df(x, y); // Taylor orden 2
            x += h;
        }
        System.out.println("Aproximación en x=1: " + y); // ≈ 2.714080846 (vs e^1 ≈ 2.718281828)
    }
}
