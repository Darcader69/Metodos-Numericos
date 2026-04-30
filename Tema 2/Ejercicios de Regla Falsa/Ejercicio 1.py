import math
def f(x):
    return x**3 - x - 2

a = 1
b = 2
tol = 0.0001
iteracion = 1

print("EJERCICIO 1")

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


# EJERCICIO 1
# Iteración: 1  Raíz: 1.333333
# Iteración: 2  Raíz: 1.462687
# Iteración: 3  Raíz: 1.504019
# Iteración: 4  Raíz: 1.516331
# Iteración: 5  Raíz: 1.519919
# Iteración: 6  Raíz: 1.520957
# Iteración: 7  Raíz: 1.521258
# Iteración: 8  Raíz: 1.521344
# Iteración: 9  Raíz: 1.52137
# Raíz aproximada final: 1.52137