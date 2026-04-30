resultado_real = 10 / 3
resultado_truncado = int(resultado_real * 100) / 100
error = resultado_real - resultado_truncado

print("Resultado real:", resultado_real)
print("Resultado truncado:", resultado_truncado)
print("Error:", error)


# Resultado real: 3.3333333333
# Resultado truncado: 3.33
# Error: 0.0033333333333334103