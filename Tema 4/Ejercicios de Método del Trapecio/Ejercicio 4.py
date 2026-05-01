import math
print("\nEJERCICIO 4")

def f(x):
    return math.exp(x)

a = 0
b = 1

resultado = (b - a) * (f(a) + f(b)) / 2

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 1.8591