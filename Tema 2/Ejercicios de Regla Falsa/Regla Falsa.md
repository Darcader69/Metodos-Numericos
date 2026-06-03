## Método de Regla Falsa

### Definición

El método de regla falsa, también conocido como falsa posición, mejora la idea de bisección utilizando una interpolación lineal entre los extremos del intervalo. Conserva la seguridad de trabajar con intervalos cerrados y generalmente converge más rápido que la bisección.

### Fórmula

c = (a·f(b) - b·f(a)) / (f(b) - f(a))

### Algoritmo

1. Seleccionar un intervalo [a,b].
2. Verificar cambio de signo.
3. Calcular el punto c usando la fórmula de regla falsa.
4. Evaluar f(c).
5. Sustituir uno de los extremos.
6. Repetir hasta cumplir la tolerancia.

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
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%202/Ejercicios%20de%20Regla%20Falsa)


### Pseudocódigo

Inicio

```
Leer a,b,tolerancia

Mientras error > tolerancia

    c ← (a*f(b)-b*f(a)) / (f(b)-f(a))

    Si f(a)*f(c) < 0 Entonces
        b ← c
    Sino
        a ← c
    FinSi

FinMientras

Mostrar c
```

Fin

---

