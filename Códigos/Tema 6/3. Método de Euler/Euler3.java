import java.text.DecimalFormat;

public class Euler3 {
    public static double f(double x, double y) {
        return y - 2 * x;
    }

    public static void metodoEuler(double x0, double y0, double h, int n) {
        double x = x0;
        double y = y0;
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("x\t\ty");

        for (int i = 0; i <= n; i++) {
            System.out.println(df.format(x) + "\t\t" + df.format(y));
            y = y + h * f(x, y);
            x = x + h;
        }
    }

    public static void main(String[] args) {
        double x0 = 0;
        double y0 = 1;
        double h = 0.1;
        int n = 15;

        metodoEuler(x0, y0, h, n);
    }
}
// Ejecución del programa
// x               y
// 0               1
// 0.1             1.1
// 0.2             1.19
// 0.3             1.269
// 0.4             1.336
// 0.5             1.389
// 0.6             1.428
// 0.7             1.451
// 0.8             1.456
// 0.9             1.442
// 1               1.406
// 1.1             1.347
// 1.2             1.262
// 1.3             1.148
// 1.4             1.003
// 1.5             0.823