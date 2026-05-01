def f(x):
    return x**3 - x - 2

x0 = 1
x1 = 2
tol = 0.0001
iteracion = 1

print("EJERCICIO 1")

while True:
    x2 = x1 - (f(x1) * (x1 - x0)) / (f(x1) - f(x0))

    print("Iteración:", iteracion, " Raíz:", round(x2, 6))

    if abs(x2 - x1) < tol:
        break

    x0 = x1
    x1 = x2
    iteracion += 1

print("Raíz aproximada final:", round(x2, 6))

#EJERCICIO 1
#Iteración: 1  Raíz: 1.333333
#Iteración: 2  Raíz: 1.462687
#Iteración: 3  Raíz: 1.531169
#Iteración: 4  Raíz: 1.520926
#Iteración: 5  Raíz: 1.521376
#Iteración: 6  Raíz: 1.52138
#Raíz aproximada final: 1.52138