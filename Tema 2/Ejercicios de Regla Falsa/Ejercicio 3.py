import math

def f(x):
    return math.cos(x) - x

a = 0
b = 1
tol = 0.0001
iteracion = 1

print("\nEJERCICIO 3")

while True:
    fa = f(a)
    fb = f(b)

    c = (a * fb - b * fa) / (fb - fa)
    fc = f(c)

    print("Iteración:", iteracion, " Raíz:", round(c, 6))

    if abs(fc) < tol:
        break

    if fa * fc < 0:
        b = c
    else:
        a = c

    iteracion += 1

print("Raíz aproximada final:", round(c, 6))

#EJERCICIO 3
#Iteración: 1  Raíz: 0.685073
#Iteración: 2  Raíz: 0.736299
#Iteración: 3  Raíz: 0.738945
#Iteración: 4  Raíz: 0.739078
#Raíz aproximada final: 0.739078
