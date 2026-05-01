import math


print("\nEJERCICIO 4")

def f(x):
    return math.exp(x)

a = 0
b = 1
h = (b - a) / 3

x1 = a + h
x2 = a + 2*h

resultado = (3*h/8) * (f(a) + 3*f(x1) + 3*f(x2) + f(b))

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 1.7185