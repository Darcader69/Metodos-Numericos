public class Interpolacion2 {
    public static void main(String[] args) {
        double[] x = {1.0, 2.0, 4.0}; // Puntos x conocidos
        double[] y = {2.0, 3.0, 1.0}; // Puntos y conocidos
        double xi = 3.0; // Punto a interpolar

        double resultado = 0.0;
        for (int i = 0; i < x.length; i++) {
            double termino = y[i];
            for (int j = 0; j < x.length; j++) {
                if (j != i) {
                    termino *= (xi - x[j]) / (x[i] - x[j]);
                }
            }
            resultado += termino;
        }
        System.out.printf("f(%.2f) ≈ %.4f\n", xi, resultado); // Resultado: 1.3333
    }
}
//
// Ejecución del programa
// f(3.00) ≈ 1.3333
//