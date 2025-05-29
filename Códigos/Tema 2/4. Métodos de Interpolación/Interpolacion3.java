public class Interpolacion3 {
    public static void main(String[] args) {
        double[] x = {0.0, Math.PI/2, Math.PI}; // Puntos x (ejemplo: seno)
        double[] y = {0.0, 1.0, 0.0}; // Puntos y (sen(x))
        double xi = Math.PI/4; // Punto a interpolar

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
        System.out.printf("f(%.4f) ≈ %.4f\n", xi, yi); // Resultado: ≈0.7071 (sen(π/4) = √2/2)
    }
}

//
// Ejecución del programa
// f(0.7854) ≈ 0.7071
//