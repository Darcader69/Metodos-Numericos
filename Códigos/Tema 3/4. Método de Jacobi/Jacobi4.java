public class Jacobi4 {

    // Método para resolver el sistema usando Jacobi
    public static void jacobi(double[][] A, double[] b, double[] x, double tolerance, int maxIterations) {
        int n = b.length;
        double[] xNew = new double[n];
        int iterations = 0;

        while (iterations < maxIterations) {
            for (int i = 0; i < n; i++) {
                double sum = 0.0;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        sum += A[i][j] * x[j];
                    }
                }
                xNew[i] = (b[i] - sum) / A[i][i];
            }

            // Verificar convergencia
            double error = 0.0;
            for (int i = 0; i < n; i++) {
                error += Math.abs(xNew[i] - x[i]);
            }
            if (error < tolerance) {
                System.out.println("Convergencia alcanzada en " + iterations + " iteraciones.");
                break;
            }

            // Actualizar x para la siguiente iteración
            System.arraycopy(xNew, 0, x, 0, n);
            iterations++;
        }

        if (iterations == maxIterations) {
            System.out.println("Máximo de iteraciones alcanzado.");
        }
    }

    public static void main(String[] args) {
        // Definir la matriz A y el vector b
        double[][] A = {{4, 1, -1}, {2, 5, 1}, {1, 1, 6}};
        double[] b = {3, 12, 10};

        // Inicializar el vector x con ceros
        double[] x = {0, 0, 0};

        // Parámetros del método
        double tolerance = 0.001;
        int maxIterations = 100;

        // Resolver el sistema
        jacobi(A, b, x, tolerance, maxIterations);

        // Mostrar la solución
        System.out.println("Solución:");
        System.out.println("x = " + x[0]);
        System.out.println("y = " + x[1]);
        System.out.println("z = " + x[2]);
    }
}
