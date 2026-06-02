## Método de Simpson 3/8

### Definición

El método de Simpson 3/8 utiliza polinomios de tercer grado para aproximar la función dentro del intervalo de integración. Es especialmente útil cuando el número de subintervalos es múltiplo de tres y suele emplearse en combinación con Simpson 1/3 para mejorar la flexibilidad del cálculo.

### Fórmula

Simpson 3/8 simple:

I ≈ (3h/8) · [f(x₀)+3f(x₁)+3f(x₂)+f(x₃)]

donde:

h = (b-a)/3

Simpson 3/8 compuesto:

I ≈ (3h/8) · [f(x₀)+3Σf(xᵢ)+2Σf(xⱼ)+f(xₙ)]

### Algoritmo

1. Definir la función.
2. Dividir el intervalo en múltiplos de tres.
3. Evaluar la función en los nodos.
4. Aplicar los coeficientes correspondientes.
5. Calcular la aproximación de la integral.

### Código

```
print("EJERCICIO 1")

def f(x):
    return x**2 + 2*x

a = 0
b = 3
h = (b - a) / 3

x1 = a + h
x2 = a + 2*h

resultado = (3*h/8) * (f(a) + 3*f(x1) + 3*f(x2) + f(b))

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 18.0
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%204/Ejerciccios%20de%20M%C3%A9todo%20de%20Simpson%203%E2%81%848)

### Pseudocódigo

Inicio

```
Leer a,b,n

h ← (b-a)/n

suma ← f(a)+f(b)

Para i ← 1 hasta n-1

    Si i MOD 3 = 0 Entonces
        suma ← suma + 2*f(a+i*h)
    Sino
        suma ← suma + 3*f(a+i*h)
    FinSi

FinPara

integral ← (3*h/8)*suma

Mostrar integral
```

Fin
