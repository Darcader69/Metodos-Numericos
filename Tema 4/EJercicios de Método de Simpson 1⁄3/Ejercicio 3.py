import math
print("\nEJERCICIO 3")

def f(x):
    return math.sin(x)

a = 0
b = math.pi
m = (a + b) / 2

resultado = (b - a) / 6 * (f(a) + 4*f(m) + f(b))

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 2.0944