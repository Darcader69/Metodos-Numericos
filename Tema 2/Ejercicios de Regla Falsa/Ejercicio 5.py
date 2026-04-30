import math
def f(x):
    return math.exp(x) - 3*x

a = 0
b = 1
tol = 0.0001
iteracion = 1

print("\nEJERCICIO 5")

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

#EJERCICIO 5
#Iteración: 1  Raíz: 0.780203
#Iteración: 2  Raíz: 0.673347
#Iteración: 3  Raíz: 0.635682
#Iteración: 4  Raíz: 0.623991
#Iteración: 5  Raíz: 0.620509
#Iteración: 6  Raíz: 0.619485
#Iteración: 7  Raíz: 0.619185
#Iteración: 8  Raíz: 0.619098
#Raíz aproximada final: 0.619098