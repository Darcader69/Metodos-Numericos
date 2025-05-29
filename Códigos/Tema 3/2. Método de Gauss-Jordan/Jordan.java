import java.util.Scanner;
import java.text.DecimalFormat;
public class Jordan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.####");
    double[][] matrix = {
        {2, -1, 1, 3},
        {1, 3, 2, 12},
        {1, -1, 2, 0}
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

            System.out.println("Dividiendo fila " + (i + 1) + " por " + df.format(pivot));
            for (int j = 0; j < n + 1; j++) {
                matrix[i][j] /= pivot;
            }
            printMatrix(matrix, n, df);

            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matrix[k][i];
                    System.out.println("Eliminando elemento en fila " + (k + 1) + ", columna " + (i + 1));

                    for (int j = 0; j < n + 1; j++) {
                        matrix[k][j] -= factor * matrix[i][j];
                    }
                    printMatrix(matrix, n, df);
                }
            }
        }
        System.out.println("Solución del sistema:");
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
// Ejecución del programa
// Resolviendo el Ejercicio 2:
// Dividiendo fila 1 por 2.0
// 1.0	-0.5	0.5	1.5
// 1.0	3.0	2.0	12.0
// 1.0	-1.0	2.0	0.0
// Eliminando elemento en fila 2, columna 1
// 0.0	3.5	1.5	10.5
// 1.0	3.0	2.0	12.0
// Eliminando elemento en fila 3, columna 1
// 0.0	-1.5	1.5	-1.5   
// 0.0	3.5	1.5	10.5
// Dividiendo fila 2 por 3.5
// 0.0	1.0	0.4286	3.0
// 0.0	-1.5	1.5	-1.5
// 0.0	3.5	1.5	10.5
// Eliminando elemento en fila 1, columna 2
// 1.0	0.0	1.2857	6.0
// 0.0	1.0	0.4286	3.0
// Eliminando elemento en fila 3, columna 2
// 0.0	0.0	1.2857	4.5
// 1.0	0.0	1.2857	6.0
//Dividiendo fila 3 por 1.7143
//1       0       0.7143  3
//0       1       0.4286  3
//0       0       1       0
//Eliminando elemento en fila 1, columna 3
//1       0       0       3
//0       1       0.4286  3
//0       0       1       0
//Eliminando elemento en fila 2, columna 3
//1       0       0       3
//0       1       0       3
//0       0       1       0
//Solución del sistema:
//x1 = 3
//x2 = 3
//x3 = 0
