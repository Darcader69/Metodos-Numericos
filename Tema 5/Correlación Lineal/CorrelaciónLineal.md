## Correlación Lineal

### Definición

La correlación lineal mide la fuerza y dirección de la relación existente entre dos variables cuantitativas. Se expresa mediante el coeficiente de correlación de Pearson, cuyo valor se encuentra entre -1 y 1.

### Fórmula

r = [nΣxy - (Σx)(Σy)] / √([nΣx² - (Σx)²][nΣy² - (Σy)²])

### Algoritmo

1. Obtener los pares de datos.
2. Calcular las sumatorias necesarias.
3. Sustituir en la fórmula de Pearson.
4. Obtener el coeficiente de correlación.
5. Interpretar el resultado.

### Código

```python
# ==================================================
# CORRELACIÓN LINEAL
# Ejercicio 1
# ==================================================

import math

x = [1, 2, 3, 4, 5]
y = [2, 4, 5, 4, 5]

n = len(x)

sum_x = sum(x)
sum_y = sum(y)

sum_xy = 0
sum_x2 = 0
sum_y2 = 0

for i in range(n):
    sum_xy += x[i] * y[i]
    sum_x2 += x[i] ** 2
    sum_y2 += y[i] ** 2

numerador = (n * sum_xy) - (sum_x * sum_y)

denominador = math.sqrt(
    ((n * sum_x2) - (sum_x ** 2)) *
    ((n * sum_y2) - (sum_y ** 2))
)

r = numerador / denominador

print("Coeficiente de correlación =", round(r, 4))

# Resultado:
# Coeficiente de correlación = 0.7746
```

### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%205/Correlaci%C3%B3n%20Lineal)

### Pseudocódigo

Inicio

```text
Leer datos X
Leer datos Y

Calcular sumatorias

Aplicar fórmula de Pearson

Mostrar r
```

Fin

---
