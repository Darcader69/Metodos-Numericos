# ==================================================
# INTERPOLACIÓN SEGMENTADA
# Ejercicio 1
# ==================================================

x = [0, 2, 4, 6]
y = [10, 14, 18, 22]

xp = 3

for i in range(len(x)-1):

    if x[i] <= xp <= x[i+1]:

        yp = y[i] + ((y[i+1] - y[i]) /
                    (x[i+1] - x[i])) * (xp - x[i])

        break

print("Valor interpolado:", yp)

# Resultado:
# Valor interpolado: 16.0