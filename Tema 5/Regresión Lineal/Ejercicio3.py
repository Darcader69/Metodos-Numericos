# ==================================================
# REGRESIÓN LINEAL
# Ejercicio 3
# ==================================================

x = [5, 6, 7, 8, 9]
y = [50, 62, 69, 80, 92]

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
# y = -2.8000 + 10.3000x