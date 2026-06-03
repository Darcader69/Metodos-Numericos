## Interpolación Segmentada

### Definición

La interpolación segmentada, también conocida como interpolación lineal por tramos, consiste en aproximar valores intermedios utilizando segmentos de recta construidos entre pares consecutivos de datos conocidos. Cada intervalo se analiza de forma independiente, permitiendo realizar estimaciones rápidas y sencillas.

### Fórmula

y = y₀ + ((y₁ - y₀)/(x₁ - x₀))(x - x₀)

### Algoritmo

1. Identificar los dos puntos conocidos más cercanos.
2. Calcular la pendiente entre ambos puntos.
3. Sustituir el valor deseado en la fórmula de interpolación.
4. Obtener el valor aproximado.
5. Mostrar el resultado.

### Código

```python
# ==================================================
# INTERPOLACIÓN SEGMENTADA
# Ejercicio 1
# ==================================================

x = [0, 2, 4, 6]
y = [10, 14, 18, 22]

xp = 3

for i in range(len(x)-1):

    if x[i] <= xp <= x[i+1]:

        yp = y[i] + ((y[i+1] - y[i]) /
                    (x[i+1] - x[i])) * (xp - x[i])

        break

print("Valor interpolado:", yp)

# Resultado:
# Valor interpolado: 16.0
```

### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%205/Interpolaci%C3%B3n%20Segmentada)

### Pseudocódigo

Inicio

```text
Leer x0,y0
Leer x1,y1
Leer x

y ← y0 + ((y1-y0)/(x1-x0))*(x-x0)

Mostrar y
```

Fin

---
