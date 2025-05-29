public class Kutta4 {
    public static double g1(double t, double y, double z) {
        return z;  // dy/dt = z
    }

    public static double g2(double t, double y, double z) {
        return -y; // dz/dt = -y (movimiento armónico simple)
    }

    public static void rungeKutta(double t0, double y0, double z0, double tf, double h) {
        double t = t0;
        double y = y0;
        double z = z0;

        while (t < tf + 1e-6) {
            double k1y = h * g1(t, y, z);
            double k1z = h * g2(t, y, z);

            double k2y = h * g1(t + h/2, y + k1y/2, z + k1z/2);
            double k2z = h * g2(t + h/2, y + k1y/2, z + k1z/2);

            double k3y = h * g1(t + h/2, y + k2y/2, z + k2z/2);
            double k3z = h * g2(t + h/2, y + k2y/2, z + k2z/2);

            double k4y = h * g1(t + h, y + k3y, z + k3z);
            double k4z = h * g2(t + h, y + k3y, z + k3z);

            y += (k1y + 2*k2y + 2*k3y + k4y) / 6.0;
            z += (k1z + 2*k2z + 2*k3z + k4z) / 6.0;
            t += h;

            System.out.printf("%.2f \t%.6f \t%.6f%n", t, y, z);
        }
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio 4 - Movimiento armónico simple");
        System.out.println("t \ty \tz");
        rungeKutta(0, 0, 1, 2, 0.4);
    }
}
// Ejecución del programa
// Ejercicio 4 - Movimiento armónico simple
// t       y       z
// 0.40    0.389333        0.921067
// 0.80    0.717204        0.696783
// 1.20    0.931874        0.362553
// 1.60    0.999472        -0.028874
// 2.00    0.909338        -0.415723
// 2.40    0.675706        -0.736944