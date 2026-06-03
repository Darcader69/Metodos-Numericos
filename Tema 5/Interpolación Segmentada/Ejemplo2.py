# ==================================================
# INTERPOLACIÓN SEGMENTADA
# Ejercicio 2
# ==================================================

tiempo = [0, 5, 10, 15]
velocidad = [20, 40, 60, 80]

t = 8

for i in range(len(tiempo)-1):

    if tiempo[i] <= t <= tiempo[i+1]:

        v = velocidad[i] + (
            (velocidad[i+1] - velocidad[i]) /
            (tiempo[i+1] - tiempo[i])
        ) * (t - tiempo[i])

        break

print("Velocidad aproximada:", v)

# Resultado:
# Velocidad aproximada: 52.0