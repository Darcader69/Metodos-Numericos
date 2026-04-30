numero = 3.1415926535
truncado = int(numero * 10000) / 10000
error = numero - truncado

print("Número original:", numero)
print("Número truncado a 4 decimales:", truncado)
print("Error generado:", error)

#Número original: 3.1415926535
#Número truncado a 4 decimales: 3.1415
#Error generado: 9.265349999987293e-05