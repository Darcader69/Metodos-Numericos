## Método de Gauss-Jordan

### Definición

El método de Gauss-Jordan es una extensión de la eliminación gaussiana que continúa el proceso de eliminación hasta convertir la matriz aumentada en una matriz escalonada reducida. Esto permite obtener directamente los valores de las incógnitas sin necesidad de realizar sustitución regresiva. También se utiliza para calcular matrices inversas y resolver sistemas lineales de forma exacta.

### Fórmula

Operación elemental:

Fi ← Fi / Pivote

Posteriormente:

Fk ← Fk - (Factor × Fi)

Forma final:

[I|X]

donde:

* I = matriz identidad.
* X = solución del sistema.

### Algoritmo

1. Formar la matriz aumentada.
2. Seleccionar un pivote.
3. Convertir el pivote en 1.
4. Hacer cero todos los elementos arriba y abajo del pivote.
5. Repetir para todas las columnas.
6. Obtener la matriz identidad.
7. Leer la solución directamente.

### Código

```python
print("\nEJERCICIO 1")

A = [
    [1.0, 2.0, 3.0, 14.0],
    [2.0, 1.0, 1.0, 10.0],
    [3.0, 2.0, 2.0, 16.0]
]

n = 3

for i in range(n):
    pivote = A[i][i]

    for j in range(n + 1):
        A[i][j] /= pivote

    for k in range(n):
        if k != i:
            factor = A[k][i]

            for j in range(n + 1):
                A[k][j] -= factor * A[i][j]

print("x =", A[0][3])
print("y =", A[1][3])
print("z =", A[2][3])

# Resultado:
# x = 4.000000000000003
# y = -4.000000000000009
# z = 6.000000000000005
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%203/Ejercicios%20de%20Gauss%20Jordan)

### Pseudocódigo

Inicio

```
Leer matriz aumentada

Para i ← 1 hasta n

    pivote ← A[i,i]

    Dividir toda la fila entre pivote

    Para k ← 1 hasta n

        Si k ≠ i Entonces

            factor ← A[k,i]

            Fila k ← Fila k - factor*Fila i

        FinSi

    FinPara

FinPara

Mostrar solución
```

Fin
