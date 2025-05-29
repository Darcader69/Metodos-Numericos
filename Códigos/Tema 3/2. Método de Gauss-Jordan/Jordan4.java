import java.text.DecimalFormat;

public class Jordan4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.####");

        // Definimos el sistema de ecuaciones directamente
        int n = 3;
        double[][] matrix = {
            {4, -3, 2, 5},
            {3, 2, -4, 7},
            {2, -1, 3, -2}
        };

        System.out.println("Sistema de ecuaciones:");
        printMatrix(matrix, n, df);

        System.out.println("\n Procedimiento paso a paso:");
        gaussJordan(matrix, n, df);
    }

    public static void gaussJordan(double[][] matrix, int n, DecimalFormat df) {
        for (int i = 0; i < n; i++) {
            // 1. Hacer el pivote igual a 1
            double pivot = matrix[i][i];

            if (pivot == 0) {
                System.out.println("No se puede resolver: hay un pivote cero.");
                return;
            }

            System.out.println("\n Dividiendo fila " + (i + 1) + " por " + df.format(pivot));
            for (int j = 0; j < n + 1; j++) {
                matrix[i][j] /= pivot;
            }
            printMatrix(matrix, n, df);

            // 2. Hacer ceros en las demás filas
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matrix[k][i];
                    System.out.println("\n Eliminando elemento en fila " + (k + 1) + ", columna " + (i + 1));

                    for (int j = 0; j < n + 1; j++) {
                        matrix[k][j] -= factor * matrix[i][j];
                    }
                    printMatrix(matrix, n, df);
                }
            }
        }

        // Mostrar la solución
        System.out.println("\n Solución del sistema:");
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + df.format(matrix[i][n]));
        }
    }

    public static void printMatrix(double[][] matrix, int n, DecimalFormat df) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(df.format(matrix[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}
//
// Ejecución del programa
// Sistema de ecuaciones:
// 4.0	-3.0	2.0	5.0
// 3.0	2.0	-4.0	7.0
// 2.0	-1.0	3.0	-2.0
//
// Procedimiento paso a paso:
// Dividiendo fila 1 por 4.0

// 1.0	-0.75	0.5	1.25
// 3.0	2.0	-4.0	7.0
// 2.0	-1.0	3.0	-2.0
// Eliminando elemento en fila 2, columna 1
// 1.0	-0.75	0.5	1.25
// 0.0	4.25	-5.5	3.75
// 2.0	-1.0	3.0	-2.0
// Eliminando elemento en fila 3, columna 1
// 1.0	-0.75	0.5	1.25
// 0.0	4.25	-5.5	3.75
// 0.0	0.5	2.0	-4.5
// Dividiendo fila 2 por 4.25

// 1.0	-0.75	0.5	1.25
// 0.0	1.0	-1.2941	0.8824
// 0.0	0.5	2.0	-4.5
// Eliminando elemento en fila 1, columna 2
// 1.0	0.0	1.4706	0.8824
// 0.0	1.0	-1.2941	0.8824
// Eliminando elemento en fila 3, columna 2
// 1.0	0.0	1.4706	0.8824
// 0.0	1.0	-1.2941	0.8824
// Dividiendo fila 3 por 2.0
// 1.0	0.0	1.4706	0.8824
// 0.0	1.0	-1.2941	0.8824
// 0.0	0.0	1.0	-2.25

// Eliminando elemento en fila 1, columna 3
// 1.0	0.0	0.0	4.8824
// 0.0	1.0	-1.2941	0.8824

// Eliminando elemento en fila 2, columna 3
// 1.0	0.0	0.0	4.8824
// 0.0	1.0	0.0	3.1765
// 0.0	0.0	1.0	-2.25
// Solución del sistema:
// x1 = 4.8824
// x2 = 3.1765
// x3 = -2.25
//