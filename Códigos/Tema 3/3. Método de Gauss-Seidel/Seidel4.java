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