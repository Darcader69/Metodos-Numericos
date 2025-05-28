public class Trapecio2 {
    public static double f(double x) { return Math.sin(x); }
    public static void main(String[] args) {
        double a = 0, b = Math.PI;
        int n = 1000;
        double h = (b - a) / n;
        double suma = (f(a) + f(b)) / 2;
        for (int i = 1; i < n; i++) suma += f(a + i * h);
        System.out.println("Integral: " + h * suma);
    }
}