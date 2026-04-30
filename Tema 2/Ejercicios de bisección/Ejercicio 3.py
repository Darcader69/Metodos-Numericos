import math
def f3(x):
    return math.cos(x) - x

a = 0
b = 1
tol = 0.0001


while (b - a) / 2 > tol:
    c = (a + b) / 2
    
    if f3(a) * f3(c) < 0:
        b = c
    else:
        a = c

print("Raíz aproximada:", c)

# Raíz aproximada: 0.7391357421875