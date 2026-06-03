# ==================================================
# REGRESIÓN LINEAL
# Ejercicio 1
# ==================================================

x = [2, 4, 6, 8, 10]
y = [60, 65, 75, 85, 95]

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

print("Pendiente (b):", round(b, 4))
print("Intercepto (a):", round(a, 4))
print(f"Ecuación: y = {a:.4f} + {b:.4f}x")

# Resultado:
# y = 49.0000 + 4.4000x