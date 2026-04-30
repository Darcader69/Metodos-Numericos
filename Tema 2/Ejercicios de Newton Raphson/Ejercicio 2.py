def f(x):
    return x**2 - 5

def df(x):
    return 2*x

x = 2
tol = 0.0001
iteracion = 1

print("\nEJERCICIO 2")

while True:
    xn = x - f(x) / df(x)

    print("Iteración:", iteracion, " Raíz:", round(xn, 6))

    if abs(xn - x) < tol:
        break

    x = xn
    iteracion += 1

print("Raíz aproximada final:", round(xn, 6))

#EJERCICIO 2
#Iteración: 1  Raíz: 2.25
#teración: 2  Raíz: 2.236111
#Iteración: 3  Raíz: 2.236068
#Raíz aproximada final: 2.236068