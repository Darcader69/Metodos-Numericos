public class Pasomulti5 {
    public static double f(double t, double y) {
        return -2 * y;
    }

    public static double exactSolution(double t) {
        return Math.exp(-2 * t);
    }

    public static void main(String[] args) {
        double h = 0.1;
        double[] t = {0.0, 0.1, 0.2};
        double[] y = {1.0, 0.81873, 0.67032}; // aproximaciones previas

        double f0 = f(t[0], y[0]);
        double f1 = f(t[1], y[1]);
        double f2 = f(t[2], y[2]);

        // Adams-Bashforth de 3 pasos
        double y3 = y[2] + h * (23 * f2 - 16 * f1 + 5 * f0) / 12;

        // Solución exacta
        double exact = exactSolution(0.3);
        double error = Math.abs(exact - y3);

        System.out.printf("Aproximación de y(0.3): %.5f\n", y3);
        System.out.printf("Valor exacto y(0.3): %.5f\n", exact);
        System.out.printf("Error absoluto: %.5f\n", error);
    }
}
