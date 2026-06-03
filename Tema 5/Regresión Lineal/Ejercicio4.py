# ==================================================
# REGRESIÓN LINEAL
# Ejercicio 4
# ==================================================

x = [25, 30, 35, 40, 45]
y = [118, 121, 128, 130, 137]

n = len(x)

sx = sum(x)
sy = sum(y)

sxy = 0
sx2 = 0

for i in range(n):
    sxy += x[i] * y[i]
    sx2 += x[i] ** 2

b = ((n * sxy) - (sx * sy)) / ((n * sx2) - (sx ** 2))
a = (sy - b * sx) / n

print("Pendiente:", round(b, 4))
print("Intercepto:", round(a, 4))
print(f"y = {a:.4f} + {b:.4f}x")

# Resultado:
# y = 93.9000 + 0.9000x