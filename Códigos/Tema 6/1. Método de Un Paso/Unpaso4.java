public class Unpaso4 {
    public static double f(double x, double y) {
        return 2 * x * y;
    }

    public static void main(String[] args) {
        // Datos iniciales
        double x0 = 0;
        double y0 = 1;
        double h = 0.2;
        int n = 5;

        double x = x0;
        double y = y0;

        System.out.println("Paso\t x\t\t y");
        System.out.printf("0\t %.2f\t %.4f%n", x, y);

        for (int i = 1; i <= n; i++) {
            y = y + h * f(x, y);
            x = x + h;
            System.out.printf("%d\t %.2f\t %.4f%n", i, x, y);
        }
    }
}
// Ejecución del programa
// Paso     x               y
// 0        0.00    1.0000
// 1        0.20    1.0000
// 2        0.40    1.0800
// 3        0.60    1.2528
// 4        0.80    1.5535
// 5        1.00    2.0506