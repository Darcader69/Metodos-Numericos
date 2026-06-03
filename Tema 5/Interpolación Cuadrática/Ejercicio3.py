# ==================================================
# INTERPOLACIÓN CUADRÁTICA
# Ejercicio 3
# ==================================================

t = [1, 2, 3]
d = [5, 20, 45]

buscar = 2.5

L0 = ((buscar-t[1])*(buscar-t[2])) / (
     (t[0]-t[1])*(t[0]-t[2]))

L1 = ((buscar-t[0])*(buscar-t[2])) / (
     (t[1]-t[0])*(t[1]-t[2]))

L2 = ((buscar-t[0])*(buscar-t[1])) / (
     (t[2]-t[0])*(t[2]-t[1]))

resultado = d[0]*L0 + d[1]*L1 + d[2]*L2

print("Distancia estimada:", resultado)

# Resultado:
# Distancia estimada: 31.25