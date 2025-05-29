public class Trapecio5 {
    public static double f(double x) { return Math.cos(x); }
    public static void main(String[] args) {
        double a = 0, b = Math.PI / 2;
        int n = 100;
        double h = (b - a) / n;
        double suma = (f(a) + f(b)) / 2;
        for (int i = 1; i < n; i++) suma += f(a + i * h);
        System.out.println("Integral: " + h * suma);
    }
}
// Ejecución del programa
// Integral: 1.0000000000000002
