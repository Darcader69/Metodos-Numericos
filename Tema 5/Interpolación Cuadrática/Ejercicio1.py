# ==================================================
# INTERPOLACIÓN CUADRÁTICA
# Ejercicio 1
# ==================================================

x0 = 1
x1 = 2
x2 = 4

y0 = 1
y1 = 4
y2 = 16

x = 3

L0 = ((x - x1) * (x - x2)) / ((x0 - x1) * (x0 - x2))
L1 = ((x - x0) * (x - x2)) / ((x1 - x0) * (x1 - x2))
L2 = ((x - x0) * (x - x1)) / ((x2 - x0) * (x2 - x1))

resultado = y0 * L0 + y1 * L1 + y2 * L2

print("Valor interpolado:", resultado)

# Resultado:
# Valor interpolado: 9.0