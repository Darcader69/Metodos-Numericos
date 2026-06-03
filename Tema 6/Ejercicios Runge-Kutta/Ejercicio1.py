# ==================================================
# MÉTODO DE RUNGE-KUTTA DE 4° ORDEN
# Ejercicio 1
# dy/dx = x + y
# ==================================================

def f(x, y):
    return x + y

x = 0
y = 1

h = 0.1
n = 10

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
#1        0.1     1.110342
#2        0.2     1.242805
#3        0.3     1.399717
#4        0.4     1.583648
#5        0.5     1.797441
#6        0.6     2.044236
#7        0.7     2.327503
#8        0.8     2.651079
#9        0.9     3.019203
#10       1.0     3.436559