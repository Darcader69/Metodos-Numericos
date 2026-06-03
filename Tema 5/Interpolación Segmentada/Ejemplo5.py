# ==================================================
# INTERPOLACIÓN SEGMENTADA
# Ejercicio 5
# ==================================================

edad = [5, 10, 15, 20]
altura = [110, 140, 165, 175]

edad_buscada = 12

for i in range(len(edad)-1):

    if edad[i] <= edad_buscada <= edad[i+1]:

        altura_estimada = altura[i] + (
            (altura[i+1] - altura[i]) /
            (edad[i+1] - edad[i])
        ) * (edad_buscada - edad[i])

        break

print("Altura estimada:", altura_estimada)

# Resultado:
# Altura estimada: 150.0 cm