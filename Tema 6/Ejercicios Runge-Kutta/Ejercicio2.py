# ==================================================
# MÉTODO DE RUNGE-KUTTA DE 4° ORDEN
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

    k1 = h * f(x, y)
    k2 = h * f(x + h/2, y + k1/2)
    k3 = h * f(x + h/2, y + k2/2)
    k4 = h * f(x + h, y + k3)

    y = y + (k1 + 2*k2 + 2*k3 + k4) / 6
    x = x + h

    print(i+1, "\t", round(x,4), "\t", round(y,6))

# Resultado final aproximado:
# Paso     x               y
#1        0.2     0.821273
#2        0.4     0.689688
#3        0.6     0.6112
#4        0.8     0.590686
#5        1.0     0.632138