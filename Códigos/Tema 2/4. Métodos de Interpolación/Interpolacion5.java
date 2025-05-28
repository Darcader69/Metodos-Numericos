public class Interpolacion5 {
    public static void main(String[] args) {
        double[] x = {-1.0, 0.0, 1.0, 2.0}; 
        double[] y = {-1.0, 0.0, 1.0, 8.0}; // y = x^3
        double xi = 0.5; // Valor a interpolar

        double yi = 0.0;
        for (int i = 0; i < x.length; i++) {
            double li = 1.0;
            for (int j = 0; j < x.length; j++) {
                if (j != i) {
                    li *= (xi - x[j]) / (x[i] - x[j]);
                }
            }
            yi += y[i] * li;
        }
        System.out.printf("f(%.2f) ≈ %.4f\n", xi, yi); // Resultado: ≈0.125 (0.5^3 = 0.125)
    }
}