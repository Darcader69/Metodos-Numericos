import java.text.DecimalFormat;
public class Jordan5 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.####");

        // Definimos el sistema de ecuaciones directamente
        int n = 3;
        double[][] matrix = {
            {1, 2, 3, 14},
            {3, 2, 1, 10},
            {2, 3, 2, 13}
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
// Sistema original representado como matriz aumentada:
// [ 1  2  3 | 14 ]
// [ 3  2  1 | 10 ]
// [ 2  3  2 | 13 ]

// Paso 1: Normalizar la primera fila dividiéndola por el coeficiente de x1 (ya es 1, así que no cambia).
// Fila 1 = Fila 1 / 1
// [ 1  2  3 | 14 ]
// [ 3  2  1 | 10 ]
// [ 2  3  2 | 13 ]

// Paso 2: Eliminar los elementos debajo del pivote en la columna 1.
// Fila 2 = Fila 2 - 3*Fila 1
// Fila 3 = Fila 3 - 2*Fila 1
// Resultado:
// [ 1  2   3  | 14  ]
// [ 0 -4  -8  | -32 ]
// [ 0 -1  -4  | -15 ]

// Paso 3: Normalizar la fila 2 dividiéndola por el coeficiente de x2 (-4).
// Fila 2 = Fila 2 / -4
// Resultado:
// [ 1  2   3  | 14 ]
// [ 0  1   2  | 8  ]
// [ 0 -1  -4  | -15 ]

// Paso 4: Eliminar los elementos arriba y abajo del pivote en columna 2.
// Fila 1 = Fila 1 - 2*Fila 2
// Fila 3 = Fila 3 + Fila 2
// Resultado:
// [ 1  0  -1  | -2  ]
// [ 0  1   2  | 8   ]
// [ 0  0  -2  | -7  ]

// Paso 5: Normalizar la fila 3 dividiéndola por el coeficiente de x3 (-2).
// Fila 3 = Fila 3 / -2
// Resultado:
// [ 1  0  -1  | -2   ]
// [ 0  1   2  | 8    ]
// [ 0  0   1  | 3.5  ]

// Paso 6: Eliminar los elementos arriba del pivote en columna 3.
// Fila 1 = Fila 1 + 1*Fila 3
// Fila 2 = Fila 2 - 2*Fila 3
// Resultado:
// [ 1  0  0  | 1.5  ]
// [ 0  1  0  | 1    ]
// [ 0  0  1  | 3.5  ]

// Resultado final (matriz identidad a la izquierda y soluciones a la derecha):
// Solución del sistema:
// x1 = 1.5
// x2 = 1
// x3 = 3.5
