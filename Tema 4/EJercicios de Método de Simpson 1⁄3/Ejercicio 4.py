import math
print("\nEJERCICIO 4")

def f(x):
    return math.exp(x)

a = 0
b = 1
m = (a + b) / 2

resultado = (b - a) / 6 * (f(a) + 4*f(m) + f(b))

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 1.7189