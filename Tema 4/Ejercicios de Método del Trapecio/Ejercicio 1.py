print("MÉTODO DEL TRAPECIO")

def f(x):
    return x**2 + 1

a = 0
b = 2

resultado = (b - a) * (f(a) + f(b)) / 2

print("Integral aproximada =", round(resultado, 6))

# Resultado:
# 6.0