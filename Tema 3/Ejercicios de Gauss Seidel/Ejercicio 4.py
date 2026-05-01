print("\nEJERCICIO 4")

x = y = 0
tol = 0.0001

for i in range(50):
    x_anterior = x
    y_anterior = y

    x = (19 - y) / 6
    y = (20 - x) / 7

    error = max(abs(x - x_anterior), abs(y - y_anterior))

    if error < tol:
        break

print("x =", round(x, 4))
print("y =", round(y, 4))

# Resultado:
# x = 2.7561
# y = 2.4634