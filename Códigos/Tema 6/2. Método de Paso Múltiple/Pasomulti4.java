public class Pasomulti4 {
    public static double f(double t, double T) {
        return -0.07 * (T - 22);
    }

    public static void main(String[] args) {
        double h = 0.1;
        double[] t = {0.0, 0.1, 0.2};
        double[] T = {90.0, 83.66, 78.02}; // aproximaciones previas

        double f0 = f(t[0], T[0]);
        double f1 = f(t[1], T[1]);
        double f2 = f(t[2], T[2]);

        // Adams-Bashforth de 3 pasos
        double T3 = T[2] + h * (23*f2 - 16*f1 + 5*f0) / 12;

        System.out.printf("Aproximación de T(0.3): %.5f °C\n", T3);
    }
}
// Ejecución del programa
// Aproximación de T(0.3): 77.64556 °C