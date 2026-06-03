## Método de Newton-Raphson

### Definición

El método de Newton-Raphson es un método abierto que utiliza derivadas para aproximar raíces mediante líneas tangentes sucesivas. Su convergencia suele ser muy rápida cuando el valor inicial es adecuado.

### Fórmula

x(n+1) = x(n) - f(x(n))/f'(x(n))

### Algoritmo

1. Elegir una aproximación inicial.
2. Evaluar la función y su derivada.
3. Calcular la nueva aproximación.
4. Calcular el error.
5. Repetir hasta cumplir la tolerancia.

### Código

```python
def f(x):
    return x**3 - x - 2

def df(x):
    return 3*x**2 - 1

x = 1.5
tol = 0.0001
iteracion = 1

print("EJERCICIO 1")

while True:
    xn = x - f(x) / df(x)

    print("Iteración:", iteracion, " Raíz:", round(xn, 6))

    if abs(xn - x) < tol:
        break

    x = xn
    iteracion += 1

print("Raíz aproximada final:", round(xn, 6))

#EJERCICIO 1
#Iteración: 1  Raíz: 1.521739
#Iteración: 2  Raíz: 1.52138
#Iteración: 3  Raíz: 1.52138
#Raíz aproximada final: 1.52138
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%202/Ejercicios%20de%20Newton%20Raphson)



### Pseudocódigo

Inicio

```
Leer x0,tolerancia

Mientras error > tolerancia

    x1 ← x0 - f(x0)/f'(x0)

    error ← |x1-x0|

    x0 ← x1

FinMientras

Mostrar x1
```

Fin
