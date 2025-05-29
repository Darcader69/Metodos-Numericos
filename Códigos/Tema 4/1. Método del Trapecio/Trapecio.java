public class Trapecio {
    public static double f(double x) { return x * x; }
    public static void main(String[] args) {
        double a = 0, b = 2;
        int n = 100;
        double h = (b - a) / n;
        double suma = (f(a) + f(b)) / 2;
        for (int i = 1; i < n; i++) suma += f(a + i * h);
        System.out.println("Integral: " + h * suma);
    }
}
// Ejecución del programa
// Integral: 2.6668000000000003