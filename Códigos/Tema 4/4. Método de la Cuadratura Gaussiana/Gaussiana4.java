public class Gaussiana4 {
    public static double f(double x) { return 1 / (1 + x * x); }
    public static void main(String[] args) {
        double[] x = {-0.906180, -0.538469, 0, 0.538469, 0.906180}; // Nodos para n=5
        double[] w = {0.236927, 0.478629, 0.568889, 0.478629, 0.236927}; // Pesos para n=5
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += w[i] * f(x[i]);
        }
        System.out.println("Integral: " + suma);
    }
}