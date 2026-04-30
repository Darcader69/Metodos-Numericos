numero = 7.987654

for i in range(1, 5):
    truncado = int(numero * (10 ** i)) / (10 ** i)
    print("Truncado a", i, "decimales:", truncado)

# Truncado a 1 decimales: 7.9
# Truncado a 2 decimales: 7.98
# Truncado a 3 decimales: 7.987
# Truncado a 4 decimales: 7.9876
