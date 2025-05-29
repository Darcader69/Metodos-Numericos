import java.util.Arrays;

public class Seidel4 {
    public static void main(String[] args) {
        double[][] A = {{3, 1}, {1, 2}};
        double[] b = {5, 5};
        double[] x = {0, 0};
        solveGaussSeidelResiduo(A, b, x, 1e-6, 100);
    }

    public static void solveGaussSeidelResiduo(double[][] A, double[] b, double[] x, double tol, int maxIter) {
        int n = b.length;
        int iter = 0;
        double residuo;

        do {
            residuo = 0;
            for (int i = 0; i < n; i++) {
                double sum = b[i];
                for (int j = 0; j < n; j++) {
                    sum -= A[i][j] * x[j];
                }
                x[i] += sum / A[i][i];
                residuo += Math.abs(sum);
            }
            iter++;
            System.out.println("Iteración " + iter + ": " + Arrays.toString(x));
        } while (residuo > tol && iter < maxIter);
    }
}
//
// Ejecución del programa
// Iteración 1: [1.6666666666666667, 1.6666666666666667]
//Iteración 2: [1.1111111111111112, 1.9444444444444444]
//Iteración 3: [1.0185185185185186, 1.9907407407407407]
//Iteración 4: [1.0030864197530864, 1.998456790123457]
//Iteración 5: [1.0005144032921809, 1.9997427983539096]
//Iteración 6: [1.0000857338820301, 1.999957133058985]
//Iteración 7: [1.0000142889803383, 1.9999928555098307]
//Iteración 8: [1.0000023814967232, 1.9999988092516383]
//Iteración 9: [1.0000003969161206, 1.9999998015419398]
//Iteración 10: [1.0000000661526867, 1.9999999669236566]
//Iteración 11: [1.0000000110254479, 1.999999994487276]
//