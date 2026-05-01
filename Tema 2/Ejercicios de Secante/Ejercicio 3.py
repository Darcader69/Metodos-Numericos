import math
def f(x):
    return math.cos(x) - x

x0 = 0
x1 = 1
tol = 0.0001
iteracion = 1

print("\nEJERCICIO 3")

while True:
    x2 = x1 - (f(x1) * (x1 - x0)) / (f(x1) - f(x0))

    print("Iteración:", iteracion, " Raíz:", round(x2, 6))

    if abs(x2 - x1) < tol:
        break

    x0 = x1
    x1 = x2
    iteracion += 1

print("Raíz aproximada final:", round(x2, 6))

#EJERCICIO 3
#Iteración: 1  Raíz: 0.685073
#Iteración: 2  Raíz: 0.736299
#Iteración: 3  Raíz: 0.739119
#Iteración: 4  Raíz: 0.739085
#Raíz aproximada final: 0.739085