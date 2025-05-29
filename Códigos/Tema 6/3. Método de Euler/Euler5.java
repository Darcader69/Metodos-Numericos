public class Euler5 {
     public static void main(String[] args) {
        double x0 = 0.0, y0 = 1.0; // Condición inicial
        double h = 0.1; // Paso
        int steps = 10; // Número de pasos

        for (int i = 0; i < steps; i++) {
            y0 += h * f(x0, y0); // Fórmula de Euler
            x0 += h;
            System.out.printf("x = %.2f, y ≈ %.6f%n", x0, y0);
        }
    }

    public static double f(double x, double y) {
        return x + y; // dy/dx = x + y
    }
}
// Ejecución del programa
// x = 0.10, y ? 1.100000
// x = 0.20, y ? 1.220000
// x = 0.30, y ? 1.362000
// x = 0.40, y ? 1.528200
// x = 0.50, y ? 1.721020
// x = 0.60, y ? 1.943122
// x = 0.70, y ? 2.197434
// x = 0.80, y ? 2.487178
// x = 0.90, y ? 2.815895
// x = 1.00, y ? 3.187485