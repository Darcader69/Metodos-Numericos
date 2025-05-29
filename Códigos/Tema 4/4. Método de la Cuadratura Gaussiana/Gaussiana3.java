public class Gaussiana3 {
    public static double f(double x) { return Math.cos(x); }
    public static void main(String[] args) {
        double[] x = {-0.861136, -0.339981, 0.339981, 0.861136}; // Nodos para n=4
        double[] w = {0.347855, 0.652145, 0.652145, 0.347855}; // Pesos para n=4
        double a = 0, b = Math.PI / 2;
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            double xMapeado = ((b - a) * x[i] + (a + b)) / 2;
            suma += w[i] * f(xMapeado);
        }
        System.out.println("Integral: " + ((b - a)/2) * suma);
    }
}
// Ejecución del programa
// Integral: 1.0000000111567542