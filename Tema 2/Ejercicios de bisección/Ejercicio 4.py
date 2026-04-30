import math
def f4(x):
    return x**3 - 4*x - 9

a = 2
b = 3
tol = 0.0001


while (b - a) / 2 > tol:
    c = (a + b) / 2
    
    if f4(a) * f4(c) < 0:
        b = c
    else:
        a = c

print("Raíz aproximada:", c)

# Raíz aproximada: 2.7064208984375
