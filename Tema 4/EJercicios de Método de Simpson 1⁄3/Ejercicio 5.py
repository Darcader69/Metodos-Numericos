print("\nEJERCICIO 5")

def f(x):
    return 1 / (1 + x**2)

a = 0
b = 1
m = (a + b) / 2

resultado = (b - a) / 6 * (f(a) + 4*f(m) + f(b))

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 0.7833