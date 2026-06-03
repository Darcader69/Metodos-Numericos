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
import math

x = [1,2,3,4,5]
y = [2,4,5,4,5]

n = len(x)

sx = sum(x)
sy = sum(y)

sxy = sum(x[i]*y[i] for i in range(n))
sx2 = sum(valor**2 for valor in x)
sy2 = sum(valor**2 for valor in y)

r = ((n*sxy)-(sx*sy)) / math.sqrt(
    ((n*sx2)-(sx**2)) *
    ((n*sy2)-(sy**2))
)

print("Correlación:", round(r,4))

# Correlación: 0.7746
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
