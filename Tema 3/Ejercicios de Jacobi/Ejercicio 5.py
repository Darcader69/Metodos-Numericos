print("\nEJERCICIO 5")

x = y = z = 0
tol = 0.0001

for i in range(50):
    xn = (11 - y - z) / 9
    yn = (10 - x - z) / 8
    zn = (9 - x - y) / 7

    error = max(abs(xn - x), abs(yn - y), abs(zn - z))

    x, y, z = xn, yn, zn

    if error < tol:
        break

print("x =", round(x, 4))
print("y =", round(y, 4))
print("z =", round(z, 4))

# Resultado aproximado:
# x = 1
# y = 1
# z = 1