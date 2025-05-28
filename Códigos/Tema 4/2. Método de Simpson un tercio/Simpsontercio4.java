public class Simpsontercio4 {
    public static double f(double x) { return Math.sin(x * x); }
    public static void main(String[] args) {
        double a = 0, b = Math.sqrt(Math.PI);
        int n = 100;
        if (n % 2 != 0) n++;
        double h = (b - a) / n;
        double suma = f(a) + f(b);
        for (int i = 1; i < n; i++) {
            suma += (i % 2 == 0) ? 2 * f(a + i * h) : 4 * f(a + i * h);
        }
        System.out.println("Integral: " + (h / 3) * suma);
    }
}