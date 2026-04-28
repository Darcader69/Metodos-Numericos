valor_real = 100
valor_aproximado = 96

error_absoluto = abs(valor_real - valor_aproximado)
error_relativo = error_absoluto / valor_real

print("Valor real:", valor_real)
print("Valor aproximado:", valor_aproximado)
print("Error absoluto:", error_absoluto)
print("Error relativo:", error_relativo)

# Resultado:
# Valor real: 100
# Valor aproximado: 96
# Error absoluto: 4
# Error relativo: 0.04