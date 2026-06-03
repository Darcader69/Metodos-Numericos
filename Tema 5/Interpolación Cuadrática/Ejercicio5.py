# ==================================================
# INTERPOLACIÓN CUADRÁTICA
# Ejercicio 5
# ==================================================

tiempo = [0, 2, 5]
concentracion = [10, 18, 40]

buscar = 3

L0 = ((buscar-tiempo[1])*(buscar-tiempo[2])) / (
     (tiempo[0]-tiempo[1])*(tiempo[0]-tiempo[2]))

L1 = ((buscar-tiempo[0])*(buscar-tiempo[2])) / (
     (tiempo[1]-tiempo[0])*(tiempo[1]-tiempo[2]))

L2 = ((buscar-tiempo[0])*(buscar-tiempo[1])) / (
     (tiempo[2]-tiempo[0])*(tiempo[2]-tiempo[1]))

resultado = (
    concentracion[0]*L0 +
    concentracion[1]*L1 +
    concentracion[2]*L2
)

print("Concentración estimada:", resultado)

# Resultado aproximado:
# Concentración estimada: 24.6667