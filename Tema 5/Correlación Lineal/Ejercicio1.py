# ==================================================
# CORRELACIÓN LINEAL
# Ejercicio 1
# ==================================================

import math

x = [1, 2, 3, 4, 5]
y = [2, 4, 5, 4, 5]

n = len(x)

sum_x = sum(x)
sum_y = sum(y)

sum_xy = 0
sum_x2 = 0
sum_y2 = 0

for i in range(n):
    sum_xy += x[i] * y[i]
    sum_x2 += x[i] ** 2
    sum_y2 += y[i] ** 2

numerador = (n * sum_xy) - (sum_x * sum_y)

denominador = math.sqrt(
    ((n * sum_x2) - (sum_x ** 2)) *
    ((n * sum_y2) - (sum_y ** 2))
)

r = numerador / denominador

print("Coeficiente de correlación =", round(r, 4))

# Resultado:
# Coeficiente de correlación = 0.7746