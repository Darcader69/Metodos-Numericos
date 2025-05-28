public class Trapecio4 {
    public static double f(double x) { return 1 / x; }
    public static void main(String[] args) {
        double a = 1, b = 2;
        int n = 200;
        double h = (b - a) / n;
        double suma = (f(a) + f(b)) / 2;
        for (int i = 1; i < n; i++) suma += f(a + i * h);
        System.out.println("Integral: " + h * suma);
    }
}