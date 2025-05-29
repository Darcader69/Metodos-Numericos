public class Taylor5 {
    public static double f(double x, double y) { return Math.sin(x); }
    public static double df(double x, double y) { return Math.cos(x); } // Derivadas sucesivas
    public static double d2f(double x, double y) { return -Math.sin(x); }
    public static double d3f(double x, double y) { return -Math.cos(x); }

    public static void main(String[] args) {
        double x0 = 0, y0 = 0, h = 0.1;
        int n = 10; // Pasos hasta x=1
        double x = x0, y = y0;

        for (int i = 0; i < n; i++) {
            y = y + h * f(x, y) + (h * h / 2) * df(x, y) + 
                (Math.pow(h, 3) / 6) * d2f(x, y) + (Math.pow(h, 4) / 24) * d3f(x, y);
            x += h;
        }
        System.out.println("Aproximación en x=1: " + y); // ≈ 0.4597 (vs 1 - cos(1) ≈ 0.459697694)
    }
}
