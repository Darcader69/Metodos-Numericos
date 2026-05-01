import math


print("\nEJERCICIO 4")

def f(x):
    return math.exp(x)

a = 0
b = 1
t1 = -1 / math.sqrt(3)
t2 = 1 / math.sqrt(3)

x1 = ((b - a) / 2) * t1 + (a + b) / 2
x2 = ((b - a) / 2) * t2 + (a + b) / 2

resultado = ((b - a) / 2) * (f(x1) + f(x2))

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 1.7179


