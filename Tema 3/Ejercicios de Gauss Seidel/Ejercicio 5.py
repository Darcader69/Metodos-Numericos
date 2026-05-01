print("\nEJERCICIO 5")

x = y = z = 0
tol = 0.0001

for i in range(50):
    x_anterior = x
    y_anterior = y
    z_anterior = z

    x = (11 - y - z) / 9
    y = (10 - x - z) / 8
    z = (9 - x - y) / 7

    error = max(abs(x - x_anterior), abs(y - y_anterior), abs(z - z_anterior))

    if error < tol:
        break

print("x =", round(x, 4))
print("y =", round(y, 4))
print("z =", round(z, 4))

# Resultado aproximado:
# x = 1
# y = 1
# z = 1