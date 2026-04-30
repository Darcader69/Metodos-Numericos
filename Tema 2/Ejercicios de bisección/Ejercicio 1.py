import math
def f1(x):
    return x**3 - x - 2

a = 1
b = 2
tol = 0.0001

while (b - a) / 2 > tol:
    c = (a + b) / 2
    
    if f1(c) == 0:
        break
    elif f1(a) * f1(c) < 0:
        b = c
    else:
        a = c

print("Raíz aproximada:", c)

# Raíz aproximada: 1.5213623046875