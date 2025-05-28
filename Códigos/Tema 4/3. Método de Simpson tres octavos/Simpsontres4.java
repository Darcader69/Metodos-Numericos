public class Simpsontres4 {
    public static double f(double x) { return x * Math.sin(x); }
    public static void main(String[] args) {
        double a = 0, b = 2 * Math.PI;
        int n = 99;
        if (n % 3 != 0) n += (3 - n % 3);
        double h = (b - a) / n;
        double suma = f(a) + f(b);
        for (int i = 1; i < n; i++) {
            suma += (i % 3 == 0) ? 2 * f(a + i * h) : 3 * f(a + i * h);
        }
        System.out.println("Integral: " + (3 * h / 8) * suma);
    }
}