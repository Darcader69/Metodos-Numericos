import java.util.Arrays;

public class Seidel3 {
    public static void main(String[] args) {
        double[][] A = {{10, 2, 1}, {1, 5, 1}, {2, 3, 10}}; // Diagonalmente dominante
        double[] b = {13, 7, 15};
        double[] x = {0, 0, 0};
        solveGaussSeidel(A, b, x, 1e-6, 50);
        System.out.println("Solución: " + Arrays.toString(x));
    }

    private static void solveGaussSeidel(double[][] a, double[] b, double[] x, double d, int i) {
        throw new UnsupportedOperationException("Unimplemented method 'solveGaussSeidel'");
    }

    // Método solveGaussSeidel igual al Ejemplo 1
}
//
// Ejecución del programa
// Solución: [1.0, 1.0, 1.0]
//