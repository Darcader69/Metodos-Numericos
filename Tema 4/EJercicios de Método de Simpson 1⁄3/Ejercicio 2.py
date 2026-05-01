print("\nEJERCICIO 2")

def f(x):
    return x**3 + 1

a = 1
b = 3
m = (a + b) / 2

resultado = (b - a) / 6 * (f(a) + 4*f(m) + f(b))

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 22.0

