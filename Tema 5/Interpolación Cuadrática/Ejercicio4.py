# ==================================================
# INTERPOLACIÓN CUADRÁTICA
# Ejercicio 4
# ==================================================

dias = [1, 2, 4]
produccion = [100, 180, 420]

dia = 3

L0 = ((dia-dias[1])*(dia-dias[2])) / (
     (dias[0]-dias[1])*(dias[0]-dias[2]))

L1 = ((dia-dias[0])*(dia-dias[2])) / (
     (dias[1]-dias[0])*(dias[1]-dias[2]))

L2 = ((dia-dias[0])*(dia-dias[1])) / (
     (dias[2]-dias[0])*(dias[2]-dias[1]))

resultado = (
    produccion[0]*L0 +
    produccion[1]*L1 +
    produccion[2]*L2
)

print("Producción estimada:", resultado)

# Resultado:
# Producción estimada: 290.0