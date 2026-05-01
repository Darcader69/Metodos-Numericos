print("\nEJERCICIO 5")

def f(x):
    return 1 / (1 + x**2)

a = 0
b = 1

resultado = (b - a) * (f(a) + f(b)) / 2

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 0.75