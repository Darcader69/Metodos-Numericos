# ==================================================
# CORRELACIÓN LINEAL
# Ejercicio 4
# ==================================================

import math

edad = [25, 30, 35, 40, 45]
presion = [118, 121, 128, 130, 137]

n = len(edad)

sx = sum(edad)
sy = sum(presion)

sxy = 0
sx2 = 0
sy2 = 0

for i in range(n):
    sxy += edad[i] * presion[i]
    sx2 += edad[i] ** 2
    sy2 += presion[i] ** 2

r = ((n * sxy) - (sx * sy)) / math.sqrt(
    ((n * sx2) - (sx ** 2)) *
    ((n * sy2) - (sy ** 2))
)

print("Coeficiente r =", round(r, 4))

# Resultado:
# r = 0.9893