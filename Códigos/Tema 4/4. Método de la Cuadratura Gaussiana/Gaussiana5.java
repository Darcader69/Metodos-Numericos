public class Gaussiana5 {
    public static double f(double x) { return x; } // Ponderación ya incluida en los pesos
    public static void main(String[] args) {
        double[] x = {0.585786, 3.414214}; // Nodos para n=2 (Gauss-Laguerre)
        double[] w = {0.853553, 0.146447}; // Pesos para n=2
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += w[i] * f(x[i]);
        }
        System.out.println("Integral: " + suma);
    }
}
// Ejecución del programa
// Integral: 1.0000007953160002