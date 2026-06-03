# ==================================================
# INTERPOLACIÓN CUADRÁTICA
# Ejercicio 2
# ==================================================

horas = [0, 3, 6]
temperatura = [18, 24, 36]

x = 4

L0 = ((x-horas[1])*(x-horas[2])) / (
     (horas[0]-horas[1])*(horas[0]-horas[2]))

L1 = ((x-horas[0])*(x-horas[2])) / (
     (horas[1]-horas[0])*(horas[1]-horas[2]))

L2 = ((x-horas[0])*(x-horas[1])) / (
     (horas[2]-horas[0])*(horas[2]-horas[1]))

resultado = (
    temperatura[0]*L0 +
    temperatura[1]*L1 +
    temperatura[2]*L2
)

print("Temperatura estimada:", resultado)

# Resultado aproximado:
# Temperatura estimada: 27.3333