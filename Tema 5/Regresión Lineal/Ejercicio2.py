# ==================================================
# REGRESIÓN LINEAL
# Ejercicio 2
# ==================================================

x = [20, 22, 25, 28, 30]
y = [100, 120, 150, 180, 200]

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

# Resultado aproximado:
# y = -106.2903 + 10.4194x