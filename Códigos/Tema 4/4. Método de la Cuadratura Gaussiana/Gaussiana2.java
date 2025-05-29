public class Gaussiana2 {
    public static double f(double x) { return Math.exp(x); }
    public static void main(String[] args) {
        double[] x = {-Math.sqrt(3/5.0), 0, Math.sqrt(3/5.0)}; // Nodos para n=3
        double[] w = {5/9.0, 8/9.0, 5/9.0}; // Pesos para n=3
        double a = 0, b = 2;
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            double xMapeado = ((b - a) * x[i] + (a + b)) / 2;
            suma += w[i] * f(xMapeado);
        }
        System.out.println("Integral: " + ((b - a)/2) * suma);
    }
}
// Ejecución del programa
//Integral: 6.388878163987117