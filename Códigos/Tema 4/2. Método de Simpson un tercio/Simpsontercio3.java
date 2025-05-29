public class Simpsontercio3 {
    public static double f(double x) { return Math.log(x); }
    public static void main(String[] args) {
        double a = 1, b = Math.E;
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
// Ejecución del programa
// Integral: 0.999999999080049