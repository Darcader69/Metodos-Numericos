class Gauss4 {
    public static int N = 3; // Número de incógnitas

    // Redondeo a 3 cifras decimales
    static double roundToThreeDecimals(double value) {
        return Math.round(value * 1000.0) / 1000.0;
    }

    static void gaussianElimination(double mat[][]) {
        int singularFlag = forwardElim(mat);
        if (singularFlag != -1) {
            System.out.println("Matriz singular.");
            if (mat[singularFlag][N] != 0)
                System.out.print("Sistema inconsistente.");
            else
                System.out.print("Puede tener soluciones infinitas.");
            return;
        }
        backSub(mat);
    }

    static void swapRow(double mat[][], int i, int j) {
        for (int k = 0; k <= N; k++) {
            double temp = mat[i][k];
            mat[i][k] = roundToThreeDecimals(mat[j][k]);
            mat[j][k] = roundToThreeDecimals(temp);
        }
    }

    static int forwardElim(double mat[][]) {
        for (int k = 0; k < N; k++) {
            int iMax = k;
            double vMax = Math.abs(mat[iMax][k]);
            for (int i = k + 1; i < N; i++) {
                if (Math.abs(mat[i][k]) > vMax) {
                    vMax = Math.abs(mat[i][k]);
                    iMax = i;
                }
            }

            if (mat[iMax][k] == 0)
                return k;

            if (iMax != k)
                swapRow(mat, k, iMax);

            for (int i = k + 1; i < N; i++) {
                double f = roundToThreeDecimals(mat[i][k] / mat[k][k]);
                for (int j = k + 1; j <= N; j++) {
                    mat[i][j] = roundToThreeDecimals(mat[i][j] - roundToThreeDecimals(mat[k][j] * f));
                }
                mat[i][k] = 0.0; // Exacto
            }
        }
        return -1;
    }

    static void backSub(double mat[][]) {
        double x[] = new double[N];
        for (int i = N - 1; i >= 0; i--) {
            x[i] = mat[i][N];
            for (int j = i + 1; j < N; j++) {
                x[i] = roundToThreeDecimals(x[i] - roundToThreeDecimals(mat[i][j] * x[j]));
            }
            x[i] = roundToThreeDecimals(x[i] / mat[i][i]);
        }

        System.out.println("\nSolución del sistema (redondeado a 3 cifras decimales):");
        for (int i = 0; i < N; i++) {
            System.out.format("x%d = %.3f\n", i + 1, x[i]);
        }
    }

    public static void main(String[] args) {
        double mat[][] = {
            { 2.0, 1.0, -3.0, -10.0 },
            { 4.0, -6.0, 0.0, 32.0 },
            { -2.0, 7.0, 2.0, 15.0 }
        };
        gaussianElimination(mat);
    }
}
