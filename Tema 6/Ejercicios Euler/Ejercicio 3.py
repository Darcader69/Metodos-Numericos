# ==================================================
# MÉTODO DE EULER
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

    y = y + h * f(x, y)
    x = x + h

    print(round(x,2), "\t", round(y,2))

# Resultado final aproximado:
# Tiempo   Población
#0.5      125.0
#1.0      156.25
#1.5      195.31
#2.0      244.14
#2.5      305.18
#3.0      381.47
#3.5      476.84
#4.0      596.05