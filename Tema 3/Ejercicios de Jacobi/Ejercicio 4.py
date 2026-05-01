print("\nEJERCICIO 4")

x = y = 0
tol = 0.0001

for i in range(50):
    xn = (19 - y) / 6
    yn = (20 - x) / 7

    error = max(abs(xn - x), abs(yn - y))

    x, y = xn, yn

    if error < tol:
        break

print("x =", round(x, 4))
print("y =", round(y, 4))

# Resultado:
# x = 2.7561
# y = 2.4634
