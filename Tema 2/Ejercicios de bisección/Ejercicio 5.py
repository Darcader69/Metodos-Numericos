import math
def f5(x):
    return math.exp(x) - 3*x

a = 0
b = 1
tol = 0.0001

while (b - a) / 2 > tol:
    c = (a + b) / 2
    
    if f5(a) * f5(c) < 0:
        b = c
    else:
        a = c

print("Raíz aproximada:", c)

# Raíz aproximada: 0.6190185546875