import math
print("\nEJERCICIO 2")

def f(x):
    return math.sin(x)

a = 0
b = math.pi

resultado = (b - a) * (f(a) + f(b)) / 2

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 0.0