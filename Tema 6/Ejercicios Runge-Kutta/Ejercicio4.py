# ==================================================
# MÉTODO DE RUNGE-KUTTA DE 4° ORDEN
# Ejercicio 4
# dT/dt = -0.25(T - 20)
# ==================================================

def f(t, T):
    return -0.25 * (T - 20)

t = 0
T = 100

h = 1
n = 10

print("Tiempo\t Temperatura")

for i in range(n):

    k1 = h * f(t, T)
    k2 = h * f(t + h/2, T + k1/2)
    k3 = h * f(t + h/2, T + k2/2)
    k4 = h * f(t + h, T + k3)

    T = T + (k1 + 2*k2 + 2*k3 + k4) / 6
    t = t + h

    print(t, "\t", round(T,4))

# Resultado final aproximado:
# Tiempo   Temperatura
#1        82.3047
#2        68.5234
#3        57.7905
#4        49.4315
#5        42.9215
#6        37.8515
#7        33.9029
#8        30.8277
#9        28.4327
#10       26.5675