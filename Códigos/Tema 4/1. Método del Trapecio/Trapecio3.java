public class Trapecio3 {
    public static double f(double x) { return Math.exp(x); }
    public static void main(String[] args) {
        double a = 0, b = 1;
        int n = 50;
        double h = (b - a) / n;
        double suma = (f(a) + f(b)) / 2;
        for (int i = 1; i < n; i++) suma += f(a + i * h);
        System.out.println("Integral: " + h * suma);
    }
}