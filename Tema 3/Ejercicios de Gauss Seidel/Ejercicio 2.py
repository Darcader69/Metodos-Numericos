print("\nEJERCICIO 2")

x = y = 0
tol = 0.0001

for i in range(50):
    x_anterior = x
    y_anterior = y

    x = (11 - y) / 5
    y = (9 - x) / 4

    error = max(abs(x - x_anterior), abs(y - y_anterior))

    if error < tol:
        break

print("x =", round(x, 4))
print("y =", round(y, 4))

# Resultado:
# x = 1.8421
# y = 1.7895