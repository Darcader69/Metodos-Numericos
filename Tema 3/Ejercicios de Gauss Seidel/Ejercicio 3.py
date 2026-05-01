print("\nEJERCICIO 3")

x = y = z = 0
tol = 0.0001

for i in range(50):
    x_anterior = x
    y_anterior = y
    z_anterior = z

    x = (8 - y + z) / 8
    y = (12 - x - z) / 10
    z = (10 - x + y) / 9

    error = max(abs(x - x_anterior), abs(y - y_anterior), abs(z - z_anterior))

    if error < tol:
        break

print("x =", round(x, 4))
print("y =", round(y, 4))
print("z =", round(z, 4))

# Resultado aproximado:
# x = 1.015
# y = 0.9877
# z = 1.1081