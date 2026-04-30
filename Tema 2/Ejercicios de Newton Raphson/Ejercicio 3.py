import math
def f(x):
    return math.cos(x) - x

def df(x):
    return -math.sin(x) - 1

x = 0.5
tol = 0.0001
iteracion = 1

print("\nEJERCICIO 3")

while True:
    xn = x - f(x) / df(x)

    print("Iteración:", iteracion, " Raíz:", round(xn, 6))

    if abs(xn - x) < tol:
        break

    x = xn
    iteracion += 1

print("Raíz aproximada final:", round(xn, 6))

#EJERCICIO 3
#Iteración: 1  Raíz: 0.755222
#Iteración: 2  Raíz: 0.739142
#Iteración: 3  Raíz: 0.739085
#Raíz aproximada final: 0.739085