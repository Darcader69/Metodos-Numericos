## Regresión Lineal

### Definición

La regresión lineal es un método estadístico que permite obtener la recta que mejor representa la relación entre dos variables. Esta recta puede utilizarse para realizar estimaciones y predicciones.

### Fórmula

y = a + bx

Pendiente:

b = [nΣxy - (Σx)(Σy)] / [nΣx² - (Σx)²]

Intercepto:

a = (Σy - bΣx) / n

### Algoritmo

1. Obtener los datos experimentales.
2. Calcular las sumatorias requeridas.
3. Calcular la pendiente.
4. Calcular el intercepto.
5. Construir la ecuación de la recta.
6. Mostrar el modelo obtenido.

### Código

```python
# ==================================================
# REGRESIÓN LINEAL
# Ejercicio 1
# ==================================================

x = [2, 4, 6, 8, 10]
y = [60, 65, 75, 85, 95]

n = len(x)

sx = sum(x)
sy = sum(y)

sxy = 0
sx2 = 0

for i in range(n):
    sxy += x[i] * y[i]
    sx2 += x[i] ** 2

b = ((n * sxy) - (sx * sy)) / ((n * sx2) - (sx ** 2))
a = (sy - b * sx) / n

print("Pendiente (b):", round(b, 4))
print("Intercepto (a):", round(a, 4))
print(f"Ecuación: y = {a:.4f} + {b:.4f}x")

# Resultado:
# y = 49.0000 + 4.4000x
```

### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%205/Regresi%C3%B3n%20Lineal)

### Pseudocódigo

Inicio

```text
Leer datos X
Leer datos Y

Calcular pendiente b

Calcular intercepto a

Mostrar ecuación
```

Fin

---
