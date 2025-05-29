import java.text.DecimalFormat;
public class Euler2 {
    
    public static double f(double x, double y) {
        return y - x * x + 1;
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
        double y0 = 0.5;
        double h = 0.2;
        int n = 10;

        metodoEuler(x0, y0, h, n);
    }
}
// Ejecución del programa
// x               y
// 0               0.5
// 0.2             0.8
// 0.4             1.152
// 0.6             1.55
// 0.8             1.988
// 1               2.458
// 1.2             2.95
// 1.4             3.452
// 1.6             3.95
// 1.8             4.428
// 2               4.866