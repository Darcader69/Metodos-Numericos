public class Gauss {


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


    public static void main(String[] args) {
        int n = 3;
        double[][] A = {
            {2.0, 3.0, -1.0, 10.0},
            {4.0, -1.0, 2.0, 20.0},
            {3.0, 5.0, 1.0, 30.0}
        };
        double[] x = new double[MAXN];


        partialPivot(A, n);
        backSubstitute(A, n, x);


        System.out.println("Fuerzas en los pilares del puente:");
        for (int i = 0; i < n; i++) {
            System.out.printf("F%d = %.3f unidades de fuerza%n", (i + 1), x[i]);
        }
    }
}
//
// Ejecución del programa
// Fuerzas en los pilares del puente:
// F1 = 2.000 unidades de fuerza
// F2 = 3.000 unidades de fuerza
// F3 = 4.000 unidades de fuerza
//