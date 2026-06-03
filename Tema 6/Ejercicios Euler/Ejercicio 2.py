# ==================================================
# MÉTODO DE EULER
# Ejercicio 2
# dy/dx = x² - y
# ==================================================

def f(x, y):
    return x**2 - y

x = 0
y = 1

h = 0.2
n = 5

print("Paso\t x\t\t y")

for i in range(n):

    y = y + h * f(x, y)
    x = x + h

    print(i + 1, "\t", round(x,4), "\t", round(y,4))

# Resultado final aproximado:
# Paso     x               y
#1        0.2     0.8
#2        0.4     0.648
#3        0.6     0.5504
#4        0.8     0.5123
#5        1.0     0.5379