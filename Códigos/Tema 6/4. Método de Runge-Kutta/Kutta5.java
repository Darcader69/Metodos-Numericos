public class Kutta5 {
    public static double f(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        double x0 = 0.0;
        double y0 = 1.0;
        double xf = 0.4;
        double h = 0.2;

        int n = (int)((xf - x0) / h);

        System.out.println("x\t\ty");
        System.out.printf("%.1f\t\t%.5f\n", x0, y0);

        for (int i = 1; i <= n; i++) {
            double k1 = f(x0, y0);
            double k2 = f(x0 + h / 2.0, y0 + (h / 2.0) * k1);
            double k3 = f(x0 + h / 2.0, y0 + (h / 2.0) * k2);
            double k4 = f(x0 + h, y0 + h * k3);

            double y1 = y0 + (h / 6.0) * (k1 + 2*k2 + 2*k3 + k4);
            x0 = x0 + h;
            y0 = y1;

            System.out.printf("%.1f\t\t%.5f\n", x0, y0);
        }
    }
}
