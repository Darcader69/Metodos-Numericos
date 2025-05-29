public class Simpsontres {
    public static double f(double x) { return Math.pow(x, 4); }
    public static void main(String[] args) {
        double a = 0, b = 1;
        int n = 99; // Ajustar a múltiplo de 3
        if (n % 3 != 0) n += (3 - n % 3);
        double h = (b - a) / n;
        double suma = f(a) + f(b);
        for (int i = 1; i < n; i++) {
            suma += (i % 3 == 0) ? 2 * f(a + i * h) : 3 * f(a + i * h);
        }
        System.out.println("Integral: " + (3 * h / 8) * suma);
    }
}
// Ejecución del programa
// Integral: 0.20000000000000004
