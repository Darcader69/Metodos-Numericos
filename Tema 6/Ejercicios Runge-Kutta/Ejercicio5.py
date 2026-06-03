# ==================================================
# MÉTODO DE RUNGE-KUTTA DE 4° ORDEN
# Ejercicio 5
# dy/dx = 2x - 3y
# ==================================================

def f(x, y):
    return 2*x - 3*y

x = 0
y = 2

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
#1        0.1     1.49075
#2        0.2     1.130756
#3        0.3     0.881336
#4        0.4     0.713835
#5        0.5     0.60702
#6        0.6     0.545166
#7        0.7     0.516619
#8        0.8     0.512749
#9        0.9     0.527158
#10       1.0     0.555111