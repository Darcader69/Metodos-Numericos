# ==================================================
# INTERPOLACIÓN SEGMENTADA
# Ejercicio 4
# ==================================================

x = [1, 3, 5, 7, 9]
y = [2, 8, 12, 20, 26]

xp = 6

for i in range(len(x)-1):

    if x[i] <= xp <= x[i+1]:

        yp = y[i] + (
            (y[i+1] - y[i]) /
            (x[i+1] - x[i])
        ) * (xp - x[i])

        break

print("Resultado interpolado:", yp)

# Resultado:
# Resultado interpolado: 16.0