def f(x):
    return x**3 - x - 2

def df(x):
    return 3*x**2 - 1

x = 1.5
tol = 0.0001
iteracion = 1

print("EJERCICIO 1")

while True:
    xn = x - f(x) / df(x)

    print("Iteración:", iteracion, " Raíz:", round(xn, 6))

    if abs(xn - x) < tol:
        break

    x = xn
    iteracion += 1

print("Raíz aproximada final:", round(xn, 6))

#EJERCICIO 1
#Iteración: 1  Raíz: 1.521739
#Iteración: 2  Raíz: 1.52138
#Iteración: 3  Raíz: 1.52138
#Raíz aproximada final: 1.52138