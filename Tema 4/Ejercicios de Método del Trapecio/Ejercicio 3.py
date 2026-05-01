print("\nEJERCICIO 3")

def f(x):
    return x**2

a = 0
b = 3
n = 6
h = (b - a) / n

suma = f(a) + f(b)

for i in range(1, n):
    suma += 2 * f(a + i*h)

resultado = (h / 2) * suma

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 9.125
