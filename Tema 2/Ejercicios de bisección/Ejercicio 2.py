import math
def f2(x):
    return x**2 - 5

a = 2
b = 3
tol = 0.0001

while (b - a) / 2 > tol:
    c = (a + b) / 2
    
    if f2(a) * f2(c) < 0:
        b = c
    else:
        a = c

print("Raíz aproximada:", c)


# Raíz aproximada: 1.5213623046875