import java.text.DecimalFormat;

public class Euler4 {
     public static double f(double x, double y) {
        return -2 * y + 3 * x;
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
        int n = 12;

        metodoEuler(x0, y0, h, n);
    }
}
// Ejecución del programa
// x               y
// 0               1
// 0.1             0.8
// 0.2             0.67
// 0.3             0.596
// 0.4             0.567
// 0.5             0.573
// 0.6             0.609
// 0.7             0.667
// 0.8             0.744
// 0.9             0.835
// 1               0.938
// 1.1             1.05
// 1.2             1.17