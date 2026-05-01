print("EJERCICIO 1")

x = y = z = 0
tol = 0.0001

for i in range(50):
    xn = (12 - y - z) / 10
    yn = (13 - 2*x - z) / 10
    zn = (14 - 2*x - 2*y) / 10

    error = max(abs(xn - x), abs(yn - y), abs(zn - z))

    x, y, z = xn, yn, zn

    if error < tol:
        break

print("x =", round(x, 4))
print("y =", round(y, 4))
print("z =", round(z, 4))

# Resultado:
# x = 1.0
# y = 1.0
# z = 1.0