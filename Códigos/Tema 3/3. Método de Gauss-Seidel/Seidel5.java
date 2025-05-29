import java.util.Arrays;

public class Seidel5 {
    public static void main(String[] args) {
        double[][] A = {{4, 1, 0, 0}, {1, 4, 1, 0}, {0, 1, 4, 1}, {0, 0, 1, 4}};
        double[] b = {5, 6, 6, 5};
        double[] x = new double[4];
        solveGaussSeidel(A, b, x, 1e-6, 50);
        System.out.println("Solución: " + Arrays.toString(x));
    }

    private static void solveGaussSeidel(double[][] a, double[] b, double[] x, double d, int i) {
        throw new UnsupportedOperationException("Unimplemented method 'solveGaussSeidel'");
    }
}
//
// Ejecución del programa
// Solución: [1.0, 1.0, 1.0, 1.0]
//
