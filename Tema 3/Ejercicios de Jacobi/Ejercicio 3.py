print("\nEJERCICIO 3")

x = y = z = 0
tol = 0.0001


for i in range(50):
    xn = (8 - y + z) / 8
    yn = (12 - x - z) / 10
    zn = (10 - x + y) / 9

    error = max(abs(xn - x), abs(yn - y), abs(zn - z))

    x, y, z = xn, yn, zn

    if error < tol:
        break

print("x =", round(x, 4))
print("y =", round(y, 4))
print("z =", round(z, 4))

# Resultado aproximado:
# x = 1.015
# y = 0.9877
# z = 1.1081
