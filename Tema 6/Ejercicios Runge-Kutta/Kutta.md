## Método de Runge-Kutta

### Definición

El método de Runge-Kutta de cuarto orden (RK4) es uno de los algoritmos más utilizados para resolver ecuaciones diferenciales ordinarias. Utiliza varias pendientes intermedias dentro de cada intervalo para obtener una aproximación mucho más precisa que el método de Euler sin requerir derivadas de orden superior.

### Fórmula

k₁ = h·f(x,y)

k₂ = h·f(x+h/2, y+k₁/2)

k₃ = h·f(x+h/2, y+k₂/2)

k₄ = h·f(x+h, y+k₃)

y(i+1) = y(i) + (k₁ + 2k₂ + 2k₃ + k₄)/6

### Algoritmo

1. Definir la ecuación diferencial.
2. Establecer las condiciones iniciales.
3. Calcular k₁.
4. Calcular k₂.
5. Calcular k₃.
6. Calcular k₄.
7. Actualizar el valor de y.
8. Repetir el proceso hasta completar las iteraciones.

### Código

```python
# ==================================================
# MÉTODO DE RUNGE-KUTTA DE 4° ORDEN
# Ejercicio 1
# dy/dx = x + y
# ==================================================

def f(x, y):
    return x + y

x = 0
y = 1

h = 0.1
n = 10

print("Paso\t x\t\t y")

for i in range(n):

    k1 = h * f(x, y)
    k2 = h * f(x + h/2, y + k1/2)
    k3 = h * f(x + h/2, y + k2/2)
    k4 = h * f(x + h, y + k3)

    y = y + (k1 + 2*k2 + 2*k3 + k4) / 6
    x = x + h

    print(i+1, "\t", round(x,4), "\t", round(y,6))

# Resultado final aproximado:
# Paso     x               y
#1        0.1     1.110342
#2        0.2     1.242805
#3        0.3     1.399717
#4        0.4     1.583648
#5        0.5     1.797441
#6        0.6     2.044236
#7        0.7     2.327503
#8        0.8     2.651079
#9        0.9     3.019203
#10       1.0     3.436559
```

### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%206/Ejercicios%20Runge-Kutta)

### Pseudocódigo

Inicio

```text
Leer x0, y0
Leer h
Leer n

Para i ← 1 hasta n

    Calcular k1
    Calcular k2
    Calcular k3
    Calcular k4

    y ← y + (k1+2k2+2k3+k4)/6
    x ← x + h

FinPara

Mostrar y
```

Fin

---
