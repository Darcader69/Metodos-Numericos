# ==================================================
# CORRELACIÓN LINEAL
# Ejercicio 3
# ==================================================

import math

temperatura = [20, 22, 25, 28, 30]
ventas = [100, 120, 150, 180, 200]

n = len(temperatura)

sx = sum(temperatura)
sy = sum(ventas)

sxy = 0
sx2 = 0
sy2 = 0

for i in range(n):
    sxy += temperatura[i] * ventas[i]
    sx2 += temperatura[i] ** 2
    sy2 += ventas[i] ** 2

r = ((n * sxy) - (sx * sy)) / math.sqrt(
    ((n * sx2) - (sx ** 2)) *
    ((n * sy2) - (sy ** 2))
)

print("Coeficiente r =", round(r, 4))

# Resultado:
# r = 0.9984