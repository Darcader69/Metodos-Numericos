import java.util.Scanner;
import java.text.DecimalFormat;

public class Jordan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.####");
    double[][] matrix = {
        {3, -2, 5, 1},
        {2, 3, -1, 3},
        {1, 3, 2, 12}
    };

    System.out.println("Resolviendo el Ejercicio 2:");
    gaussJordan(matrix, 3, df);

    sc.close();
    }
    public static void gaussJordan(double[][] matrix, int n, DecimalFormat df) {
        for (int i = 0; i < n; i++) {
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
// Resolviendo el Ejercicio 2:
//
//  Dividiendo fila 1 por 3
// 1       -0.6667 1.6667  0.3333
// 2       3       -1      3
// 1       3       2       12
//
//  Eliminando elemento en fila 2, columna 1
// 1       -0.6667 1.6667  0.3333
// 0       4.3333  -4.3333 2.3333
// 1       3       2       12
//
//  Eliminando elemento en fila 3, columna 1
// 1       -0.6667 1.6667  0.3333
// 0       4.3333  -4.3333 2.3333
// 0       3.6667  0.3333  11.6667
//
//  Dividiendo fila 2 por 4.3333
// 1       -0.6667 1.6667  0.3333
// 0       1       -1      0.5385
// 0       3.6667  0.3333  11.6667
//
//  Eliminando elemento en fila 1, columna 2
// 1       0       1       0.6923
// 0       1       -1      0.5385
// 0       3.6667  0.3333  11.6667
//
//  Eliminando elemento en fila 3, columna 2
// 1       0       1       0.6923
// 0       1       -1      0.5385
// 0       0       4       9.6923
//
//  Dividiendo fila 3 por 4
// 1       0       1       0.6923
// 0       1       -1      0.5385
// 0       0       1       2.4231
//
//  Eliminando elemento en fila 1, columna 3
// 1       0       0       -1.7308
// 0       1       -1      0.5385
// 0       0       1       2.4231
//
//  Eliminando elemento en fila 2, columna 3
// 1       0       0       -1.7308
// 0       1       0       2.9615
// 0       0       1       2.4231
//
//  Solución del sistema:
// x1 = -1.7308
// x2 = 2.9615
// x3 = 2.4231
//x2 = 2.9615
//x3 = 2.4231