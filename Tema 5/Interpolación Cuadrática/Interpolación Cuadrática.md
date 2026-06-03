## Interpolación Cuadrática

### Definición

La interpolación cuadrática utiliza un polinomio de segundo grado para estimar valores intermedios a partir de tres puntos conocidos. Este método proporciona una aproximación más precisa que la interpolación lineal cuando los datos presentan una tendencia curva.

### Fórmula

P(x)=y₀L₀(x)+y₁L₁(x)+y₂L₂(x)

### Algoritmo

1. Seleccionar tres puntos conocidos.
2. Construir los polinomios base de Lagrange.
3. Evaluar el polinomio en el punto deseado.
4. Obtener el valor interpolado.
5. Mostrar el resultado.

### Código

```python
# ==================================================
# INTERPOLACIÓN CUADRÁTICA
# Ejercicio 1
# ==================================================

x0 = 1
x1 = 2
x2 = 4

y0 = 1
y1 = 4
y2 = 16

x = 3

L0 = ((x - x1) * (x - x2)) / ((x0 - x1) * (x0 - x2))
L1 = ((x - x0) * (x - x2)) / ((x1 - x0) * (x1 - x2))
L2 = ((x - x0) * (x - x1)) / ((x2 - x0) * (x2 - x1))

resultado = y0 * L0 + y1 * L1 + y2 * L2

print("Valor interpolado:", resultado)

# Resultado:
# Valor interpolado: 9.0
```

### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%205/Interpolaci%C3%B3n%20Cuadr%C3%A1tica)

### Pseudocódigo

Inicio

```text
Leer tres puntos conocidos
Leer x

Calcular L0
Calcular L1
Calcular L2

resultado ← y0*L0 + y1*L1 + y2*L2

Mostrar resultado
```

Fin

---
