# ==================================================
# MÉTODO DE EULER
# Ejercicio 4
# Enfriamiento de Newton
# ==================================================

def f(t, T):
    return -0.25 * (T - 20)

t = 0
T = 100

h = 1
n = 10

print("Tiempo\t Temperatura")

for i in range(n):

    T = T + h * f(t, T)
    t = t + h

    print(t, "\t", round(T,2))

# Resultado final aproximado:
# Tiempo   Temperatura
#1        80.0
#2        65.0
#3        53.75
#4        45.31
#5        38.98
#6        34.24
#7        30.68
#8        28.01
#9        26.01
#10       24.51