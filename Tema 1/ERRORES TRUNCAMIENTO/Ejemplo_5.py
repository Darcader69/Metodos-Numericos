a = 5.6789
b = 2.3456

real = a * b

a_t = int(a * 100) / 100
b_t = int(b * 100) / 100

aprox = a_t * b_t

print("Multiplicación real:", real)
print("Multiplicación truncada:", aprox)
print("Error:", abs(real - aprox))


# Multiplicación real: 13.32042784
# Multiplicación truncada: 13.2678
# Error: 0.052627840000001314