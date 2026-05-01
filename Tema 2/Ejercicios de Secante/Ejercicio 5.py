import math
def f(x):
    return math.exp(x) - 3*x

x0 = 0
x1 = 1
tol = 0.0001
iteracion = 1

print("\nEJERCICIO 5")

while True:
    x2 = x1 - (f(x1) * (x1 - x0)) / (f(x1) - f(x0))

    print("Iteración:", iteracion, " Raíz:", round(x2, 6))

    if abs(x2 - x1) < tol:
        break

    x0 = x1
    x1 = x2
    iteracion += 1

print("Raíz aproximada final:", round(x2, 6))

#EJERCICIO 5
#Iteración: 1  Raíz: 0.780203
#Iteración: 2  Raíz: 0.496679
#Iteración: 3  Raíz: 0.635952
#Iteración: 4  Raíz: 0.62056
#Iteración: 5  Raíz: 0.61904
#Iteración: 6  Raíz: 0.619061
#Raíz aproximada final: 0.619061