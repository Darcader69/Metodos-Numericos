import math

def f(x):
    return math.exp(x) - 3*x

def df(x):
    return math.exp(x) - 3

x = 0.5
tol = 0.0001
iteracion = 1

print("\nEJERCICIO 5")

while True:
    xn = x - f(x) / df(x)

    print("Iteración:", iteracion, " Raíz:", round(xn, 6))

    if abs(xn - x) < tol:
        break

    x = xn
    iteracion += 1

print("Raíz aproximada final:", round(xn, 6))

#EJERCICIO 5
#Iteración: 1  Raíz: 0.61006
#Iteración: 2  Raíz: 0.618997
#Iteración: 3  Raíz: 0.619061
#Raíz aproximada final: 0.619061