def f(x):
    return x**3 - 4*x - 9

a = 2
b = 3
tol = 0.0001
iteracion = 1

print("\nEJERCICIO 4")

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

#EJERCICIO 4
#Iteración: 1  Raíz: 2.6
#Iteración: 2  Raíz: 2.693252
#Iteración: 3  Raíz: 2.704918
#Iteración: 4  Raíz: 2.706333
#Iteración: 5  Raíz: 2.706504
#Iteración: 6  Raíz: 2.706525
#Raíz aproximada final: 2.706525