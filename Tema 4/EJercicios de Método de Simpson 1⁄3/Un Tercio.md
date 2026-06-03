## Método de Simpson 1/3

### Definición

El método de Simpson 1/3 es una técnica de integración numérica que aproxima la función mediante parábolas de segundo grado. Generalmente proporciona resultados más precisos que el método del trapecio para funciones continuas y suaves. Requiere que el número de subintervalos sea par.

### Fórmula

Simpson 1/3 simple:

I ≈ (b-a)/6 · [f(a)+4f((a+b)/2)+f(b)]

Simpson 1/3 compuesto:

I ≈ h/3 · [f(x₀)+4Σf(xᵢ)+2Σf(xⱼ)+f(xₙ)]

donde:

* h = (b-a)/n
* n debe ser par

### Algoritmo

1. Definir la función f(x).
2. Establecer límites de integración.
3. Dividir el intervalo en un número par de subintervalos.
4. Evaluar la función en cada punto.
5. Aplicar los coeficientes 4 y 2 según corresponda.
6. Calcular la integral aproximada.

### Código

```python
print("EJERCICIO 1")

def f(x):
    return x**2 + 2*x

a = 0
b = 2
m = (a + b) / 2

resultado = (b - a) / 6 * (f(a) + 4*f(m) + f(b))

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 6.6667
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%204/EJercicios%20de%20M%C3%A9todo%20de%20Simpson%201%E2%81%843)

### Pseudocódigo

Inicio

```
Leer a,b,n

h ← (b-a)/n

suma ← f(a)+f(b)

Para i ← 1 hasta n-1

    Si i es impar Entonces
        suma ← suma + 4*f(a+i*h)
    Sino
        suma ← suma + 2*f(a+i*h)
    FinSi

FinPara

integral ← (h/3)*suma

Mostrar integral
```

Fin

---
