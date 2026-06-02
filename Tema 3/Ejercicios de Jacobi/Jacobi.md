## Método de Jacobi

### Definición

El método de Jacobi es un método iterativo para resolver sistemas de ecuaciones lineales. En cada iteración, todas las variables se recalculan utilizando exclusivamente los valores obtenidos en la iteración anterior. Esto permite realizar actualizaciones simultáneas y facilita su implementación en procesos paralelos.

### Fórmula

xᵢ^(k+1) = (1/aᵢᵢ) [ bᵢ - Σ(aᵢⱼxⱼ^(k)) ]

para:

j ≠ i

### Algoritmo

1. Elegir valores iniciales.
2. Definir la tolerancia.
3. Calcular todas las variables usando únicamente la iteración anterior.
4. Calcular el error.
5. Repetir hasta alcanzar la precisión requerida.
6. Mostrar la solución.

### Código

```
print("EJERCICIO 1")

x = y = z = 0
tol = 0.0001

for i in range(50):
    xn = (12 - y - z) / 10
    yn = (13 - 2*x - z) / 10
    zn = (14 - 2*x - 2*y) / 10

    error = max(abs(xn - x), abs(yn - y), abs(zn - z))

    x, y, z = xn, yn, zn

    if error < tol:
        break

print("x =", round(x, 4))
print("y =", round(y, 4))
print("z =", round(z, 4))

# Resultado:
# x = 1.0
# y = 1.0
# z = 1.0
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%202/Ejercicios%20de%20Newton%20Raphson)

### Pseudocódigo

Inicio

```
Leer matriz A y vector B

Inicializar X

Repetir

    Para i ← 1 hasta n

        Calcular Xi_nuevo

    FinPara

    Error ← máximo(|Xi_nuevo - Xi|)

    Actualizar X

Hasta que error < tolerancia

Mostrar solución
```

Fin
