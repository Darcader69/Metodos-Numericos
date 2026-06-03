## Método de Bisección

### Definición

El método de bisección es un método cerrado que localiza raíces dividiendo repetidamente un intervalo en dos partes iguales. Requiere que la función cambie de signo dentro del intervalo inicial, garantizando así la existencia de una raíz. Es uno de los métodos más seguros y estables, aunque su convergencia suele ser más lenta que otros métodos iterativos.

### Fórmula

Punto medio:

c = (a + b) / 2

Condición:

f(a) · f(c) < 0

entonces la raíz pertenece al intervalo [a,c].

Si:

f(a) · f(c) > 0

entonces la raíz pertenece al intervalo [c,b].

### Algoritmo

1. Definir la función f(x).
2. Seleccionar los extremos a y b.
3. Verificar que exista cambio de signo.
4. Calcular el punto medio c.
5. Evaluar f(c).
6. Reducir el intervalo.
7. Repetir hasta alcanzar la tolerancia.

### Código

```python
import math
def f1(x):
    return x**3 - x - 2

a = 1
b = 2
tol = 0.0001

while (b - a) / 2 > tol:
    c = (a + b) / 2
    
    if f1(c) == 0:
        break
    elif f1(a) * f1(c) < 0:
        b = c
    else:
        a = c

print("Raíz aproximada:", c)

# Raíz aproximada: 1.5213623046875
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%202/Ejercicios%20de%20bisecci%C3%B3n)


### Pseudocódigo

Inicio

```
Leer a,b,tolerancia

Mientras error > tolerancia

    c ← (a+b)/2

    Si f(a)*f(c) < 0 Entonces
        b ← c
    Sino
        a ← c
    FinSi

FinMientras

Mostrar c
```

Fin
