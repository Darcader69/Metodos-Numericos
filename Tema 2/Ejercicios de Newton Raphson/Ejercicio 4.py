def f(x):
    return x**3 - 4*x - 9

def df(x):
    return 3*x**2 - 4

x = 2.5
tol = 0.0001
iteracion = 1

print("\nEJERCICIO 4")

while True:
    xn = x - f(x) / df(x)

    print("Iteración:", iteracion, " Raíz:", round(xn, 6))

    if abs(xn - x) < tol:
        break

    x = xn
    iteracion += 1

print("Raíz aproximada final:", round(xn, 6))

#EJERCICIO 4
#Iteración: 1  Raíz: 2.728814
#Iteración: 2  Raíz: 2.706749
#Iteración: 3  Raíz: 2.706528
#Iteración: 4  Raíz: 2.706528
#Raíz aproximada final: 2.706528