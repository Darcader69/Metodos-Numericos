## Método de Euler

### Definición

El método de Euler es un procedimiento numérico utilizado para aproximar la solución de ecuaciones diferenciales ordinarias con condiciones iniciales conocidas. Su funcionamiento se basa en utilizar la pendiente proporcionada por la ecuación diferencial para estimar el valor de la función en puntos sucesivos. Es uno de los métodos más sencillos y constituye la base para técnicas más avanzadas de resolución numérica.

### Fórmula

y(i+1) = y(i) + h · f(x(i), y(i))

Donde:

- h = tamaño del paso
- f(x,y) = ecuación diferencial
- y(i+1) = aproximación siguiente

### Algoritmo

1. Definir la ecuación diferencial.
2. Establecer la condición inicial.
3. Elegir el tamaño de paso.
4. Calcular la pendiente mediante f(x,y).
5. Aplicar la fórmula de Euler.
6. Repetir hasta alcanzar el punto deseado.

### Código

```python
# ==================================================
# MÉTODO DE EULER
# Ejercicio 1
# dy/dx = x + y
# ==================================================

def f(x, y):
    return x + y

x0 = 0
y0 = 1
h = 0.1
n = 10

print("Iteración\t x\t\t y")

for i in range(n):

    y0 = y0 + h * f(x0, y0)
    x0 = x0 + h

    print(i + 1, "\t\t", round(x0,4), "\t", round(y0,4))

# Resultado final aproximado:
# Iteración        x               y
    #1                0.1     1.1
    #2                0.2     1.22
    #3                0.3     1.362
    #4                0.4     1.5282
    #5                0.5     1.721
    #6                0.6     1.9431
    #7                0.7     2.1974
    #8                0.8     2.4872
    #9                0.9     2.8159
    #10               1.0     3.1875
```

### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%206/Ejercicios%20Euler)

### Pseudocódigo

Inicio

```text
Leer x0, y0
Leer h
Leer n

Para i ← 1 hasta n

    y ← y + h*f(x,y)
    x ← x + h

FinPara

Mostrar y
```

Fin

---
