# ==================================================
# REGRESIÓN LINEAL
# Ejercicio 5
# ==================================================

x = [1, 2, 3, 4, 5]
y = [10, 15, 20, 22, 28]

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
# y = 6.9000 + 4.3000x