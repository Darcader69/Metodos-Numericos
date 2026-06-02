## Método de Gauss-Seidel

### Definición

El método de Gauss-Seidel es un método iterativo utilizado para resolver sistemas de ecuaciones lineales. A diferencia de los métodos directos, genera aproximaciones sucesivas a la solución utilizando inmediatamente los valores calculados en la iteración actual. Su convergencia suele ser rápida cuando la matriz del sistema es diagonalmente dominante.

### Fórmula

Para un sistema de n ecuaciones:

xᵢ^(k+1) = (1/aᵢᵢ) [ bᵢ - Σ(aᵢⱼxⱼ^(k+1)) - Σ(aᵢⱼxⱼ^(k)) ]

donde:

* k = iteración actual.
* k+1 = nueva iteración.

### Algoritmo

1. Elegir valores iniciales.
2. Seleccionar una tolerancia.
3. Calcular cada variable utilizando los valores más recientes.
4. Determinar el error.
5. Repetir hasta cumplir la tolerancia.
6. Mostrar la solución aproximada.

### Código

```
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
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%203/Ejercicios%20de%20Gauss%20Seidel)


### Pseudocódigo

Inicio

```
Leer matriz A y vector B

Inicializar X

Repetir

    Para i ← 1 hasta n

        Calcular nuevo Xi

    FinPara

    Calcular error

Hasta que error < tolerancia

Mostrar solución
```

Fin

---
