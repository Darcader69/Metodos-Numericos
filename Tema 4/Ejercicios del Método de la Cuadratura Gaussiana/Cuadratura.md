## Método de la Cuadratura Gaussiana

### Definición

La cuadratura gaussiana es un método avanzado de integración numérica que aproxima el valor de una integral definida mediante una combinación óptima de nodos (puntos de evaluación) y pesos. A diferencia de métodos como Trapecio o Simpson, no utiliza divisiones uniformes del intervalo, sino puntos estratégicamente seleccionados para maximizar la precisión con el menor número de evaluaciones de la función. Debido a su eficiencia, es ampliamente utilizada en ingeniería, física computacional y análisis numérico.

### Fórmula

Forma general:

I ≈ Σ wi · f(xi)

donde:

* xi = nodos o puntos de Gauss.
* wi = pesos asociados a cada nodo.
* n = número de puntos utilizados.

Para la Cuadratura de Gauss-Legendre de 2 puntos:

Nodos:

x₁ = -1/√3

x₂ = 1/√3

Pesos:

w₁ = 1

w₂ = 1

La aproximación queda:

I ≈ f(-1/√3) + f(1/√3)

Si el intervalo es [a,b], se utiliza la transformación:

x = ((b-a)/2)t + ((a+b)/2)

y la fórmula se convierte en:

I ≈ ((b-a)/2) Σ wi · f(xi)

### Algoritmo

1. Definir la función a integrar.
2. Seleccionar el número de puntos de Gauss.
3. Obtener los nodos y pesos correspondientes.
4. Transformar el intervalo si no es [-1,1].
5. Evaluar la función en cada nodo.
6. Multiplicar cada evaluación por su peso.
7. Sumar todos los productos obtenidos.
8. Multiplicar por el factor de transformación del intervalo.
9. Mostrar el valor aproximado de la integral.

### Código

```
import math


print("EJERCICIO 1")

def f(x):
    return x**2 + 2*x

a = 0
b = 2

t1 = -1 / math.sqrt(3)
t2 = 1 / math.sqrt(3)

x1 = ((b - a) / 2) * t1 + (a + b) / 2
x2 = ((b - a) / 2) * t2 + (a + b) / 2

resultado = ((b - a) / 2) * (f(x1) + f(x2))

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 6.6667
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%204/Ejercicios%20del%20M%C3%A9todo%20de%20la%20Cuadratura%20Gaussiana)


### Pseudocódigo

Inicio

```
Leer a,b

Definir nodos y pesos

suma ← 0

Para i ← 1 hasta n

    x ← ((b-a)/2)*nodo[i] + ((a+b)/2)

    suma ← suma + peso[i] * f(x)

FinPara

integral ← ((b-a)/2) * suma

Mostrar integral
```

Fin

### Ventajas

* Alta precisión con pocas evaluaciones de la función.
* Reduce significativamente el error numérico.
* Muy eficiente para funciones suaves.
* Requiere menos puntos que Trapecio o Simpson para alcanzar la misma exactitud.

### Desventajas

* Implementación más compleja.
* Requiere tablas de nodos y pesos.
* Menos intuitivo que los métodos clásicos de integración.

### Aplicaciones

* Ingeniería estructural.
* Mecánica computacional.
* Simulación numérica.
* Física aplicada.
* Métodos de elementos finitos.
* Cálculo científico de alta precisión.
