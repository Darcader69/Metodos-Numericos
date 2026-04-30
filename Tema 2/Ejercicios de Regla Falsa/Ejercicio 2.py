def f(x):
    return x**2 - 5

a = 2
b = 3
tol = 0.0001
iteracion = 1

print("\nEJERCICIO 2")

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

# EJERCICIO 2
# Iteración: 1  Raíz: 2.2
# Iteración: 2  Raíz: 2.230769
# Iteración: 3  Raíz: 2.235294
# Iteración: 4  Raíz: 2.235955
# Iteración: 5  Raíz: 2.236052
# Raíz aproximada final: 2.236052