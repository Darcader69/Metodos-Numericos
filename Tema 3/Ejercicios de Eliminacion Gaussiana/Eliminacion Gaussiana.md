## Método de Eliminación Gaussiana

### Definición

El método de eliminación gaussiana es un procedimiento directo que transforma la matriz aumentada de un sistema de ecuaciones lineales en una matriz triangular superior mediante operaciones elementales por filas. Una vez obtenida esta forma, las incógnitas se calculan utilizando sustitución regresiva. Es uno de los métodos más importantes en álgebra lineal numérica debido a su eficiencia y facilidad de implementación.

### Fórmula

Sistema general:

A·X = B

Matriz aumentada:

[A|B]

Operaciones elementales:

Fi ← Fi - m·Fk

donde:

m = aik / akk

### Algoritmo

1. Formar la matriz aumentada.
2. Seleccionar el pivote de la primera columna.
3. Eliminar los elementos debajo del pivote.
4. Repetir el proceso para las siguientes columnas.
5. Obtener una matriz triangular superior.
6. Aplicar sustitución regresiva.
7. Obtener los valores de las incógnitas.

### Código

```
import numpy as np
A = np.array([[2.0, 1.0],
              [1.0, -1.0]])

B = np.array([5.0, 1.0])

n = len(B)

for k in range(n - 1):
    for i in range(k + 1, n):
        factor = A[i][k] / A[k][k]
        for j in range(k, n):
            A[i][j] = A[i][j] - factor * A[k][j]
        B[i] = B[i] - factor * B[k]

x = np.zeros(n)

for i in range(n - 1, -1, -1):
    suma = 0
    for j in range(i + 1, n):
        suma += A[i][j] * x[j]
    x[i] = (B[i] - suma) / A[i][i]

print("EJERCICIO 1")
print("Solución:", x)

#EJERCICIO 1
#Solución: [2. 1.]
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%203/Ejercicios%20de%20Eliminacion%20Gaussiana)

### Pseudocódigo

Inicio

```
Leer matriz A y vector B

Para k ← 1 hasta n-1

    Para i ← k+1 hasta n

        m ← A[i,k] / A[k,k]

        Para j ← k hasta n

            A[i,j] ← A[i,j] - m*A[k,j]

        FinPara

        B[i] ← B[i] - m*B[k]

    FinPara

FinPara

Aplicar sustitución regresiva

Mostrar solución
```

Fin
