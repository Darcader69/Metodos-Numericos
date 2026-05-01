import math


print("\nEJERCICIO 2")

def f(x):
    return x**3 + 1

a = 1
b = 3

t1 = -1 / math.sqrt(3)
t2 = 1 / math.sqrt(3)

x1 = ((b - a) / 2) * t1 + (a + b) / 2
x2 = ((b - a) / 2) * t2 + (a + b) / 2

resultado = ((b - a) / 2) * (f(x1) + f(x2))

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 22.0