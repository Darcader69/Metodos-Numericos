import java.util.Arrays;

public class Seidel2 {
    public static void main(String[] args) {
        double[][] A = {{4, 1, 1}, {1, 5, 2}, {1, 2, 6}};
        double[] b = {6, 9, 12};
        double[] x = {0, 0, 0};
        double tol = 1e-6;
        int maxIter = 100;

        solveGaussSeidel(A, b, x, tol, maxIter);
        System.out.println("Solución: " + Arrays.toString(x));
    }

    public static void solveGaussSeidel(double[][] A, double[] b, double[] x, double tol, int maxIter) {
        int n = b.length;
        int iter = 0;
        double error = tol + 1;

        while (error > tol && iter < maxIter) {
            error = 0;
            for (int i = 0; i < n; i++) {
                double sum = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= A[i][j] * x[j];
                    }
                }
                double xPrev = x[i];
                x[i] = sum / A[i][i];
                error += Math.abs(x[i] - xPrev);
            }
            iter++;
        }
    }

    @Override
    public String toString() {
        return "Seidel2 []";
    }
}