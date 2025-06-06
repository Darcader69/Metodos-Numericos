import java.util.Scanner;

public class Seidel {

    public static double[][] llenarmatrizCoeficientes(int n, Scanner scanner) {
        double[][] matriz = new double[n][n];
        System.out.println("Ingrese los coeficientes del sistema:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        return matriz;
    }

    public static double[] llenarVectorTIndependientes(int n, Scanner scanner) {
        double[] vector = new double[n];
        System.out.println("Ingrese los términos independientes:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor del término independiente en la fila " + i + ": ");
            vector[i] = scanner.nextDouble();
        }
        return vector;
    }

    public static void mostrarmatriz(double[][] matriz, String nombre) {
        System.out.println("\n" + nombre + ":");
        for (double[] fila : matriz) {
            for (double elemento : fila) {
                System.out.printf("%.2f ", elemento);
            }
            System.out.println();
        }
    }

    public static double[] gaussSeidel(double[][] A, double[] b, double tol, int maxIter) {
        int n = A.length;
        double[] x = new double[n]; // Inicializamos la solución con ceros
        double[] xNuevo = new double[n];
        int iteraciones = 0;

        for (int iter = 0; iter < maxIter; iter++) {
            System.arraycopy(x, 0, xNuevo, 0, n);

            for (int i = 0; i < n; i++) {
                double suma = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += A[i][j] * xNuevo[j];
                    }
                }
                xNuevo[i] = (b[i] - suma) / A[i][i];
            }

            // Verificar la convergencia
            double error = 0;
            for (int i = 0; i < n; i++) {
                error = Math.max(error, Math.abs(xNuevo[i] - x[i]));
            }
            
            if (error < tol) {
                System.out.println("Convergencia alcanzada en " + (iteraciones + 1) + " iteraciones.\n");
                return xNuevo;
            }

            System.arraycopy(xNuevo, 0, x, 0, n);
            iteraciones++;
        }
        System.out.println("Máximo número de iteraciones alcanzado. El método puede no haber convergido.\n");
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de ecuaciones (y variables): ");
        int n = scanner.nextInt();

        double[][] A = llenarmatrizCoeficientes(n, scanner);
        double[] b = llenarVectorTIndependientes(n, scanner);

        System.out.println("\nMatriz ingresada:");
        mostrarmatriz(A, "Matriz de coeficientes");

        double[] soluciones = gaussSeidel(A, b, 1e-6, 100);
        System.out.println("Soluciones del sistema:");
        for (double sol : soluciones) {
            System.out.printf("%.3f ", sol);
        }

        scanner.close();
    }
}
// Paso 1: Ingreso del tamaño del sistema
// El usuario especifica que hay 2 ecuaciones con 2 variables

// Paso 2: Ingreso de la matriz de coeficientes
// Se ingresa cada valor manualmente:
// Matriz A:
// [ 1  3 ]
// [ 1  3 ]

// Paso 3: Ingreso del vector de términos independientes
// Vector B:
// [ 1 ]
// [ 1 ]

// Se construye la matriz aumentada:
// [ 1  3 | 1 ]
// [ 1  3 | 1 ]

// Paso 4: Mostrar la matriz ingresada
// Se imprime la matriz de coeficientes para verificación:
// 1.00 3.00
// 1.00 3.00

// Paso 5: Se aplica un método iterativo (como Jacobi o Gauss-Seidel)
// Se hacen sucesivas aproximaciones hasta que el cambio entre iteraciones sea menor a cierta tolerancia.

// Se alcanza la convergencia en 2 iteraciones (es decir, el sistema se resolvió rápidamente con las condiciones iniciales).

// Paso 6: Mostrar las soluciones
// Solución del sistema:
// x1 = 1.000
// x2 = 0.000
