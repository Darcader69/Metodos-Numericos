public class Gauss2
 {

    private static final int MAXN = 100;

    public static void partialPivot(double[][] A, int n) {
        for (int i = 0; i < n; i++) {
            int pivotRow = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(A[j][i]) > Math.abs(A[pivotRow][i])) {
                    pivotRow = j;
                }
            }
            if (pivotRow != i) {
                for (int j = i; j <= n; j++) {
                    double temp = A[i][j];
                    A[i][j] = A[pivotRow][j];
                    A[pivotRow][j] = temp;
                }
            }
            for (int j = i + 1; j < n; j++) {
                double factor = A[j][i] / A[i][i];
                for (int k = i; k <= n; k++) {
                    A[j][k] -= factor * A[i][k];
                }
            }
        }
    }

    public static void backSubstitute(double[][] A, int n, double[] x) {
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (A[i][n] - sum) / A[i][i];
        }
    }

    public static double roundToThreeDecimals(double value) {
        return Math.round(value * 1000.0) / 1000.0;
    }


    public static void main(String[] args) {
        int n = 3;
        double[][] A = {
            {2.0, 3.0, -1.0, 5.0},   // 2A + 3B - C = 5
            {4.0, 2.0, 3.0, 12.0},   // 4A + 2B + 3C = 12
            {3.0, -1.0, 2.0, 6.0}    // 3A - B + 2C = 6
        };
        double[] x = new double[MAXN];

        partialPivot(A, n);
        backSubstitute(A, n, x);

        System.out.println("Solución del sistema (redondeado a 3 cifras decimales):");
        System.out.println("A = " + roundToThreeDecimals(x[0]));
        System.out.println("B = " + roundToThreeDecimals(x[1]));
        System.out.println("C = " + roundToThreeDecimals(x[2]));
    }
}
