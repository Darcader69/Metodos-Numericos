# ==================================================
# INTERPOLACIÓN SEGMENTADA
# Ejercicio 3
# ==================================================

anio = [2018, 2020, 2022, 2024]
poblacion = [1200, 1500, 1900, 2400]

buscar = 2021

for i in range(len(anio)-1):

    if anio[i] <= buscar <= anio[i+1]:

        resultado = poblacion[i] + (
            (poblacion[i+1] - poblacion[i]) /
            (anio[i+1] - anio[i])
        ) * (buscar - anio[i])

        break

print("Población estimada:", resultado)

# Resultado:
# Población estimada: 1700.0