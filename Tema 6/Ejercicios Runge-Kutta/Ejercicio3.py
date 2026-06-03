# ==================================================
# MÉTODO DE RUNGE-KUTTA DE 4° ORDEN
# Ejercicio 3
# dy/dx = 0.5y
# ==================================================

def f(x, y):
    return 0.5 * y

x = 0
y = 100

h = 0.5
n = 8

print("Tiempo\t Población")

for i in range(n):

    k1 = h * f(x, y)
    k2 = h * f(x + h/2, y + k1/2)
    k3 = h * f(x + h/2, y + k2/2)
    k4 = h * f(x + h, y + k3)

    y = y + (k1 + 2*k2 + 2*k3 + k4) / 6
    x = x + h

    print(round(x,2), "\t", round(y,4))

# Resultado final aproximado:
# Tiempo   Población
#0.5      128.4017
#1.0      164.8699
#1.5      211.6958
#2.0      271.821
#2.5      349.0228
#3.0      448.1511
#3.5      575.4336
#4.0      738.8665