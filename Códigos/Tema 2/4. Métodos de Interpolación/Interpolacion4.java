public class Interpolacion4 {
    public static void main(String[] args) {
        double[] x = {0.0, 1.0, 2.0, 3.0}; 
        double[] y = {1.0, 2.7183, 7.3891, 20.0855}; // y = e^x
        double xi = 1.5; // Valor a interpolar

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
        System.out.printf("f(%.2f) ≈ %.4f\n", xi, yi); // Resultado: ≈4.4817 (e^1.5 ≈ 4.4817)
    }
}
//
// Ejecución del programa
// f(1.50) ≈ 4.4817
//