public class Gaussiana {
    public static double f(double x) { return x * x; }
    public static void main(String[] args) {
        double[] x = {-1/Math.sqrt(3), 1/Math.sqrt(3)}; // Nodos para n=2
        double[] w = {1, 1}; // Pesos para n=2
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += w[i] * f(x[i]);
        }
        System.out.println("Integral: " + suma);
    }
}
// Ejecución del programa
//Integral: 0.6666666666666669