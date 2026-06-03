# ==================================================
# CORRELACIÓN LINEAL
# Ejercicio 5
# ==================================================

import math

horas = [5, 6, 7, 8, 9]
produccion = [50, 62, 69, 80, 92]

n = len(horas)

sx = sum(horas)
sy = sum(produccion)

sxy = 0
sx2 = 0
sy2 = 0

for i in range(n):
    sxy += horas[i] * produccion[i]
    sx2 += horas[i] ** 2
    sy2 += produccion[i] ** 2

numerador = (n * sxy) - (sx * sy)

denominador = math.sqrt(
    ((n * sx2) - (sx ** 2)) *
    ((n * sy2) - (sy ** 2))
)

r = numerador / denominador

print("Coeficiente de correlación =", round(r, 4))

# Resultado:
# Coeficiente de correlación = 0.9978