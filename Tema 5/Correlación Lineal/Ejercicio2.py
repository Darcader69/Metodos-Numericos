# ==================================================
# CORRELACIÓN LINEAL
# Ejercicio 2
# ==================================================

import math

horas = [2, 4, 6, 8, 10]
calificacion = [60, 65, 75, 85, 95]

n = len(horas)

sx = sum(horas)
sy = sum(calificacion)

sxy = 0
sx2 = 0
sy2 = 0

for i in range(n):
    sxy += horas[i] * calificacion[i]
    sx2 += horas[i] ** 2
    sy2 += calificacion[i] ** 2

r = ((n * sxy) - (sx * sy)) / math.sqrt(
    ((n * sx2) - (sx ** 2)) *
    ((n * sy2) - (sy ** 2))
)

print("r =", round(r, 4))

# Resultado:
# r = 0.9939