## Método del Trapecio

### Definición

El método del trapecio es una técnica de integración numérica que aproxima el área bajo una curva reemplazando la función por segmentos rectos entre puntos consecutivos. Cada segmento forma un trapecio cuya área puede calcularse fácilmente. La suma de las áreas de todos los trapecios proporciona una aproximación de la integral definida.

### Fórmula

Trapecio simple:

I ≈ (b - a) / 2 · [f(a) + f(b)]

Trapecio compuesto:

I ≈ h/2 · [f(x₀) + 2Σf(xᵢ) + f(xₙ)]

donde:

* h = (b-a)/n
* n = número de subintervalos

### Algoritmo

1. Definir la función f(x).
2. Establecer los límites de integración.
3. Calcular el tamaño de paso h.
4. Evaluar la función en cada punto.
5. Aplicar la fórmula del trapecio.
6. Obtener la aproximación de la integral.

### Código

```
print("MÉTODO DEL TRAPECIO")

def f(x):
    return x**2 + 1

a = 0
b = 2

resultado = (b - a) * (f(a) + f(b)) / 2

print("Integral aproximada =", round(resultado, 6))

# Resultado:
# 6.0
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%204/Ejercicios%20de%20M%C3%A9todo%20del%20Trapecio)

### Pseudocódigo

Inicio

```
Leer a,b,n

h ← (b-a)/n

suma ← f(a)+f(b)

Para i ← 1 hasta n-1

    suma ← suma + 2*f(a+i*h)

FinPara

integral ← (h/2)*suma

Mostrar integral
```

Fin
