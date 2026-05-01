def f(x):
    return x**3 - 4*x - 9

x0 = 2
x1 = 3
tol = 0.0001
iteracion = 1

print("\nEJERCICIO 4")

while True:
    x2 = x1 - (f(x1) * (x1 - x0)) / (f(x1) - f(x0))

    print("Iteración:", iteracion, " Raíz:", round(x2, 6))

    if abs(x2 - x1) < tol:
        break

    x0 = x1
    x1 = x2
    iteracion += 1

print("Raíz aproximada final:", round(x2, 6))

#EJERCICIO 4
#Iteración: 1  Raíz: 2.6
#Iteración: 2  Raíz: 2.693252
#Iteración: 3  Raíz: 2.707193
#Iteración: 4  Raíz: 2.706524
#Iteración: 5  Raíz: 2.706528
#Raíz aproximada final: 2.706528