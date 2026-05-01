print("EJERCICIO 1")

def f(x):
    return x**2 + 2*x

a = 0
b = 2
m = (a + b) / 2

resultado = (b - a) / 6 * (f(a) + 4*f(m) + f(b))

print("Integral aproximada =", round(resultado, 4))

# Resultado:
# 6.6667
